package ex7_lambda;

public class Ex1_Lambda {
	public static void main(String[] args) {
//		람다식
//		익명의 함수를 지칭하는 용어, 별개의 함수를 재정의하지 않고
//		필요한 내용을 바로 작성할 수 있도록 하는 개념

		Thread t = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("나는 스레드");
			} // for
		});
		t.start();

		System.out.println("메인스레드 종료");

	} // main
}
