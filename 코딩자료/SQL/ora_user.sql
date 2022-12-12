-- �������� 1. SELECT ���� ������Ʈ ���̺��� ��� �ʵ带 �˻��Ѵ�. 
select * from tb_point;

-- �������� 2. SELECT ���� ������Ʈ ���̺��� ���ڵ�, ����Ʈ����, ����Ʈ�� �˻��Ѵ�. 
select CUSTOMER_CD, POINT_MEMO, POINT from tb_point;

-- �������� 3. SELECT ����  ������Ʈ ���̺��� ���ڵ�, ����Ʈ����, ����Ʈ �ʵ� ������ �ѱ۷� ����Ѵ�. 
select CUSTOMER_CD as "���ڵ�",  POINT_MEMO as "����Ʈ ����", POINT as "����Ʈ" from tb_point;

-- �������� 4. WHERE ����
-- ������ ���̺��� ��������Ʈ�� 10,000 �̸��� �������� ���ڵ�, ����, �̸���, ��������Ʈ �ʵ带 �˻��Ѵ�.
select CUSTOMER_CD, CUSTOMER_NM, EMAIL, TOTAL_POINT
from tb_customer
where total_point < 10000;

-- �������� 5. WHERE-AND ����
-- ������Ʈ ���̺��� ���ڵ尡 ��2017053���̸鼭 �Ϸù�ȣ�� 2�� �������� ���ڵ�, �Ϸù�ȣ, ����Ʈ �ʵ带 �˻��Ѵ�.
select CUSTOMER_CD, SEQ_NO, POINT
from tb_point
where CUSTOMER_CD = 2017053
and SEQ_NO = 2;

-- �������� 6. WHERE-OR ����
-- ���� ���̺��� ���ڵ尡 ��A�� �Ǵ� ��B���̰ų� ����, ����, ���� ������ ��� 80�� �̻��� �л� �ʵ带 �˻��Ѵ�.
select * 
from tb_grade 
where CLASS_CD in ('A','B') 
or (KOR >= 80 and ENG >= 80 and MAT >= 80);

-- �������� 7. WHERE BETWEEN ����
-- ������Ʈ ���̺��� ����Ͻð� 2018�� ���� �ְ�, ����Ʈ�� 10,000���� 50,000 ����Ʈ ������ �����͸� �˻��Ѵ�.
select *
from tb_point
where reg_dttm between '2018%' and '2019%'
and point between 10000 and 50000;

-- �������� 8. �񱳿�����
-- �� ���̺��� ��������Ʈ�� 20,000 �̻��� 1980��� ���� ���� ���ڵ�, ����, ����, �������, ��������Ʈ�� �˻��Ѵ�.
select CUSTOMER_CD, CUSTOMER_NM, MW_FLG, BIRTH_DAY, PHONE_NUMBER 
from tb_customer
where TOTAL_POINT >= 20000
and BIRTH_DAY between '1980%' and '1990%'
and MW_FLG = 'M';

-- �������� 9. LIKE
-- �� ���̺��� �����̸鼭 ������� �� ���� 5, 6, 7���� ���� ���ڵ�, ����, ����, �������, ��������Ʈ�� �˻��Ѵ�.
select CUSTOMER_CD, CUSTOMER_NM, MW_FLG, BIRTH_DAY, TOTAL_POINT 
from tb_customer
where MW_FLG = 'M'
and substr(BIRTH_DAY,5,2) between '05' and '07';

-- �������� 10. LIKE
-- �� ���̺��� ���ڵ尡 ��2017���� �����ϸ鼭 ������ �� �Ǵ� ���ڵ尡 ��2019���� �����ϸ鼭 ������ ���� ���ϰ�, �� �� ��������Ʈ�� 30000 ������ �����͸� �˻��Ѵ�.
select *
from tb_customer
where (CUSTOMER_CD like '2017%'
    and MW_FLG = 'M')
or (CUSTOMER_CD like '2019%'
    and MW_FLG = 'W')
