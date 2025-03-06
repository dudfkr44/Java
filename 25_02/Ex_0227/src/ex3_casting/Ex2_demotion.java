package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2. demotion casting
		//- 작은 자료형에 큰 자료형이 대입되는 것
		char b1 = 'D';
		int b2 = b1 + 1;
		b1 = (char)b2;
		System.out.println("b1 = " + b1);
		
		float c1 = 5.5F; //4.x byte
		int c2 = 1; //4 byte
		c2 = (int)c1;
		System.out.println("c2 = " + c2);
		
		
	}  // main

}
