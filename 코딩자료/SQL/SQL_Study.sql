-- 오라클 SQL과 PL/SQL을 다루는 기술 2장
create table ex2_1 (
    column1 char(10),
    column2 varchar2(10),
    column3 nvarchar2(10),
    column4 number
);

insert into ex2_1 (column1,column2) values ('abc','abc');

select column1, length(column1) as len1, column2, length(column2) as len2 from ex2_1;

create table ex2_2(
    column1 varchar2(3),
    column2 varchar2(3 byte),
    column3 varchar2(3 CHAR)
);

insert into ex2_2 values('abc','abc','abc');

select column1, length(column1) as len1, column2, length(column2) as len2,  column3, length(column3) as len3 from ex2_2;

insert into ex2_2 values ('홍길동','홍길동','홍길동');

insert into ex2_2(column3) values ('홍길동');

SELECT column3, LENGTH(column3) AS len3, LENGTHB(column3) AS bytelen FROM ex2_2;

create table ex2_3 (
    col_int integer,
    col_dec decimal,
    col_num NUMBER
);

select column_id, column_name, data_type, data_length from user_tab_cols
where table_name = 'ex2_3' order by column_id;

create table ex2_4 (
    col_flot1 float(32),
    col_flot2 float
);

insert into ex2_4 (col_flot1, col_flot2) values (1234567891234, 1234567891234);

create table ex2_5(
    col_date date,
    col_timestamp TIMESTAMP
);

insert into ex2_5 values (sysdate, systimestamp);

select * from ex2_5;

create table ex2_6 (
    col_null varchar2(10),
    col_not_null varchar2(10) not NULL
);

insert into ex2_6 values ('AA','');
insert into ex2_6 values ('AA','BB');

SELECT constraint_name, constraint_type, table_name, search_condition
FROM user_constraints
WHERE table_name = 'EX2_6';

create table ex2_7 (
    col_unique_null varchar2(10) unique,
    col_nuique_nnull varchar2(10) unique not null,
    col_unique varchar2(10),
    constraints unique_nm1 unique (col_unique)
);

SELECT constraint_name, constraint_type, table_name, search_condition
FROM user_constraints
WHERE table_name = 'EX4_7';

INSERT INTO ex2_7 VALUES ('AA', 'AA', 'AA');
INSERT INTO ex2_7 VALUES ('AA', 'AA', 'AA');
INSERT INTO ex2_7 VALUES ('', 'BB', 'BB');
INSERT INTO ex2_7 VALUES ('', 'CC', 'CC');

create table ex2_8 (
    col1 varchar2(10) primary key,
    col2 varchar2(10)
);

SELECT constraint_name, constraint_type, table_name, search_condition
FROM user_constraints
WHERE table_name = 'EX2_8';

INSERT INTO ex2_8 VALUES ('', 'AA');
INSERT INTO ex2_8 VALUES ('AA', 'AA');
INSERT INTO ex2_8 VALUES ('AA', 'AA');

create table ex2_9 (
    num1 number
    constraints check1 check (num1 between 1 and 9),
    gender varchar2(10)
    constraints check2 check (gender in('MALE','FEMALE'))
);

SELECT constraint_name, constraint_type, table_name, search_condition
FROM user_constraints
WHERE table_name = 'EX2_9';

INSERT INTO ex2_9 VALUES (10, 'MAN');
INSERT INTO ex2_9 VALUES (5, 'FEMALE');

create table ex2_10 (
    Col1 varchar2(10) not null,
    col2 varchar2(10) null,
    create_date date default sysdate
);

INSERT INTO ex2_10 (col1, col2) VALUES ('AA', 'BB');
select * from ex2_10;

drop table ex2_10;

alter table ex2_10 rename column col1 to col11;

desc ex2_10;

alter table ex2_10 modify col2 varchar2(30);
alter table ex2_10 add col3 number;
alter table ex2_10 drop column col3;
alter table ex2_10 add constraints pk_ex2_10 primary key (col11);

SELECT constraint_name, constraint_type, table_name, search_condition
FROM user_constraints
WHERE table_name = 'EX2_10';

alter table ex2_10 drop constraints pk_ex2_10;

create table ex2_9_1 as select * from ex2_9;

select a.employee_id, a.emp_name, a.department_id, b.department_name from employees a, departments b
where a.department_id = b.department_id;

create or replace view emp_dept_v1 as 
select a.employee_id, a.emp_name, a.department_id, b.department_name from employees a, departments b
where a.department_id = b.department_id;

select * from emp_dept_v1;

create unique index ex2_10_ix01
on ex2_10(col11);

SELECT index_name, index_type, table_name, uniqueness
FROM user_indexes
WHERE table_name = 'EX2_10';

SELECT constraint_name, constraint_type, table_name, index_name
FROM user_constraints
WHERE table_name = 'JOB_HISTORY';
     
SELECT index_name, index_type, table_name, uniqueness
FROM user_indexes
WHERE table_name = 'JOB_HISTORY';

create index ex2_10_ix02
on ex2_10 (col11, col2);

SELECT index_name, index_type, table_name, uniqueness
FROM user_indexes
WHERE table_name = 'EX2_10';

drop index ex2_10_ix02;

