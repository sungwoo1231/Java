-- 함수2_숫자함수.sql

use testdb;

-- ceiling -- 무조건 올림
-- floor -- 무조건 내림
-- round -- 반올림
-- round -- 두 번째 매개변수를 지정하면 반올림하는 위치를 정할 수 있음 
-- truncate -- 버림, 위치를 지정 가능
-- truncate -- 소수점 위치를 지정하는 표현하고 싶은 소수점자리 갯수를 의미함(소수점이하 두자리만 표현)
select ceiling(123.56), -- 124
floor(123.56), -- 123
round(123.56), -- 124
round(123.56,1), -- 123.6
truncate(123.56, 1), -- 123.5 - 소수점 이하 한자리
truncate(123.567, 2); -- 123.56  -소수점 이하 두자리 

-- abs 절대값
-- sign 음수는 -1 양수는 1을 반환
select abs(-120),sign(-120) ,sign(120); -- 120 -- -1 -- 1

-- power 제곱
-- sqrt(square root) 제곱근 
-- rand(random number)
-- rand 함수의 매개변수 seed, 동일 seed는 동일 랜덤넘버가 나옴 
select power(2,3); -- 8 (2^3) 2에 3승
select sqrt(16); -- 4 (4*4=16)
select rand(); -- 0과 1사이에 랜덤넘버 
select rand(100); -- 항상 동일한 랜덤넘버   
select rand(200);  