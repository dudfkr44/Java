--RDMBS(Relational Database Management System)
--SQL 문장 : Querry 문이라고도 하며, DB에 값을 추가, 수정, 삭제, 조회 등을 위해 요청하는 모든 문장.
--SQL 문장의 종류
--1. DQL (Data Query Language): 데이터 조회어
--SELECT
--2. DML(Data Maniqulation Language): 데이터 조작어
--INSERT, UPDATE, DELETE (CRUD(크루드))
--Create(추가), Read(조회), Update(수정), Delete(삭제)
--3. DDL(Data Definition Language): 데이터 정의어
--CREATE, ALTER, DROP, RENAME...
--4. DCL(Data Control Language): 데이터 제어어
--GRANT, REVOKE, INVOKE...

--HR 계정에 권한주기
--start database 실행 - sqlplus system/1111 입력 후
--grant connect, resource, dba to hr;

--HR 계정 잠금 해제
--alter user HR identified by 1111 account unlock;


--HR 계정이 소유하고 있는 테이블의 목록을 조회
select * from tabs;

--사원 테이블의 모든 사원 정보들을 조회
select * from EMPLOYEES;

--부서 테이블의 모든 column을 조회
select * from DEPARTMENTS;

--사원 테이블(EMPLOYEES)에서 사번(employee_id), 이름(first_name), 성(last_name)만 조회
select employee_id, first_name, last_name 
from EMPLOYEES;

--사원 테이블에서 사번, 이름, 입사일, 급여 정보를 조회
select employee_id, first_name, hire_date, salary 
from EMPLOYEES;

--사원 테이블에서 사번, 이름, 입사일, 급여, 상여금, 급여로부터 받은 상여금의 금액을 조회
select employee_id, first_name, salary, commission_pct pct, 
salary * commission_pct comn from EMPLOYEES;