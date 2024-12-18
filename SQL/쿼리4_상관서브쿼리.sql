-- 쿼리4_상관서브쿼리

use testdb;

/** 상관서브쿼리(Correlated SubQuery)
- 서브쿼리가 외부쿼리의 컬럼값을 참조하면서 실행되는 서브쿼리
<특징>
1. 외부쿼리와의 종속성 : 외부쿼리의 값을 기반으로 동작하면 독립적 실행불가
2. 행단위처리   : 외부쿼리의 각 행에 대해 서브쿼리가 반복적으로 실행
3. 성능 : 반복적으로 실행되므로 일반적인 서브쿼리에 비해 성능저하 가능성 증가
그러므로 효율적인 설계와 최적화가 필요함! 

<MySQL에서 상관서브쿼리의 위치>
select 와 where 
from은 불가능 - mysql은 from절에서 외부테이블에 대한 참조를 허용하지 않기 때문
**/

-- 상관서브쿼리의 예
-- 사원별 상사의 이름 조회
select 사원번호, 이름, 직위, 상사번호,
(select 이름 from 사원 as 상사 where 상사.사원번호 = 사원.상사번호) as 상사이름
from 사원;

-- 주문번호별 총판매금액 조회
select 주문번호, 주문일,
(select sum(주문수량*단가)from 주문세부 where 주문세부.주문번호 = 주문.주문번호) as 총판매금액
from 주문;

-- 한 번도 주문한 적이 없는 제품의 정보
select * from 제품
where not exists (select * from 주문세부 where 주문세부.제품번호 = 제품.제품번호 )

-- from절의 상관서브쿼리
-- MySQL은 from절에서 외부테이블에 대한 참조를 허용하지 않음!!
select 고객.고객번호, 고객.고객회사명, 주문요약.최중주문일
from 고객
join (
select 고객번호,max(주문일) as 최종주문일
from 주문
where 주문.고객번호 = 고객.고객번호 -- 외부 쿼리의 값 참조 
group by 고객번호
) as 주문요약
on 고객.고객번호 = 주문요약.고객번호; -- 코드 오류 발생!

/* 다중컬럼 서브쿼리
 * 서브쿼리가 여러 개의 컬럼을 select할 때 그 컬럼들을 필터링의 조건으로 두 개 이상을 사용하는 문법
 */
-- 각 도시마다 최고 마일리지를 보유한 고객의 정보
select 도시,담당자명,고객회사명,마일리지
from 고객
where (도시,마일리지) in (select 도시, max(마일리지) from 고객 group by 도시)
order by 마일리지 desc;
-- 서브쿼리가 select한 도시와 max(마일리지) 두 개 컬럼에 모두 일치하는 조건을 조회해야 함
-- 그러모르 한 개의 컬럼으로 두 조건을 만족할 수 없으므로 다중컬럼을 사용해야 함 = (도시,마일리지)
-- 예를 들어 서울특별시에 있으면서 마일리지가 128,790인 회사를 select하기 위해 다중컬럼을 사용한 것임

-- 다중컬럼 서브쿼리 대신 from절의 서브쿼리를 이용하면 해결 가능함
select 고객.도시, 담당자명, 고객회사명, 마일리지
from 고객
join ( select 도시, max(마일리지)as 최고마일리지 from 고객 group by 도시) as 최고마일리지정보
on 고객.도시 = 최고마일리지정보.도시 and 고객.마일리지 = 최고마일리지정보.최고마일리지


