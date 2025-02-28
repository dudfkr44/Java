package ex1_first;

public class Ex1_print {
	public static void main( String[] args ) {
		
		//주석 : JVM은 인지하지 못하는 개발자들의 메모를 작성하기 위한 수단
		
		int a = 100;
		int b = 200;
		String c = "안녕하세요";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a + a - 50);
		System.out.println(c + ". 저는 홍길동입니다.");
		System.out.println("10" + 10); //문자열 뒤에는 +는 이어붙이기가 된다.
		System.out.println("10 + 10 = " + (10 + 10)); //괄호() 안에 있는 내용이 가장 먼저 실행된다.
		
		System.out.println(1 + 1 + "1" + "=" + 1 + 1);
		
		
		
	}//main 메서드
}
