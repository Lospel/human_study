-- PL/SQL / day02_morning.sql
-- 익명블록
set serveroutput on

declare
    vi_num number;
begin
    vi_num := 100;
    dbms_output.put_line('vi_num = ' || to_char(vi_num));
end;
/

-- 교재 38라인
-- DML
-- 사원 ID가 100인 사원의 이름명, 부서명을 조회해라

DECLARE
    vs_emp_name varchar2(80); -- 사원명 변수
    vs_dep_name varchar2(80); -- 부서명 변수
BEGIN
    select a.emp_name, b.department_name
        into vs_emp_name, vs_dep_name
    from employees a, departments b
    where a.department_id = b.department_id
        and a.employee_id = 100;
        
    dbms_output.put_line(vs_emp_name || ' - ' || vs_dep_name);

end;
/

-- 두 개의 숫자를 입력받아서 출력하는 예제
accept p_num1 prompt '첫번째 숫자를 입력하세요.'
accept p_num2 prompt '두번째 숫자를 입력하세요.'

DECLARE
    v_sum number(10);
begin
    v_sum := &p_num1 + &p_num2;
    dbms_output.put_line('총합은 : ' || to_char(v_sum));
end;
/

select * from employees;
-- 문제 : 임의의 사원번호를 입력하면 employees 테이블에서 해당 사원번호의 급여를 출력해라.
accept p_num1 prompt '사원번호를 입력하세요.'

DECLARE
    v_salary number;
begin
    select salary
        into v_salary
    from employees
    where employee_id = &p_num1;
 
    dbms_output.put_line('해당 사원번호의 급여는 : ' || v_salary);
end;
/
accept p_num prompt '숫자를 입력하세요.'

begin
    if mod(&p_num, 2) = 0 then
        dbms_output.put_line('짝수입니다.');
    else
        dbms_output.put_line('홀수입니다.');
    end if;
end;
/

-- 고소득자, 중간 소득자, 저소득자 구분하는 익명블록 만들기
-- 임의의 사원번호
accept p_num1 prompt '사원번호를 입력하세요.'

DECLARE
--    v_salary number;
    v_salary employees.salary%type;
begin
    select salary
        into v_salary
    from employees
    where employee_id = &p_num1;
    dbms_output.put_line('해당 사원번호의 급여는 : ' || v_salary);
    if v_salary >= 5000 then
        dbms_output.put_line('고소득자');
    elsif v_salary >= 3000 then
        dbms_output.put_line('중간 소득자');
    else
        dbms_output.put_line('저소득자');
    end if;
end;
/

-- 문제
-- 사원 테이블에서 사원번호가 제일 큰 사원을 찾아낸 뒤,
-- 이 번호 +1번으로 아래의 사원을 사원테에블에 신규 입력하는 익명 블록을 만들어 보자.
/*
<사원명> : Harrison Ford
<이메일> : HARRIS
<입사일자> : 현재일자
<부서번호> : 50
*/
declare
    vn_max_empno employees.employee_id%type;
begin
    select max(employee_id) into vn_max_empno from employees;
    
    insert into employees (EMPLOYEE_ID, EMP_NAME, EMAIL, HIRE_DATE, DEPARTMENT_ID)
        values (vn_max_empno +1, 'Harrison Ford', 'HARRIS', sysdate, 50);
    
    commit;
end;
/

select * from employees order by employee_id desc;

-- 반복문
-- 303번째 라인부터 시작
-- Loop문 3단 곱하기 작성
DECLARE 
    vn_base_num number := 3;
    vn_cnt number := 1;
begin 
    loop
        dbms_output.put_line(vn_base_num || '*' || vn_cnt || ' = ' || vn_base_num * vn_cnt);
        vn_cnt := vn_cnt +1;
    exit when vn_cnt > 9;
    end loop;
end;
/

-- while 문
declare
    vn_base_num number := 3;
    vn_cnt number := 1;
begin
    while vn_cnt <= 9 -- vn_cnt 가 9보다 작거나 같을 경우 처리
    loop
        dbms_output.put_line(vn_base_num || '*' || vn_cnt || ' = ' || vn_base_num * vn_cnt);
        vn_cnt := vn_cnt +1;
    end loop;
end;
/

-- for loop
declare
    vn_base_num number := 6;
begin
    for i in 1..9 -- 1~9까지 반복문 실행.
    loop
        dbms_output.put_line(vn_base_num || '*' || i || ' = ' || vn_base_num * i);
        exit when i = 5;
    end loop;
end;
/

-- 나머지와 몫, 나머지를 반환하는 함수
create or replace function my_mod(num1 number, num2 number)
    return number -- 반환 데이터타입 지정
is
    -- 변수 선언
    vn_remainder number := 0; -- 반환할 나머지
    vn_quotient number := 0; -- 몫
begin
    -- 수식 작성
    vn_quotient := floor(num1/num2); -- 피제수 / 제수 정수 부분 걸러내기
    vn_remainder := num1 - (num2 * vn_quotient); -- 나머지 = 피제수 - (제수*몫)
    return vn_remainder; -- 나머지 반환
end;
/

select my_mod(14,3) as remainder from dual;

-- 국가명을 반환하는 함수 작성
-- 52790 미국, 52784 네덜란드, 52775 브라질
select * from countries;

create or replace function fn_get_country_name (p_country_id number)
    return varchar2
is
    vs_country_name countries.COUNTRY_NAME%TYPE;
begin
    select COUNTRY_NAME into vs_country_name
    from countries
    where COUNTRY_ID = p_country_id;
    
    return vs_country_name; -- 국가명 반환
end;
/
select
    fn_get_country_name(52790) country1
    , fn_get_country_name(52784) country2
from dual;

create or replace function fn_get_country_name (p_country_id number)
    return varchar2
is
    vs_country_name countries.COUNTRY_NAME%TYPE;
    vn_count number := 0;
begin
    select count(*) into vn_count
    from countries
    where country_id = p_country_id;
    -- dbms
    if vn_count = 0 then
        vs_country_name := '국가 없음';
    else
        select COUNTRY_NAME into vs_country_name
        from countries
        where COUNTRY_ID = p_country_id;
    end if;
    return vs_country_name; -- 국가명 반환
end;
/
select
    fn_get_country_name(0) country1
    , fn_get_country_name(52784) country2
from dual;