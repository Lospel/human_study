-- ����1
select * from tb_point;

-- ����2
select customer_cd, point_memo, point from tb_point;

-- ����3
select customer_cd as "���ڵ�", point_memo as "����Ʈ ����", point as "����Ʈ" from tb_point;

-- ����4
select customer_cd, customer_nm, email, total_point from tb_customer where total_point < 10000 and email is not null;

-- ����5
select customer_cd, seq_no, point from tb_point where customer_cd = 2017053 and seq_no = 2;

-- ����6
select class_cd, student_no, student_nm, kor, eng, mat, kor+eng+mat as tot, round((kor+eng+mat)/3,1) as avg from tb_grade where class_cd = 'A' or class_cd = 'B' or
kor >= 80 and eng >= 80 and mat >= 80;

-- ����7
select * from tb_point where reg_dttm like '2018%' and point between 10000 and 50000;

-- ����8
select customer_cd, customer_nm, mw_flg, birth_day, total_point from tb_customer where total_point >= 20000 and
birth_day >= '1980' and birth_day < '1990';

-- ����9
-- ������� 05 �̻� 07 �̸�
select customer_cd, customer_nm, mw_flg, birth_day, total_point from tb_customer where mw_flg = 'M' and 
substr(birth_day,5,6) between '05' and '07';
-- ������� 05 �̻� 08 �̸�
select customer_cd, customer_nm, mw_flg, birth_day, total_point from tb_customer where mw_flg = 'M' and 
substr(birth_day,5,6) between '05' and '08';

-- ����10�� ����9�� �ߺ�

-- ����11
select * from TB_ITEM_INFO where item_cd in ('S01', 'S04', 'S06', 'S10');

-- ����12
select * from tb_point where customer_cd in ('2017042','2018087','2019095') and point_memo like '%����%';

-- ����13
select * from tb_point where substr(reg_dttm,0,4) = '2019' and point_memo like '%����%' order by point desc;

-- ����14
select kor, eng, mat,  kor + eng + mat as "�հ�" from tb_grade where class_cd ='B' order by "�հ�" desc;

-- ����15
select sales_dt, product_nm, sum(sales_count) as "���Ǹż�" from TB_SALES where sales_dt in ('20190802','20190803') 
GROUP by sales_dt, product_nm order by sales_dt, product_nm;

-- ����16
select product_nm from TB_SALES where sales_dt between '20190801' and '20190802' group by product_nm order by product_nm;

-- ����17
select a.customer_cd, a.customer_nm, a.mw_flg, b.seq_no, b.point_memo, b.point 
from (select customer_cd,customer_nm,mw_flg from TB_CUSTOMER where customer_cd = '2019069') a, tb_point b 
where b.customer_cd = '2019069';

-- ����18
select customer_cd, customer_nm, total_point, 
case when total_point between 1000 and 20000 then
'�ǹ�'
when total_point between 20000 and 50000 then
'���'
when total_point >= 50000 then
'VIP'
else
'�Ϲ�'
end "�� ���" 
from TB_CUSTOMER;

-- ����19
select rownum, class_cd, student_no, student_nm, kor, eng, mat, tot, avg from TB_GRADE where class_cd in ('A','C');

-- ����20
select * from TB_CUSTOMER where substr(customer_cd,0,4) in ('2018', '2019') and substr(birth_day,0,4) between '1990' and '2010' and phone_number is not null;

-- ����21
select '5' as "300/60", to_char(sysdate,'YYYY-MM-DD') as "���� ��¥", to_char(add_months(sysdate,1), 'YYYY-MM-DD')as "30�� �� ��¥" from dual;

-- ����22
-- null �� ǥ��
select * from TB_CUSTOMER where customer_cd in (select customer_cd from TB_POINT where point_memo like '%�̺�Ʈ%');
-- null �� �������� ġȯ
select customer_cd, customer_nm, mw_flg, birth_day,NVL(phone_number,' '), NVL(email,' '), total_point, reg_dttm from TB_CUSTOMER where customer_cd in (select customer_cd from TB_POINT where point_memo like '%�̺�Ʈ%');
