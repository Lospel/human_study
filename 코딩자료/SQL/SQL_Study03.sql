-- day02_afternoon.sql
-- 92��° ����

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

-- ���ν��� ����
select * from jobs;
exec my_new_job_proc('SM_JOB1', 'Sample JOB1', 1000, 5000);

-- ȸ������ ������
-- �ߺ� ID�� ������ �ȵ�
-- �Ϲ������� �������ʿ��� ���� vs DB�ʿ��� ����

create or replace procedure my_new_job_proc
( p_job_id in jobs.job_id%type
, p_job_title in jobs.job_title%type
, p_min_sal in jobs.min_salary%type
, p_max_sal in jobs.max_salary%type )
is
    vn_cnt number := 0;
begin
    -- ������ job_id�� �ִ��� üũ
    SELECT count(*) into vn_cnt
    from jobs
    where job_id = p_job_id;
    
    -- 0�̸� ����. -> insert
    if vn_cnt = 0 then
        insert into jobs
        ( job_id, job_title, min_salary, max_salary
        , create_date, update_date)
        values (p_job_id, p_job_title, p_min_sal, p_max_sal
        , sysdate, sysdate);

    else -- ������ update
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

-- �Ű������� ����Ʈ �� ����
create or replace procedure my_new_job_proc
( p_job_id in jobs.job_id%type
, p_job_title in jobs.job_title%type
, p_min_sal in jobs.min_salary%type := 10
, p_max_sal in jobs.max_salary%type := 1000
)
is
    vn_cnt number := 0;
begin
    -- ������ job_id�� �ִ��� üũ
    SELECT count(*) into vn_cnt
    from jobs
    where job_id = p_job_id;
    
    -- 0�̸� ����. -> insert
    if vn_cnt = 0 then
        insert into jobs
        ( job_id, job_title, min_salary, max_salary
        , create_date, update_date)
        values (p_job_id, p_job_title, p_min_sal, p_max_sal
        , sysdate, sysdate);

    else -- ������ update
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

-- IN / OUT / IN OUT �Ű����� ����
-- 270����
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

-- �͸��� �׽�Ʈ
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

-- return��
-- 300����
-- ���ν��������� return���� ���Ḧ �ǹ�. �Լ��� �ٸ�(��ȯ).
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
    -- 1000���� ������ �޽��� ��� �� ����������
    if p_min_sal <1000 then
        dbms_output.put_line('�ּ� �޿����� 1000�̻��̾�� ��');
        return;
    end if;
    commit;
end;
/

exec my_new_job_proc('SM_JOB1', 'Sample JOB1', 900, 50000);
select * from jobs;

-- ����ó��
-- 374����
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
    dbms_output.put_line('������ �߻��߽��ϴ�.');
end;
/
-- ���� ó���� ���� ���ν��� ����
declare
begin
    --no_exception_proc;
    exception_proc;
    dbms_output.put_line('����!');
end;
/

-- ����ó�� ���׷��̵�
create or replace procedure exception_proc
is
    vi_num number := 0;
begin
    vi_num := 10/ 0;
    dbms_output.put_line('Success!');
--exception when others then
exception when zero_divide then -- ������ ��Ȯ�ϰ� �����ϱ� ���ؼ�.
        dbms_output.put_line('zero_divide �߻�');
        dbms_output.put_line('SQL ERROR CODE:'  || SQLCODE);
        dbms_output.put_line('SQL ERROR MESSAGE:'  || SQLERRM);
    when others then
        dbms_output.put_line('�ٸ� ���� �߻�');
        dbms_output.put_line('SQL ERROR CODE:'  || SQLCODE);
        dbms_output.put_line('SQL ERROR MESSAGE:'  || SQLERRM);
end;
/

exec exception_proc;

-- ���� 727���� ~ 833����
-- ȿ������ ���� ó�� ���
-- ù��°, �����α� ���̺� ����
CREATE TABLE error_log_tb (
                 error_seq     NUMBER,              -- ���� ������
                 prog_name     VARCHAR2(80),        -- ���α׷���
                 error_code    NUMBER,              -- �����ڵ�
                 error_message VARCHAR2(300),       -- ���� �޽���
                 error_line    VARCHAR2(100),       -- ���� ����
                 error_date    DATE DEFAULT SYSDATE -- �����߻�����
);

-- �� �ʿ��� ������ ������ �ش� �÷��� �߰��Ѵ�. 
-- CREATE SEQUENCE�� ����Ѵ�. (�ڵ�����, �Ϸù�ȣ)
CREATE SEQUENCE error_seq
           INCREMENT BY 1
           START WITH 1
           MINVALUE 1
           MAXVALUE 999999
           NOCYCLE
           NOCACHE;

-- ���ܰ� �߻��� ��, ���� �α� ���̺� ���� ������ �Է��ϴ� ���ν����� �����Ѵ�. 
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

