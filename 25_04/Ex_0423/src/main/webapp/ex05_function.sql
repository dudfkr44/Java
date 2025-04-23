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