and TOTAL_POINT <= 30000;

-- �������� 11. IN ������ 
-- ǰ������ ���̺��� ǰ���ڵ尡 'S01��, ��S04��, ��S06��, ��S10���� �����͸� �˻��Ѵ�.
select *
from tb_item_info
where ITEM_CD in ('S01','S04','S06','S10');

-- �������� 12. IN ������ 
-- ������Ʈ ���̺��� ���ڵ尡 ��2017042�� �Ǵ� ��2018087�� �Ǵ� '2019095' �̸鼭 ����Ʈ���뿡 �����š� ���ڰ� ���Ե� �����͸� �˻��Ѵ�.
select *
from tb_point
where CUSTOMER_CD in ('2017042', '2018087', '2019095')
and POINT_MEMO like '%����%';

-- �������� 13. ORDER BY 
-- ������Ʈ ���̺��� ������� '2019�����̰� ����Ʈ���뿡 '����'�� ���Ե� �����͸� ����Ʈ�� ū ������� �˻��Ѵ�.
select *
from tb_point
where REG_DTTM like '2019%'
and POINT_MEMO like '%����%'
order by POINT desc;

-- �������� 14. ORDER BY 
-- ���� ���̺��� ��B������ ����, ����, ���� ������ �հ谡 ���� ������ �˻��Ѵ�.
select *
from tb_grade
where CLASS_CD = 'B'
order by KOR+ENG+MAT desc;

-- �������� 15. GROUP BY
-- �Ǹ� ���̺��� �Ǹ����� ��20190802�� �Ǵ� ��20190803���� ������� �Ǹ��ϰ� ��ǰ������ �׷�ȭ�� ���Ǹż��� ���ϰ� �Ǹ��ϰ� ��ǰ���� ������ ������ ���δ�.
select SALES_DT, product_nm, sum(SALES_COUNT)
from tb_sales
where SALES_DT in ('20190802', '20190803')
group by SALES_DT, product_nm
order by SALES_DT, product_nm;

-- �������� 16. DISTINCT 
-- �Ǹ� ���̺��� '20190801������ ��20190802�� �Ⱓ�� �Ǹ��� ��ǰ���� ������ ������ �ߺ����� �˻��Ѵ�.
select DISTINCT PRODUCT_NM
from tb_sales
where SALES_DT in ('20190801', '20190802')
order by product_nm;

-- �������� 17. JOIN
-- �� ���̺��� ���ڵ尡 2019069 �����͸� ������Ʈ ���̺�� ���� �˻��Ͽ� �� ���̺����� ���ڵ�, ����, ������ �˻��� �� ������Ʈ ���̺����� �Ϸù�ȣ, ����Ʈ����, ����Ʈ�� �˻��Ѵ�.
select a.customer_cd, a.customer_nm, a.mw_flg, b.seq_no, b.point_memo, b.point 
from (select customer_cd,customer_nm,mw_flg from TB_CUSTOMER where customer_cd = '2019069') a, tb_point b 
where b.customer_cd = '2019069';

-- �������� 18. CASE
-- �� ���̺��� ��������Ʈ�� 1,000���� 20,000�̸��̸� ���ǹ���, 20,000���� 50,000�̸� �̸� ����塱, 50,000�̻��̸� ��VIP�� ����� ���̰� �� ���ǿ� �ش� ������ ���Ϲݡ� ����� ���δ�.
select customer_cd, customer_nm, total_point, 
    case when total_point between 1000 and 19999 then
    '�ǹ�'
    when total_point between 20000 and 49999 then
    '���'
    when total_point >= 50000 then
    'VIP'
    else
    '�Ϲ�'
    end "�� ���" 
from TB_CUSTOMER;

-- �������� 19. ROWNUM
-- ���� ���̺��� ���ڵ尡 ��A�� �Ǵ� ��C������ �л��� ������� ��� �ʵ�� �������� ���ȣ�� �˻��Ѵ�.