-- ���� �͸� ����̳� �ٸ� ���ν������� ���ܰ� �߻����� ��, ����ó�� �κп��� �� ���ν����� ȣ���Ѵ�. 
CREATE OR REPLACE PROCEDURE ins_emp2_proc ( 
                  p_emp_name       employees.emp_name%TYPE,
                  p_department_id  departments.department_id%TYPE,
                  p_hire_month  VARCHAR2  )
IS
   vn_employee_id  employees.employee_id%TYPE;
   vd_curr_date    DATE := SYSDATE;
   vn_cnt          NUMBER := 0;
   
   ex_invalid_depid EXCEPTION; -- �߸��� �μ���ȣ�� ��� ���� ����
   PRAGMA EXCEPTION_INIT(ex_invalid_depid, -20000); -- ���ܸ�� �����ڵ� ����
   
   ex_invalid_month EXCEPTION; -- �߸��� �Ի���� ��� ���� ����
   PRAGMA EXCEPTION_INIT (ex_invalid_month, -1843); -- ���ܸ�� �����ڵ� ����
   
   -- ���� ���� ���� ����
   v_err_code error_log_tb.error_code%TYPE;
   v_err_msg error_log_tb.error_message%TYPE;
   v_err_line error_log_tb.error_line%TYPE;
   
BEGIN
	
	 -- �μ����̺��� �ش� �μ���ȣ �������� üũ
	 SELECT COUNT(*)
	   INTO vn_cnt
	   FROM departments
	  WHERE department_id = p_department_id;
	  
	 IF vn_cnt = 0 THEN
	    RAISE ex_invalid_depid; -- ����� ���� ���� �߻�
	 END IF;
	 
	 -- �Ի�� üũ (1~12�� ������ ������� üũ)
	 IF SUBSTR(p_hire_month, 5, 2) NOT BETWEEN '01' AND '12' THEN
	    RAISE ex_invalid_month; -- ����� ���� ���� �߻�
	 
	 END IF;
	 
	 -- employee_id�� max ���� +1
	 SELECT MAX(employee_id) + 1
	   INTO vn_employee_id
	   FROM employees;
	 
	 -- ����ڿ���ó�� �����̹Ƿ� ��� ���̺� �ּ��� �����͸� �Է���
	 INSERT INTO employees ( employee_id, emp_name, hire_date, department_id )
              VALUES (vn_employee_id, p_emp_name, TO_DATE(p_hire_month || '01'), p_department_id );
              
     COMMIT;              
              
EXCEPTION WHEN ex_invalid_depid THEN -- ����� ���� ���� ó��
    v_err_code := SQLCODE;
    v_err_msg  := '�ش� �μ��� �����ϴ�';
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
WHEN ex_invalid_month THEN -- �Ի�� ����� ���� ���� ó��
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
-- �μ���ȣ �߸� �Է�
EXEC ins_emp2_proc('HONG', 1000, '201401');

-- �߸��� ��
EXEC ins_emp2_proc('EVAN', 100, '202213');

-- ���� �α� ���̺� Ȯ��
SELECT * FROM error_log_tb;

-- Ʈ����
create table exam1(
    id number primary key
    , name varchar2(20)  
);

create table exam2(
    log varchar2(100)
    , regdate date default sysdate
);

-- ��Ȳ 1. exam1 ���̺� �����ϰ� insert�� �߰�
-- exam2�� �ش� �α� ����� ����

create or replace trigger trig_insert_exam2
after 
    insert on exam1
begin
    insert into exam2(log) values ('�߰��۾� - �α�');
end;
/

insert into exam1 values (100, 'ȫ�浿');

select * from exam1; -- insert ����
select * from exam2; -- insert log ���

create or replace trigger trig_insert_exam2
after
    insert or update or delete on exam1
declare
    v_msg varchar2(100);
begin
    -- ���� ���� (conditional predicate)
    if inserting then
        v_msg := '> �߰� �۾� - �α�';
    elsif updating then
        v_msg := '> ���� �۾� - �α�';
    elsif deleting then
        v_msg := '> ���� �۾� - �α�';
    end if;
    insert into exam2(log) values(v_msg);
end;
/
insert into exam1 values (101,'��浿');
update exam1 set name='��浿' where id = 100;
delete from exam1 where id = 100;

select * from exam1;
select * from exam2;

- ���ߵ� ���ƿ� ��ư Ŭ�� �� --> ���ƿ� ������ �þ�� Ʈ����
-- �ٹ��ð� �ܿ��� �۾��� ���ϵ��� �ý��ۿ� �޽����� ���

-- ��) �����͸� �߰��� ��, �ٹ��ð��� �ƴմϴ�! 
-- �����͸� �߰��ϱ� ���� �ٹ��ð��� �ƴմϴ�! 
CREATE OR REPLACE TRIGGER trig_stopexec
BEFORE 
    INSERT OR UPDATE OR DELETE ON exam1 
BEGIN 
    IF SYSDATE = SYSDATE THEN 
        raise_application_error(-20001, '������ �ٹ��ð��� �ƴմϴ�.');
    END IF;
END;
/

INSERT INTO exam1 VALUES(1004, '������');

SELECT * FROM exam1;