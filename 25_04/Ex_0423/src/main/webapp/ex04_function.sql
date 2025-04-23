--2) 숫자 함수
--round() : 반올림 함수(소수를 표시 안 할 때 0 대신 생략 가능)
--(소수점 숫자(실수), 반올림 할 자릿수)
select round(3.15, 1) pi from dual;
select round(0.34567, 2) from dual;

--trunc() : 버림 함수(소수를 표시 안 할 때 0 대신 생략 가능)
--(소수점 숫자(실수), 버림할 자릿수)
select trunc(123.456, 2) from dual;

--power() : 제곱 함수
--(숫자, 제곱수)
select power(4, 2) from dual;

--mod() : 나머지 함수
--(숫자, 나누는 수)
select mod(7, 4) from dual;

--사번이 짝수인 사원들의 사번, 이름을 출력
select employee_id, first_name
from EMPLOYEES
where mod(employee_id, 2) = 0;

--3) 날짜 함수
--sysdate : 현재 날짜를 출력하는 키워드
select sysdate from dual;

--add_months() : 특정 날짜에 개월수를 추가하는 함수
(특정 날짜, 추가할 개월 수)
select sysdate, add_months(sysdate, 2) from dual;

--모든 사원의 입사일로부터 6개월 뒤의 정보를 출력
select employee_id, first_name, hire_date, add_months(hire_date, 6) afterMonth
from EMPLOYEES;

--120번 사원의 입사 후 3년 6개월 경과 후 퇴사한 직원의 사번, 이름, 입사일, 퇴사일을 출력
select employee_id, first_name, hire_date, add_months(hire_date, 42) exit_date
from EMPLOYEES
where employee_id in 120;

--months_between() : 두 날짜 사이의 개월 수를 계산하는 함수
--(시작 날짜, 종료 날짜)

--입사일로부터 현재까지 몇 개월이 흘렀는지 확인
select first_name, hire_date, months_between(sysdate, hire_date) monthNum
from EMPLOYEES;

--입사기간이 250개월 이상인 사원들의 사번, 이름, 입사일, 개월 수를
--소수점 뒷자리 없이 출력
select employee_id, first_name, hire_date, trunc(months_between(sysdate, hire_date)) num
from EMPLOYEES
where months_between(sysdate, hire_date) >= 250;

--next_day() : 특정 날짜로부터 가장 빨리 돌아오는 요일을 출력
--(특정 날짜, 요일)
--1: 일요일, 2: 월요일, 3: 화요일, 4: 수요일, 5: 목요일, 6: 금요일, 7: 토요일
select sysdate, next_day(sysdate, 7) from dual;

--입사일로부터 처음으로 맞는 금요일의 날짜를 출력
--사번, 이름, 입사일, 첫금요일 출력
select employee_id, first_name, hire_date, next_day(hire_date, 6) firstFri
from EMPLOYEES;

--last_day() : 특정 날짜이 속한 월의 마지막 날을 출력
--(특정 날짜)
select last_day(sysdate) from dual;

--to_char() : 날짜나 시간을 원하는 형식으로 출력하려 할 때 쓰는 함수
--(특정 날짜, 날짜 형식)

select to_char(sysdate, 'scc yy/mm/dd month day - pm hh24 mi ss') newDate from dual;
--날짜 형식의 구조(대소문자 무관)
--YYYY 또는 yy : 년도
--MM 또는 mm : 월
--DD 또는 dd : 일
--month 또는 MON : '숫자(0-9)월' 표시
--DAY 또는 day : 현재 요일 표시, 예)'수요일'
--SCC 또는 cc : 세기 표시
--am 또는 PM : 정오 지시자(오전 오후 표시)
--hh 또는 HH12 또는 hh24 : 시간 표시(24시, 12시 표시)
--mi : 분 표시
--ss : 초 표시

--사원 이름, 입사일을 '18-06-12 화요일' 형태로 출력
select first_name, to_char(hire_date, 'yy-mm-dd day') hire
from EMPLOYEES;