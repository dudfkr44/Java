package ex2_valueType;

public class Ex2_valueType {

	public static void main(String[] args) {
	
		//정수형 : 소수점이 없는 자연수를 저장하는 자료형
		//byte b1 = 128;
		//byte 타입의 자료형이 담을 수 있는 값을 벗어났으므로 오류 (-128 ~ 127)
		
		byte b1 = 127;
		int n1 = 2100000000;
		long l1 = 2200000000L;
		
		System.out.println("b1 = " + b1);
		System.out.println("n1 = " + n1);
		System.out.println("l1 = " + l1);
		
		//실수형: 소수점을 포함하는 숫자를 저장하는 자료형
		float f1 = 3.14F;
		double d1 = 3.14;
		
		f1 = 10;
		d1 = 20;
		
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
	}
}
