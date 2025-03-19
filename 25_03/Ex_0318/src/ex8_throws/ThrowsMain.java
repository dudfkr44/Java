package ex8_throws;

public class ThrowsMain {
	public static void main(String[] args) {
		
//		throw
//		현재 코드에서 발생할 수 있는 예외(오류)를
//		나를 생성하는 메인 클래스로 던진다는 개념

		try {
			ThreadA a = new ThreadA();
			ThreadB b = new ThreadB();

		} catch (Exception e) {
		}

	} // main
}
