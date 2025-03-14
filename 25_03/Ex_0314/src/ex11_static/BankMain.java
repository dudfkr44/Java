package ex11_static;

public class BankMain {
	String s1 = "멤버 변수";
	static String s2 = "스테틱 변수";

	public static void main(String[] args) {
//		static 메서드 안에서 지역 변수로 정의되는 변수는
//		static 형식이 아니어도 무방하다.
		int n = 100;

		// 스테틱 메서드 내부에서는 static 변수만 접근이 가능

//		s1 = "abc";
		s2 = "abc";

		Bank b1 = new Bank("홍대", "02-111-1111");
		Bank b2 = new Bank("이대", "02-222-2222");
		Bank b3 = new Bank("서강대", "02-333-3333");

//		static 변수나 메서드는
//		클래스명.static 변수 <- 형태로 접근이 가능

		Bank.interest = 0.1f;

		b1.information();
		b2.information();
		b3.information();
	} // main
}
