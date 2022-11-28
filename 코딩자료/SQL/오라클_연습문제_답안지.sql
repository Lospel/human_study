-- 문제1
select * from tb_point;

-- 문제2
select customer_cd, point_memo, point from tb_point;

-- 문제3
select customer_cd as "고객코드", point_memo as "포인트 내용", point as "포인트" from tb_point;

-- 문제4
select customer_cd, customer_nm, email, total_point from tb_customer where total_point < 10000 and email is not null;

-- 문제5
select customer_cd, seq_no, point from tb_point where customer_cd = 2017053 and seq_no = 2;

-- 문제6
select class_cd, student_no, student_nm, kor, eng, mat, kor+eng+mat as tot, round((kor+eng+mat)/3,1) as avg from tb_grade where class_cd = 'A' or class_cd = 'B' or
kor >= 80 and eng >= 80 and mat >= 80;

-- 문제7
select * from tb_point where reg_dttm like '2018%' and point between 10000 and 50000;

-- 문제8
select customer_cd, customer_nm, mw_flg, birth_day, total_point from tb_customer where total_point >= 20000 and
birth_day >= '1980' and birth_day < '1990';

-- 문제9
-- 생년월일 05 이상 07 미만
select customer_cd, customer_nm, mw_flg, birth_day, total_point from tb_customer where mw_flg = 'M' and 
substr(birth_day,5,6) between '05' and '07';
-- 생년월일 05 이상 08 미만
select customer_cd, customer_nm, mw_flg, birth_day, total_point from tb_customer where mw_flg = 'M' and 
substr(birth_day,5,6) between '05' and '08';

-- 문제10은 문제9와 중복

-- 문제11
select * from TB_ITEM_INFO where item_cd in ('S01', 'S04', 'S06', 'S10');

-- 문제12
select * from tb_point where customer_cd in ('2017042','2018087','2019095') and point_memo like '%구매%';

-- 문제13
select * from tb_point where substr(reg_dttm,0,4) = '2019' and point_memo like '%구매%' order by point desc;

-- 문제14
select kor, eng, mat,  kor + eng + mat as "합계" from tb_grade where class_cd ='B' order by "합계" desc;

-- 문제15
select sales_dt, product_nm, sum(sales_count) as "총판매수" from TB_SALES where sales_dt in ('20190802','20190803') 
GROUP by sales_dt, product_nm order by sales_dt, product_nm;

-- 문제16
select product_nm from TB_SALES where sales_dt between '20190801' and '20190802' group by product_nm order by product_nm;

-- 문제17
select a.customer_cd, a.customer_nm, a.mw_flg, b.seq_no, b.point_memo, b.point 
from (select customer_cd,customer_nm,mw_flg from TB_CUSTOMER where customer_cd = '2019069') a, tb_point b 
where b.customer_cd = '2019069';

-- 문제18
select customer_cd, customer_nm, total_point, 
case when total_point between 1000 and 20000 then
'실버'
when total_point between 20000 and 50000 then
'골드'
when total_point >= 50000 then
'VIP'
else
'일반'
end "고객 등급" 
from TB_CUSTOMER;

-- 문제19
select rownum, class_cd, student_no, student_nm, kor, eng, mat, tot, avg from TB_GRADE where class_cd in ('A','C');

-- 문제20
select * from TB_CUSTOMER where substr(customer_cd,0,4) in ('2018', '2019') and substr(birth_day,0,4) between '1990' and '2010' and phone_number is not null;

-- 문제21
select '5' as "300/60", to_char(sysdate,'YYYY-MM-DD') as "오늘 날짜", to_char(add_months(sysdate,1), 'YYYY-MM-DD')as "30일 후 날짜" from dual;

-- 문제22
-- null 값 표시
select * from TB_CUSTOMER where customer_cd in (select customer_cd from TB_POINT where point_memo like '%이벤트%');
-- null 값 공백으로 치환
select customer_cd, customer_nm, mw_flg, birth_day,NVL(phone_number,' '), NVL(email,' '), total_point, reg_dttm from TB_CUSTOMER where customer_cd in (select customer_cd from TB_POINT where point_memo like '%이벤트%');
