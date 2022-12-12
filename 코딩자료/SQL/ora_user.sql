-- 연습문제 1. SELECT 조건 고객포인트 테이블의 모든 필드를 검색한다. 
select * from tb_point;

-- 연습문제 2. SELECT 조건 고객포인트 테이블에서 고객코드, 포인트내용, 포인트를 검색한다. 
select CUSTOMER_CD, POINT_MEMO, POINT from tb_point;

-- 연습문제 3. SELECT 조건  고객포인트 테이블에서 고객코드, 포인트내용, 포인트 필드 제목을 한글로 출력한다. 
select CUSTOMER_CD as "고객코드",  POINT_MEMO as "포인트 내용", POINT as "포인트" from tb_point;

-- 연습문제 4. WHERE 조건
-- 고객관리 테이블에서 누적포인트가 10,000 미만인 데이터의 고객코드, 고객명, 이메일, 누적포인트 필드를 검색한다.
select CUSTOMER_CD, CUSTOMER_NM, EMAIL, TOTAL_POINT
from tb_customer
where total_point < 10000;

-- 연습문제 5. WHERE-AND 조건
-- 고객포인트 테이블에서 고객코드가 ‘2017053’이면서 일련번호가 2인 데이터의 고객코드, 일련번호, 포인트 필드를 검색한다.
select CUSTOMER_CD, SEQ_NO, POINT
from tb_point
where CUSTOMER_CD = 2017053
and SEQ_NO = 2;

-- 연습문제 6. WHERE-OR 조건
-- 성적 테이블에서 반코드가 ‘A’ 또는 ‘B’이거나 국어, 영어, 수학 점수가 모두 80점 이상인 학생 필드를 검색한다.
select * 
from tb_grade 
where CLASS_CD in ('A','B') 
or (KOR >= 80 and ENG >= 80 and MAT >= 80);

-- 연습문제 7. WHERE BETWEEN 조건
-- 고객포인트 테이블에서 등록일시가 2018년 내에 있고, 포인트가 10,000에서 50,000 포인트 범위의 데이터를 검색한다.
select *
from tb_point
where reg_dttm between '2018%' and '2019%'
and point between 10000 and 50000;

-- 연습문제 8. 비교연산자
-- 고객 테이블에서 누적포인트가 20,000 이상인 1980년대 남성 고객의 고객코드, 고객명, 성별, 생년월일, 누적포인트를 검색한다.
select CUSTOMER_CD, CUSTOMER_NM, MW_FLG, BIRTH_DAY, PHONE_NUMBER 
from tb_customer
where TOTAL_POINT >= 20000
and BIRTH_DAY between '1980%' and '1990%'
and MW_FLG = 'M';

-- 연습문제 9. LIKE
-- 고객 테이블에서 남성이면서 생년월일 중 월이 5, 6, 7월인 고객의 고객코드, 고객명, 성별, 생년월일, 누적포인트를 검색한다.
select CUSTOMER_CD, CUSTOMER_NM, MW_FLG, BIRTH_DAY, TOTAL_POINT 
from tb_customer
where MW_FLG = 'M'
and substr(BIRTH_DAY,5,2) between '05' and '07';

-- 연습문제 10. LIKE
-- 고객 테이블에서 고객코드가 ‘2017’로 시작하면서 남성인 고객 또는 고객코드가 ‘2019’로 시작하면서 여성인 고객을 구하고, 그 중 누적포인트가 30000 이하인 데이터를 검색한다.
select *
from tb_customer
where (CUSTOMER_CD like '2017%'
    and MW_FLG = 'M')
or (CUSTOMER_CD like '2019%'
    and MW_FLG = 'W')
and TOTAL_POINT <= 30000;

-- 연습문제 11. IN 연산자 
-- 품목정보 테이블에서 품목코드가 'S01’, ‘S04’, ‘S06’, ‘S10’인 데이터를 검색한다.
select *
from tb_item_info
where ITEM_CD in ('S01','S04','S06','S10');

-- 연습문제 12. IN 연산자 
-- 고객포인트 테이블에서 고객코드가 ‘2017042’ 또는 ‘2018087’ 또는 '2019095' 이면서 포인트내용에 ‘구매’ 문자가 포함된 데이터를 검색한다.
select *
from tb_point
where CUSTOMER_CD in ('2017042', '2018087', '2019095')
and POINT_MEMO like '%구매%';

-- 연습문제 13. ORDER BY 
-- 고객포인트 테이블에서 등록일이 '2019＇년이고 포인트내용에 '구매'가 포함된 데이터를 포인트가 큰 순서대로 검색한다.
select *
from tb_point
where REG_DTTM like '2019%'
and POINT_MEMO like '%구매%'
order by POINT desc;

-- 연습문제 14. ORDER BY 
-- 성적 테이블에서 ‘B’반의 국어, 영어, 수학 점수의 합계가 높은 순으로 검색한다.
select *
from tb_grade
where CLASS_CD = 'B'
order by KOR+ENG+MAT desc;

-- 연습문제 15. GROUP BY
-- 판매 테이블에서 판매일이 ‘20190802’ 또는 ‘20190803’을 대상으로 판매일과 상품명으로 그룹화해 총판매수를 구하고 판매일과 상품명은 가나다 순으로 보인다.
select SALES_DT, product_nm, sum(SALES_COUNT)
from tb_sales
where SALES_DT in ('20190802', '20190803')
group by SALES_DT, product_nm
order by SALES_DT, product_nm;

-- 연습문제 16. DISTINCT 
-- 판매 테이블에서 '20190801＇에서 ‘20190802’ 기간에 판매한 상품명을 가나다 순으로 중복없이 검색한다.
select DISTINCT PRODUCT_NM
from tb_sales
where SALES_DT in ('20190801', '20190802')
order by product_nm;

-- 연습문제 17. JOIN
-- 고객 테이블의 고객코드가 2019069 데이터를 고객포인트 테이블과 연관 검색하여 고객 테이블에서는 고객코드, 고객명, 성별을 검색한 후 고객포인트 테이블에서는 일련번호, 포인트내용, 포인트를 검색한다.
select a.customer_cd, a.customer_nm, a.mw_flg, b.seq_no, b.point_memo, b.point 
from (select customer_cd,customer_nm,mw_flg from TB_CUSTOMER where customer_cd = '2019069') a, tb_point b 
where b.customer_cd = '2019069';

-- 연습문제 18. CASE
-- 고객 테이블에서 누적포인트가 1,000에서 20,000미만이면 “실버”, 20,000에서 50,000미만 이면 “골드”, 50,000이상이면 “VIP” 등급을 보이고 위 조건에 해당 없으면 “일반” 등급을 보인다.
select customer_cd, customer_nm, total_point, 
    case when total_point between 1000 and 19999 then
    '실버'
    when total_point between 20000 and 49999 then
    '골드'
    when total_point >= 50000 then
    'VIP'
    else
    '일반'
    end "고객 등급" 
from TB_CUSTOMER;

-- 연습문제 19. ROWNUM
-- 성적 테이블에서 반코드가 ‘A’ 또는 ‘C’반의 학생을 대상으로 모든 필드와 순차적인 행번호를 검색한다.

