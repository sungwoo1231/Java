-- 함수1_문자열함수.sql

use testdb;

-- char_length 문자의 갯수
-- legnth 바이트 수 

select char_length('Hello'); -- 5
select length ('Hello'); -- 5
select character_length('안녕'),length ('안녕') ; -- 2, -- 6  

-- concat 문자열 연결
-- concat_ws 문자열을 구분자와 함께 연결 (ws = with separator)
select concat('꿈은 ',' 이루어진다'); -- 꿈은 이루어진다 
select concat_ws('-', '2024', '11', '27'); -- 2024-11-27

-- left 문자열의 왼쪽부터 몇개
-- right 문자열의 오른쪽부터 몇개
-- substr 문자열의 몇번째부터 몇개 
select left ('SQL 공부', 3), -- 왼쪽부터 3개 - SQL
		right('SQL 공부', 2), -- 오른쪽부터 2개 - 공부
		substr('SQL 공부', 3, 4), -- 왼쪽 3번째부터 다시 첫 번째로 돌아가서 4번째까지 - L 공부 (띄어쓰기 포함)
		substr('SQL 공부', 5); -- 왼쪽부터 5번째부터 끝까지 - 공부
		
-- substring_index
-- 구분자를 만날 때까지 문자열을 잘라냄. 인덱스는 몇번째 구분자를 만날 때까지 자를지 결정
-- 만약 인덱스가 음수값이면 오른쪽에서 자름  
select substring_index('서울시 동작구 흑석동',' ',1); -- 서울시
select substring_index('서울시 동작구 흑석동', ' ',2); -- 서울시 동작구 
select substring_index('서울시 동작구 흑석동', ' ',-1); -- 흑석동
select substring_index('서울시 동작구 흑석동', ' ',-2); -- 동작구 흑석동  
-- 동작구만 자르고 싶으면 ?
-- '서울시 동작구'만 자른 다음 -1 인덱스를 사용하여 오른쪽에서 자름
select substring_index(substring_index('서울시 동작구 흑석동', ' ',2),' ',-1); -- 동작구

-- ltrim 왼쪽 공백 제거
-- rtrim 오른쪽 공백 제거
-- trim 양쪽 공백 제거 
select ltrim('  sql'),rtrim('sql  '),trim('   sql     '); -- sql, sql,sql 

-- lpad 채우기, 지정한 길이내에서 문자열을 제외한 나머지를 주어진 문자로 왼쪽부터 채우기 
-- rpad 채우기, 지정한 길이내에서 문자열을 제외한 머니즈를 주어진 문자로 오른쪽부터 채우기 
select lpad('sql', 10, '#'), rpad('sql', 5, '*'); -- #######sql,- sql**

-- field 문자열의 위치를 찾음
-- field(찾는 문자열,문자열1,문자열2,문자열3,......)
-- find_in_set - 문자열 리스트에서 지정한 문자열을 찾음
-- find_in_set (찾는 문자열,문자열 리스트)
select field('java','sql','java','javascript'); -- 2
select find_in_set('java','java,sql,javascript'); -- 1 

-- locate 기준 문자열에서 부분 문자열의 위치를 찾음
-- locate(부분 문자열, 기준 문자열)
select locate('world', 'hello world'); -- 7

-- elt 지정한 위치에 있는 문자열을 반환
select elt(2, 'sql', 'java', 'javascript'); -- java 

-- repeat 문자열의 반복
select repeat('*',5); -- *****

-- replace 문자열의 일부를 다른 문자열로 대체
-- replace (대상 문자열, 바꿀 문자열, 바뀔 문자열)
select replace('010 4414 5942',' ','-'); -- 010-4414-5942
select replace ('2024/11/27','/','.'); -- 2024.11.27

-- reverse 문자열 거꾸로 바꿈
select reverse('hello'); -- olleh