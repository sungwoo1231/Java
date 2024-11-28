use testdb;

/* 1. 광역시 고객에 대해서 담당자직위별로 최대마일리지를 출력 
 단, 최대마일리지가 10,000점이상인 레코드만 포함 */
select 도시,담당자직위,마일리지 as 최대마일리지
from 고객
where 도시 like '%광역시%'
group by 도시,담당자직위,마일리지
having 최대마일리지 >= 10000;


/* 2. 주문테이블에서 주문년도별로 주문건수 출력 */
select year(주문일) as 주문년도,count(*) as 주문건수  
from 주문
group by year(주문일);


/* 3. 주문테이블에서 요청일보다 발송이 늦어진 주문내역이 월별로 몇건씩인지 요약하여 출력
 단,	주문월 순서대로 정렬하시오 */
select year(요청일) as 요청년도, month(요청일) as 요청월, sum(요청일 < 발송일) as '늦어진 주문내역'
from 주문
group by year(요청일),month(요청일)
order by 요청년도,요청월;



/* 4. 고객테이블에서 마일리지가 50,000점 이상인 고객은 'VIP고객', 나머지 고객은 '일반고객'으로 구분하고
 고객구분별로 고객수와 평균마일리지를 출력 */
select
case when 마일리지 >= 50000
then 'VIP고객'
else '일반고객'
end as 고객구분,
count(*) as 고객수,avg(마일리지) as 평균마일리지
from 고객
group by case when 마일리지 >= 50000
then 'VIP고객'
else '일반고객'
end;

/* 5. 제품번호별로 주문수량합과 주문금액합을 출력 */
select 제품번호,sum(주문수량) as 주문수량합, sum(단가*주문수량) as 주문금액합
from 주문세부
group by 제품번호
order by 제품번호

/* 6. 주문번호별로 주문된 제품번호의 목록과 주문금액합을 출력 */
select 주문번호 ,count(제품번호)as 제품번호, sum(단가) as 주문금액합
from 주문세부
group by 주문번호
order by 제품번호

/* 7. 2021년 주문내역에 대하여 고객번호별로 주문건수를 보이되, 주문건수가 많은 상위 3건의 고객 출력 */


/* 8. 직위별로 사원수와 사원이름목록을 출력 */