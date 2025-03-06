package ex2_control;

public class Ex2_op {
	public static void main(String[] args) {
		
		/* 비교연산자
		 * 변수의 값을 비교하여 참과 거짓을 판단하는 연산자
		 */
		int a1 = 10;
		int a2 = 20;
		boolean res = a1 < a2;
		System.out.println("< : " + res);
		
		res = a1 >= a2;
		System.out.println("> : " + res);
		
		res = a1 == a2;
		System.out.println("== : " + res);
		
		res = a1 != a2;
		System.out.println("!= : " + res);
		System.out.println("-------------");
		
		/* 논리연산자
		 * 비교연산자를 통한 연산이 두 개 이상 필요할 때 사용
		 */
		int age = 25;
		int limit = 30;
		/* and 연산자
		 * 앞의 조건식이 거짓(false)이면 후에 나오는 조건식은 계산하지 않음
		 * true && true 일 때만 true 그 외에는 false
		 * false && false = false
		 * false && true = false
		 * true && false = false
		 * true && true = true
		 */
		res = limit - age > 5 && (age+=5) > 30;
		System.out.println(age);
		System.out.println("&&연산 : " + res);
		/* or 연산자
		 * 앞의 조건식이 참(true)이면 후에 나오는 조건식은 계산하지 않음
		 * false || false 일 때만 false 그 외에는 true
		 * false || false = false
		 * false || true = true
		 * true || false = true
		 * true || true = true
		 * 앞의 조건식이 거짓(false)이면 후에 나오는 조건식은 계산하지 않음
		 */
		int n1 = 10;
		int n2 = 20;
		res = (n1 += 10) > 20 || n2 - 10 == 10;
		System.out.println("||연산 : " + res);
		
		//boolean으로 설정된 변수만 앞에 !(부정 연산자) 사용 가능
		//! 연산자는 변수 앞에 붙어서 변수가 true이면 false, false이면 true로 변경
		System.out.println(!res);
		System.out.println(res);
		
		/* 증감연산자
		 * 1씩 증가시키거나 1씩 감소시키는 연산자
		 * 선행증감과 후행증감의 차이점을 유의
		 * 선행증감은 바로 값이 적용되지만 후행증감은 조건이나 출력 이후 값이 적용
		 */
		int a = 10;
		System.out.println("a : " + ++a);
		
		int b = 10;
		System.out.println(" b : " + b++);
		System.out.println(b);
		
		a++;
		a++;
		a++;
		a++;
		a++;
		++a;
		++a;
		++a;
		--a;
		--a;
		--a;
		a--;
		a--;
		a--;
		a--;
		a--;
		System.out.println(a++);
	} //main
}
