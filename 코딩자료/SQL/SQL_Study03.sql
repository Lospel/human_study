-- day02_afternoon.sql
-- 92번째 라인

create or replace procedure my_new_job_proc
( p_job_id in jobs.job_id%type
, p_job_title in jobs.job_title%type
, p_min_sal in jobs.min_salary%type
, p_max_sal in jobs.max_salary%type )
is
begin
    insert into jobs
    ( job_id, job_title, min_salary, max_salary
    , create_date, update_date)
    values (p_job_id, p_job_title, p_min_sal, p_max_sal
    , sysdate, sysdate);
    commit;
end;
/

-- 프로시저 실행
select * from jobs;
exec my_new_job_proc('SM_JOB1', 'Sample JOB1', 1000, 5000);

-- 회원가입 페이지
-- 중복 ID가 있으면 안됨
-- 일반적으로 스프링쪽에서 개발 vs DB쪽에서 개발

create or replace procedure my_new_job_proc
( p_job_id in jobs.job_id%type
, p_job_title in jobs.job_title%type
, p_min_sal in jobs.min_salary%type
, p_max_sal in jobs.max_salary%type )
is
    vn_cnt number := 0;
begin
    -- 동일한 job_id가 있는지 체크
    SELECT count(*) into vn_cnt
    from jobs
    where job_id = p_job_id;
    
    -- 0이면 없다. -> insert
    if vn_cnt = 0 then
        insert into jobs
        ( job_id, job_title, min_salary, max_salary
        , create_date, update_date)
        values (p_job_id, p_job_title, p_min_sal, p_max_sal
        , sysdate, sysdate);

    else -- 있으면 update
        update jobs
            set job_title = p_job_title,
                min_salary = p_min_sal,
                max_salary = p_max_sal,
                update_date = sysdate
        where job_id = p_job_id;
    end if;
        commit;
end;
/

exec my_new_job_proc('SM_JOB1', 'Sample JOB1', 1000, 5000);
select * from jobs;

-- 매개변수의 디폴트 값 설정
create or replace procedure my_new_job_proc
( p_job_id in jobs.job_id%type
, p_job_title in jobs.job_title%type
, p_min_sal in jobs.min_salary%type := 10
, p_max_sal in jobs.max_salary%type := 1000
)
is
    vn_cnt number := 0;
begin
    -- 동일한 job_id가 있는지 체크
    SELECT count(*) into vn_cnt
    from jobs
    where job_id = p_job_id;
    
    -- 0이면 없다. -> insert
    if vn_cnt = 0 then
        insert into jobs
        ( job_id, job_title, min_salary, max_salary
        , create_date, update_date)
        values (p_job_id, p_job_title, p_min_sal, p_max_sal
        , sysdate, sysdate);

    else -- 있으면 update
        update jobs
            set job_title = p_job_title,
                min_salary = p_min_sal,
                max_salary = p_max_sal,
                update_date = sysdate
        where job_id = p_job_id;
    end if;
        commit;
end;
/

exec my_new_job_proc('SM_JOB1', 'Sample JOB1');
select * from jobs;

-- IN / OUT / IN OUT 매개변수 이해
-- 270라인
set SERVEROUTPUT on
create or replace PROCEDURE my_parameter_test_proc(
    p_var1 varchar2
    , p_var2 out varchar2
    , p_var3 in out varchar2
)
is
begin
    dbms_output.put_line('p_var1 value = ' || p_var1);
    dbms_output.put_line('p_var2 value = ' || p_var2);
    dbms_output.put_line('p_var3 value = ' || p_var3);

    p_var2 := 'B2';
    p_var3 := 'C2';
end;
/

-- 익명블록 테스트
declare
    v_var1 varchar2(10) := 'A';
    v_var2 varchar2(10) := 'B';
    v_var3 varchar2(10) := 'C';

begin
    my_parameter_test_proc(v_var1,v_var2,v_var3);
    dbms_output.put_line('v_var2 value = ' || v_var2);
    dbms_output.put_line('v_var3 value = ' || v_var3);    
end;
/

-- return문
-- 300라인
-- 프로시저에서의 return문은 종료를 의미. 함수와 다름(반환).
create OR replace procedure my_new_job_proc(
    p_job_id in jobs.job_id%TYPE
    , p_job_title in jobs.job_title%TYPE
    , p_min_sal in jobs.min_salary%type := 10
    , p_max_sal in jobs.max_salary%type := 100
)
is 
    vn_cnt number := 0;
    vn_cur_date jobs.update_date%type := sysdate;  
