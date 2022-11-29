-- PL/SQL / day02_morning.sql
-- �͸���
set serveroutput on

declare
    vi_num number;
begin
    vi_num := 100;
    dbms_output.put_line('vi_num = ' || to_char(vi_num));
end;
/

-- ���� 38����
-- DML
-- ��� ID�� 100�� ����� �̸���, �μ����� ��ȸ�ض�

DECLARE
    vs_emp_name varchar2(80); -- ����� ����
    vs_dep_name varchar2(80); -- �μ��� ����
BEGIN
    select a.emp_name, b.department_name
        into vs_emp_name, vs_dep_name
    from employees a, departments b
    where a.department_id = b.department_id
        and a.employee_id = 100;
        
    dbms_output.put_line(vs_emp_name || ' - ' || vs_dep_name);

end;
/

-- �� ���� ���ڸ� �Է¹޾Ƽ� ����ϴ� ����
accept p_num1 prompt 'ù��° ���ڸ� �Է��ϼ���.'
accept p_num2 prompt '�ι�° ���ڸ� �Է��ϼ���.'

DECLARE
    v_sum number(10);
begin
    v_sum := &p_num1 + &p_num2;
    dbms_output.put_line('������ : ' || to_char(v_sum));
end;
/

select * from employees;
-- ���� : ������ �����ȣ�� �Է��ϸ� employees ���̺��� �ش� �����ȣ�� �޿��� ����ض�.
accept p_num1 prompt '�����ȣ�� �Է��ϼ���.'

DECLARE
    v_salary number;
begin
    select salary
        into v_salary
    from employees
    where employee_id = &p_num1;
 
    dbms_output.put_line('�ش� �����ȣ�� �޿��� : ' || v_salary);
end;
/
accept p_num prompt '���ڸ� �Է��ϼ���.'

begin
    if mod(&p_num, 2) = 0 then
        dbms_output.put_line('¦���Դϴ�.');
    else
        dbms_output.put_line('Ȧ���Դϴ�.');
    end if;
end;
/

-- ��ҵ���, �߰� �ҵ���, ���ҵ��� �����ϴ� �͸��� �����
-- ������ �����ȣ
accept p_num1 prompt '�����ȣ�� �Է��ϼ���.'

DECLARE
--    v_salary number;
    v_salary employees.salary%type;
begin
    select salary
        into v_salary
    from employees
    where employee_id = &p_num1;
    dbms_output.put_line('�ش� �����ȣ�� �޿��� : ' || v_salary);
    if v_salary >= 5000 then
        dbms_output.put_line('��ҵ���');
    elsif v_salary >= 3000 then
        dbms_output.put_line('�߰� �ҵ���');
    else
        dbms_output.put_line('���ҵ���');
    end if;
end;
/

-- ����
-- ��� ���̺��� �����ȣ�� ���� ū ����� ã�Ƴ� ��,
-- �� ��ȣ +1������ �Ʒ��� ����� ����׿��� �ű� �Է��ϴ� �͸� ����� ����� ����.
/*
<�����> : Harrison Ford
<�̸���> : HARRIS
<�Ի�����> : ��������
<�μ���ȣ> : 50
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

-- �ݺ���
-- 303��° ���κ��� ����
-- Loop�� 3�� ���ϱ� �ۼ�
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

-- while ��
declare
    vn_base_num number := 3;
    vn_cnt number := 1;
begin
    while vn_cnt <= 9 -- vn_cnt �� 9���� �۰ų� ���� ��� ó��
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
    for i in 1..9 -- 1~9���� �ݺ��� ����.
    loop
        dbms_output.put_line(vn_base_num || '*' || i || ' = ' || vn_base_num * i);
        exit when i = 5;
    end loop;
end;
/

-- �������� ��, �������� ��ȯ�ϴ� �Լ�
create or replace function my_mod(num1 number, num2 number)
    return number -- ��ȯ ������Ÿ�� ����
is
    -- ���� ����
    vn_remainder number := 0; -- ��ȯ�� ������
    vn_quotient number := 0; -- ��
begin
    -- ���� �ۼ�
    vn_quotient := floor(num1/num2); -- ������ / ���� ���� �κ� �ɷ�����
    vn_remainder := num1 - (num2 * vn_quotient); -- ������ = ������ - (����*��)
    return vn_remainder; -- ������ ��ȯ
end;
/

select my_mod(14,3) as remainder from dual;

-- �������� ��ȯ�ϴ� �Լ� �ۼ�
-- 52790 �̱�, 52784 �״�����, 52775 �����
select * from countries;

create or replace function fn_get_country_name (p_country_id number)
    return varchar2
is
    vs_country_name countries.COUNTRY_NAME%TYPE;
begin
    select COUNTRY_NAME into vs_country_name
    from countries
    where COUNTRY_ID = p_country_id;
    
    return vs_country_name; -- ������ ��ȯ
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
        vs_country_name := '���� ����';
    else
        select COUNTRY_NAME into vs_country_name
        from countries
        where COUNTRY_ID = p_country_id;
    end if;
    return vs_country_name; -- ������ ��ȯ
end;
/
select
    fn_get_country_name(0) country1
    , fn_get_country_name(52784) country2
from dual;