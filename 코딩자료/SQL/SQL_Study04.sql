create table ch10_sales (
    sales_month     varchar2(8)
    , country_name  varchar2(40)
    , prod_category varchar2(50)
    , channel_desc  varchar2(20)
    , sales_amt     number
);

create or replace PROCEDURE iud_ch10_sales_proc (
    p_sales_month ch10_sales.sales_month%TYPE 
)
is
begin
    insert into ch10_sales (sales_month, country_name, prod_category, channel_desc, sales_amt)
    select a.sales_month
        , c.country_name
        , d.prod_category
        , e.channel_desc
        , sum(a.amount_sold)
    from sales a, customers b, countries c, products d, channels e
    where a.sales_month = p_sales_month
        and a.cust_id = b.cust_id
        and b.country_id = c.country_id
        and a.prod_id = d.prod_id
        and a.channel_id = e.channel_id
    group by a.sales_month
        , c.country_name
        , d.prod_category
        , e.channel_desc;
--commit;
rollback;
end;
/
TRUNCATE table ch10_sales;
exec iud_ch10_sales_proc ('199902');
select count(*) from ch10_sales;

ALTER TABLE ch10_sales ADD CONSTRAINTS pk_ch10_sales PRIMARY KEY (sales_month, country_name, prod_category, channel_desc);

CREATE OR REPLACE PROCEDURE iud_ch10_sales_proc
  ( p_sales_month ch10_sales.sales_month%TYPE )
is
begin
    INSERT INTO ch10_sales (sales_month, country_name, prod_category, channel_desc, sales_amt)
    select A.SALES_MONTH,
             C.COUNTRY_NAME,
             D.PROD_CATEGORY,
             E.CHANNEL_DESC,
             SUM(A.AMOUNT_SOLD)
    from sales a, customers b, countries c, products d, channels e
    where  A.SALES_MONTH = p_sales_month
         AND A.CUST_ID = B.CUST_ID
         AND B.COUNTRY_ID = C.COUNTRY_ID
         AND A.PROD_ID = D.PROD_ID
         AND A.CHANNEL_ID = E.CHANNEL_ID
       GROUP BY A.SALES_MONTH,
             C.COUNTRY_NAME,
             D.PROD_CATEGORY,
             E.CHANNEL_DESC;
COMMIT;
exception when others then
    dbms_output.put_line(sqlerrm);
    rollback;
end;
/

EXEC iud_ch10_sales_proc ( '199901');
SELECT COUNT(*) FROM ch10_sales ;
EXEC iud_ch10_sales_proc ( '199901' );