begin
    -- 1000보다 작으면 메시지 출력 후 빠져나가기
    if p_min_sal <1000 then
        dbms_output.put_line('최소 급여값은 1000이상이어야 함');
        return;
    end if;
    commit;
end;
/

exec my_new_job_proc('SM_JOB1', 'Sample JOB1', 900, 50000);
select * from jobs;

-- 예외처리
-- 374라인
create or replace procedure no_exception_proc
is
    vi_num number := 0;
begin
    vi_num := 10/0;
    dbms_output.put_line('Success!');
end;
/
create or replace procedure exception_proc
is
    vi_num number := 0;
begin
    vi_num := 10/0;
    dbms_output.put_line('Success!');
exception when others then
    dbms_output.put_line('오류가 발생했습니다.');
end;
/
-- 예외 처리가 없는 프로시저 실행
declare
begin
    --no_exception_proc;
    exception_proc;
    dbms_output.put_line('실행!');
end;
/

-- 예외처리 업그레이드
create or replace procedure exception_proc
is
    vi_num number := 0;
begin
    vi_num := 10/ 0;
    dbms_output.put_line('Success!');
--exception when others then
exception when zero_divide then -- 오류를 명확하게 구분하기 위해서.
        dbms_output.put_line('zero_divide 발생');
        dbms_output.put_line('SQL ERROR CODE:'  || SQLCODE);
        dbms_output.put_line('SQL ERROR MESSAGE:'  || SQLERRM);
    when others then
        dbms_output.put_line('다른 에러 발생');
        dbms_output.put_line('SQL ERROR CODE:'  || SQLCODE);
        dbms_output.put_line('SQL ERROR MESSAGE:'  || SQLERRM);
end;
/

exec exception_proc;

-- 교재 727라인 ~ 833라인
-- 효율적인 예외 처리 방법
-- 첫번째, 에러로그 테이블 생성
CREATE TABLE error_log_tb (
                 error_seq     NUMBER,              -- 에러 시퀀스
                 prog_name     VARCHAR2(80),        -- 프로그램명
                 error_code    NUMBER,              -- 에러코드
                 error_message VARCHAR2(300),       -- 에러 메시지
                 error_line    VARCHAR2(100),       -- 에러 라인
                 error_date    DATE DEFAULT SYSDATE -- 에러발생일자
);

-- 더 필요한 정보가 있으면 해당 컬럼을 추가한다. 
-- CREATE SEQUENCE를 사용한다. (자동증가, 일련번호)
CREATE SEQUENCE error_seq
           INCREMENT BY 1
           START WITH 1
           MINVALUE 1
           MAXVALUE 999999
           NOCYCLE
           NOCACHE;

-- 예외가 발생할 때, 예외 로그 테이블에 에러 정보를 입력하는 프로시저를 생성한다. 
CREATE OR REPLACE PROCEDURE error_log_proc (
      p_prog_name error_log_tb.prog_name%TYPE,
      p_error_code error_log_tb.error_code%TYPE,
      p_error_messgge error_log_tb.error_message%TYPE,
      p_error_line error_log_tb.error_line%TYPE)
    IS

    BEGIN
      INSERT INTO error_log_tb (error_seq, prog_name, error_code, error_message, error_line)
           VALUES (error_seq.NEXTVAL, p_prog_name, p_error_code, p_error_messgge, p_error_line );

      COMMIT;
END;

-- 이제 익명 블록이나 다른 프로시저에서 예외가 발생했을 때, 예외처리 부분에서 위 프로시저를 호출한다. 
CREATE OR REPLACE PROCEDURE ins_emp2_proc ( 
                  p_emp_name       employees.emp_name%TYPE,
                  p_department_id  departments.department_id%TYPE,
                  p_hire_month  VARCHAR2  )
