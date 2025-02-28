package ex1_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		
		/* 삼항 (조건)연산자
		 * 조건식을 통해 참이나 거짓의 결과에 따른 값을 만드는 연산자
		 * 결과값의 자료형은 같아야 함
		 */
		int a = 10;
		int b = 15;
		int res = ++a >= b ? 1 : 0;
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 20;
		char res2 = (n1 += n1) == n2 ? 'O' : 'X';
		System.out.println(res2);
		
		a = 10;
		b = 12;
		res2 = ++a >= b || b - a + ( a - 3 ) <= b && b + 1 - b >= 0 && ( a += b ) - ( a % b ) > 10 ? 'O' : 'X';
		//t || t && t && t
		System.out.println(res2);
	} //main
}
