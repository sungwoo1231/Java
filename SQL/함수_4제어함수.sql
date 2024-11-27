-- 함수_4제어함수.sql

use testdb;

-- 타입변환
-- mysql의 데이터타입 문자- char,정수- signed,양의 정수- unsigned, 날짜- date, 날짜,시간- datetime, 시간- time,이진데이터 - binary
-- 가변 데이터타입 : varchar, biob (binary Large Object) 
-- cast
-- convert
select cast('1'as unsigned);
select cast(2 as char);
select convert('1',unsigned);
select convert (2,char);

-- if 조건식 삼항연산식과 형식이 동일 
select if(125000 * 450 > 50000000, '초과달성', '미달성'); -- 초과달성

-- case
-- case when 조건 then 실행
-- 조건에 따른 실행을 여러개 설정 가능 
-- 마지막에 end는 반드시 사용 !!! 
select case when 12500 * 450 > 100000 then '초과달성' 
when 2500 * 450 > 5000000 
then '달성' 
else '미달성' 
end as 'case구문';

-- ifnull
-- null 여부를 체크하는 함수, 값이 null이면 두 번째 매개변수를 반환. 아니면 그 값 그대로 반환 
select ifnull(5, 'null'),ifnull(null, '값이 없음');

-- nullif
-- nullif(A,B) A와B가 동일하면 null 반환, 다르면 A 반환
-- 특정 컬럼을 업데이트를 했을 경우 각 데이터별로 업데이트 여부를 확인하는데 사용
-- 기존 값과 달리 업데이트 되었으면 업데이트 된 값을 기록하는 용도 
select nullif('mysql', 'oracle'), nullif('oracle','oracle');