-- DDL.sql


/* 데이터베이스에서 사용되는 데이터 타입
1. 문자형 데이터타입 (단위는 바이트)
char 고정길이 255
varchar 가변길이 65535
tinytext 255
text 6535
mediumtext 16,777,215
longtext 4,294,967,295
json 1기가 

2. 숫자형 데이터타입 (단위는 바이트)
tinyint 1
smallint 2
mediumint 3
int 4
bigint 8
float 4
double 8

3. 날짜시간형 데이터타입
date YYYY-MM-DD
time HH:MI:SS
datetime YYYY-MM-DD HH:MI:SS
timestamp YYYY-MM-DD HH:MI:SS

4. 이진형(바이너리) 데이터타입 - 이미지, 오디오, 비디오 등등 (단위는 바이트)
tinyblob 255
blob 65535
mediumblob 16,777,215
longblob 4,292,967,295 (4기가)
*/

-- 1. create 데이터베이스 생성
create database testtest
char set utf8mb4 collate utf8mb4_general_ci;

use testtest; 

create table 학과 (학과번호 char(2), 학과명 varchar(20), 학과장명 varchar(20));

insert into 학과 values
('AA', '컴퓨터공학과', '배경민'),
('BB', '소프트웨어학과', '김남준'),
('CC', '디자인융합과', '박선영');

create table 학생 (학번 char(5), 이름 varchar(20), 생일 date, 연락처 varchar(20), 학과번호 char(2));

insert into 학생 values
('S0001', '이윤주', '2020-01-30', '01033334444', 'AA'),
('S0002', '이승은', '2021-02-23', null, 'AA'),
('S0003', '백재용', '2018-03-31', '01077778888', 'BB')

-- 2. alter
-- 컬럼 추가
alter table 학생 add 성별 char(1);

-- 컬럼 데이터타입 변경
alter table 학생 modify column 성별 varchar(20);

-- 컬럼명 변경
alter table 학생 change column 연락처 핸드폰전화번호 varchar(20);

-- 컬럼 삭제
alter table 학생 drop column 성별;

-- 테이블명 변경
alter table 학생 rename 재학생;

-- 3. drop
-- 데이터베이스 만든 후 drop으로 삭제
create database temp;
drop database temp;

-- 테이블 만든 후 drop으로 삭제 
create table temp(item varchar(10));
drop table temp;





