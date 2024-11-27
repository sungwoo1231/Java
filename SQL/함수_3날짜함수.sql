-- 함수3_날짜함수.sql

use testdb;

-- now 현재 날짜와 시간 
-- sysdate 현재 시스템의 날짜와 시간 (now와 대부분 동일)
-- curdate 현재 날짜
-- cirtime 현재 시간
select now(), sysdate(), curdate(), curtime();

-- year, quarter(분기), month, day, hour, minute, second
select year (now()),
quarter(now()),
month(now()),
day(now()),
hour (now()),
minute(now()),
second (now());

-- datediff 날짜간의 일수 차이
-- timestampdiff 두 날짜의 시간을 기준시간으로 변환하여 계산하고 다시 날짜로 변환
select datediff('2024-12-25',now()); -- 28
select datediff(now(),'2024-12-25'); 
select timestampdiff(year ,now(),'2025-12-25'); -- 1
select timestampdiff(month ,now(),'2025-12-25'); -- 12
select timestampdiff(day ,now(),'2025-12-25'); -- 392

-- adddate 특정날짜에 기간을 더한 날짜 
-- subdate 특정날짜에 기간을 뺀 날짜 
-- interval 키워드를 함꼐 사용하면 더하거나 뺴는 기간을 정할 수 있음 
select adddate(now(),50); -- 2025-01-16 12:40:47
select subdate(now(),50);-- 2024-10-08 12:40:33
select adddate(now(),-50);-- 2024-10-08 12:40:33 subdate와 동일한 결과
select adddate(now(),interval 50 year);
select adddate(now(),interval 50 month);
select adddate(now(),interval 50 day);
select adddate(now(),interval 826 hour);

-- last day 그 달의 마지막 날
-- dayofyear 현재년도에서 며칠이 지났는지 반환
select last_day(now()); -- 2024-11-30
select last_day('2025-02-01');  -- 2025-02-28
select dayofyear(now()); -- 332
select dayofmonth(now()); -- 27
select dayofweek(now()); -- 4

-- monthname 월을 영문으로 반환
select monthname('2024-12-01'); -- December 

-- weekday 요일 반환 mysql의 경우, 월요일 0 ~ 일요일 6
select weekday(now()); -- 2 (수요일)
