-- SQL �������� ��������
-- ���� 1. 2015�� ��� �������� ���� ��� ������ ��ȸ�ϼ���.
-- ���̺�� : populations
select * from populations where year = '2015' 
and life_expectancy > (select avg(life_expectancy) 
from populations) order by pop_id;

-- ���� 2. countries2 ���̺� �ִ� capital�� 
-- ��Ī�Ǵ� cities ���̺��� ������ ��ȸ�ϼ���. 
-- ��ȸ�� �÷����� name, country_code, urbanarea_pop
select name, country_code, urbanarea_pop from cities where name in (select capital from countries2)
order by urbanarea_pop desc;

-- ���� 3. 
-- ���� 1. economies ���̺��� country code, inflation rate, unemployment rate�� ��ȸ�Ѵ�.
-- ���� 2. inflation rate ������������ �����Ѵ�.
-- ���� 3. countries2 ���̺� gov_form �÷����� Constitutional Monarchy �Ǵ� `Republic`�� �� ������ �����Ѵ�.
-- Select fields
-- �����ͼ�
select CODE as country_code, INFLATION_RATE, UNEMPLOYMENT_RATE from economies order by INFLATION_RATE;
select gov_form from countries2 where (gov_form not like '%Republic%' and gov_form not like '%Constitutional Monarchy%');

-- ���� 4. 2015�� �� ����� inflation_rate�� ���� ���� ������ inflation_rate�� ���ϼ���. 
-- ��Ʈ 1. �Ʒ� ���� ����
SELECT country_name, continent, inflation_rate
  FROM countries2
  	INNER JOIN economies
    USING (code)
WHERE year = 2015;
-- �� ����� inflation_rate�� ���� ���� ���� �����ϴ� �ڵ带 �ۼ��Ѵ�. 
SELECT a.country_name, a.continent, a.inflation_rate as max_inflation_rate
  FROM (select country_name, continent, inflation_rate from countries2
INNER JOIN economies
    USING (code)
WHERE year = 2015) a, (select continent, max(inflation_rate) as max FROM countries2 INNER JOIN economies
USING (code) WHERE year = 2015 group by continent) b
where a.continent = b.continent and a.inflation_rate = b.max;

-- SQL ������ �Լ� ��������
-- ���� 1. �� �࿡ ���ڸ� 1, 2, 3, ..., ���·� �߰��Ѵ�. (row_n ���� ǥ��)
-- row_n �������� ������������ ���
-- ���̺�� alias�� �����Ѵ�. 
select rownum as row_n, year, city, sport, discipline, athlete, country, gender, event, medal
from summer_medals order by row_n;

-- ���� 2. �ø��� �⵵�� �������� ������� �ۼ��� �Ѵ�. 
-- ��Ʈ : ���������� ������ �Լ��� �̿��Ѵ�. 
select year, rownum as row_n
from (select year from summer_medals group by year order by year)
order by year;

-- ���� 3. 
-- (1) WITH �� ����Ͽ� �� ��������� ȹ���� �޴� ������ ������������ �����ϵ��� �մϴ�. 
-- (2) (1) ������ Ȱ���Ͽ� �׸��� �������� ��ŷ�� �߰��Ѵ�. 
-- ���� 5���� ���� : OFFSET 0 ROWS FETCH NEXT 5 ROWS ONLY
-- WITH AS (1�� ����)
with Medals as (select ATHLETE, count(medal) as medals from summer_medals group by ATHLETE order by medals desc)
select * from medals;
-- 2�� ����
with Medals as (select ATHLETE, count(medal) as medals from summer_medals group by ATHLETE order by medals desc)
select medals, ATHLETE, rownum as row_n from medals
where rownum <= 5;

-- ���� 4
-- ���������� �����Ѵ�. 
-- ���� 69KG ���� ��⿡�� �ų� �ݸ޴޸���Ʈ ��ȸ�ϵ��� �մϴ�. 
SELECT
    Year,
    Country AS champion
  FROM summer_medals
  WHERE
    Discipline = 'Weightlifting' AND
    Event = '69KG' AND
    Gender = 'Men' AND
    Medal = 'Gold';
-- ���� �������� �ų� ���⵵ è�Ǿ� ���� ��ȸ�ϵ��� �մϴ�.
SELECT
    Year,
    Country AS champion, lag(Country) over (order by Country) as last_champion
  FROM summer_medals
  WHERE
    Discipline = 'Weightlifting' AND
    Event = '69KG' AND
    Gender = 'Men' AND
    Medal = 'Gold'
  order by year;