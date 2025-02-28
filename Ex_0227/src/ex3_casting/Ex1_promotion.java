package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		/*캐스팅(형 변환)
		 * 1. promotion casting
		 * - 큰 자료형에 작은 자료형이 대입되는 것
		 */
		double a1 = 100.5; // 8byte
		int a2 = 200; // 4byte
		a1 = a2;
		System.out.println("a1 : " + a1);
		
		char a3 = 'A'; // 2byte 
		int a4 = 100; // 4byte
		a4 = a3;
		System.out.println("a4 : " + a4);
		
	} //main

}