IS
   vn_employee_id  employees.employee_id%TYPE;
   vd_curr_date    DATE := SYSDATE;
   vn_cnt          NUMBER := 0;
   
   ex_invalid_depid EXCEPTION; -- 잘못된 부서번호일 경우 예외 정의
   PRAGMA EXCEPTION_INIT(ex_invalid_depid, -20000); -- 예외명과 예외코드 연결
   
   ex_invalid_month EXCEPTION; -- 잘못된 입사월인 경우 예외 정의
   PRAGMA EXCEPTION_INIT (ex_invalid_month, -1843); -- 예외명과 예외코드 연결
   
   -- 예외 관련 변수 선언
   v_err_code error_log_tb.error_code%TYPE;
   v_err_msg error_log_tb.error_message%TYPE;
   v_err_line error_log_tb.error_line%TYPE;
   
BEGIN
	
	 -- 부서테이블에서 해당 부서번호 존재유무 체크
	 SELECT COUNT(*)
	   INTO vn_cnt
	   FROM departments
	  WHERE department_id = p_department_id;
	  
	 IF vn_cnt = 0 THEN
	    RAISE ex_invalid_depid; -- 사용자 정의 예외 발생
	 END IF;
	 
	 -- 입사월 체크 (1~12월 범위를 벗어났는지 체크)
	 IF SUBSTR(p_hire_month, 5, 2) NOT BETWEEN '01' AND '12' THEN
	    RAISE ex_invalid_month; -- 사용자 정의 예외 발생
	 
	 END IF;
	 
	 -- employee_id의 max 값에 +1
	 SELECT MAX(employee_id) + 1
	   INTO vn_employee_id
	   FROM employees;
	 
	 -- 사용자예외처리 예제이므로 사원 테이블에 최소한 데이터만 입력함
	 INSERT INTO employees ( employee_id, emp_name, hire_date, department_id )
              VALUES (vn_employee_id, p_emp_name, TO_DATE(p_hire_month || '01'), p_department_id );
              
     COMMIT;              
              
EXCEPTION WHEN ex_invalid_depid THEN -- 사용자 정의 예외 처리
    v_err_code := SQLCODE;
    v_err_msg  := '해당 부서가 없습니다';
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
WHEN ex_invalid_month THEN -- 입사월 사용자 정의 예외 처리
    v_err_code := SQLCODE;
    v_err_msg  := SQLERRM;
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
WHEN OTHERS THEN
    v_err_code := SQLCODE;
    v_err_msg  := SQLERRM;
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
END;
/
-- 부서번호 잘못 입력
EXEC ins_emp2_proc('HONG', 1000, '201401');

-- 잘못된 월
EXEC ins_emp2_proc('EVAN', 100, '202213');

-- 에러 로그 테이블 확인
SELECT * FROM error_log_tb;

-- 트리거
create table exam1(
    id number primary key
    , name varchar2(20)  
);

create table exam2(
    log varchar2(100)
    , regdate date default sysdate
);

-- 상황 1. exam1 테이블에 간단하게 insert문 추가
-- exam2에 해당 로그 기록을 남김

create or replace trigger trig_insert_exam2
after 
    insert on exam1
begin
    insert into exam2(log) values ('추가작업 - 로그');
end;
/

insert into exam1 values (100, '홍길동');

select * from exam1; -- insert 내용
select * from exam2; -- insert log 기록

create or replace trigger trig_insert_exam2
after
    insert or update or delete on exam1
declare
    v_msg varchar2(100);
begin
    -- 조건 술어 (conditional predicate)
    if inserting then
        v_msg := '> 추가 작업 - 로그';
    elsif updating then
        v_msg := '> 수정 작업 - 로그';
    elsif deleting then
        v_msg := '> 삭제 작업 - 로그';
    end if;
    insert into exam2(log) values(v_msg);
end;
/
insert into exam1 values (101,'김길동');
update exam1 set name='김길동' where id = 100;
delete from exam1 where id = 100;

select * from exam1;
select * from exam2;

- 개발된 좋아요 버튼 클릭 시 --> 좋아요 갯수가 늘어나는 트리거
-- 근무시간 외에는 작업을 못하도록 시스템에 메시지를 띄움

-- 예) 데이터를 추가한 후, 근무시간이 아닙니다! 
-- 데이터를 추가하기 전에 근무시간이 아닙니다! 
CREATE OR REPLACE TRIGGER trig_stopexec
BEFORE 
    INSERT OR UPDATE OR DELETE ON exam1 
BEGIN 
    IF SYSDATE = SYSDATE THEN 
        raise_application_error(-20001, '지금은 근무시간이 아닙니다.');
    END IF;
END;
/

INSERT INTO exam1 VALUES(1004, '지금은');

SELECT * FROM exam1;