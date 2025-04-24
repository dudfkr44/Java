--기타 함수
--nvl() : null 값을 원하는 데이터로 변환하는 함수
--(null이 포함된 값, nullvalue)

--null 대신 0 표시
select first_name, nvl(commission_pct, 0)
from EMPLOYEES;

--decode() : 자바의 switch 역할을 하는 함수
--(비교할 값, 비교 값1, 조건 표기값1, 비교 값2, 조건 표기값2, ..., 그 외 표기값)
select department_id, decode(department_id, 20, '마케팅 부서',
							 60, '전산부',
							 90, '경영부',
							 '기타')
from EMPLOYEES;

--사번, 이름, 직종 표기
--직종이 'it_prog'이면 개발자,
--그렇지 않은 사원은 '비개발자'로 표기
select employee_id, first_name, job_id, 
decode(lower(job_id), 'it_prog', '개발자', '비개발자') sort
from EMPLOYEES;

--사번, 이름, 직종을 출력
--직종이 'it_prog'이면 개발자,
--'sa_man'이면 영업담당자,
--그렇지 않은 사원들은 기타로 출력
select employee_id, first_name, job_id,
decode(lower(job_id), 'it_prog', '개발자', 'sa_man', '영업담당자', '기타') sort
from EMPLOYEES;

--case when: 자바의 else if 역할을 구현하는 키워드
--case when 참조 함수 (비교 연산자) 값 then 출력값... else 출력값 end 별칭(열의 제목)

select first_name, department_id,
case when department_id = 20 then '마케팅'
when department_id = 60 then '전산실'
when department_id = 90 then '전산실'
else '기타'
end dept_name
from EMPLOYEES;

--이름, 직종을 출력
--직종이 'it_prog'인 사원들은 개발자
--'sa_man'인 사람들은 영업 담당자
--나머지는 나머지로 출력

select first_name,
case when lower(job_id) = 'it_prog' then '개발자'
when lower(job_id) = 'sa_man' then '영업담당자'
else '나머지'
end "영업부서"
from EMPLOYEES;

--이름, 입사일, 급여, 퇴직금을 출력
--04년도 이전 입사한 직원 : 급여 * 100
--04 ~ 06년도 입사한 직원 : 급여 * 50
--07년 이후 입사한 직원 : 급여 * 20

select first_name, hire_date, salary,
case when to_char(hire_date, 'yy') <= 4 then salary * 100
when to_char(hire_date, 'yy') >= 4 and to_char(hire_date, 'yy') <= 6 then salary * 50
else salary * 20
end "퇴직금"
from EMPLOYEES;

--rank() over() : 조건에 따라 순위를 매기는 함수
--over(order by 참조함수 오름/내림차순(asc, desc))
select department_id, employee_id, first_name, salary,
rank() over(order by salary desc) ranking
from EMPLOYEES
order by ranking desc;
