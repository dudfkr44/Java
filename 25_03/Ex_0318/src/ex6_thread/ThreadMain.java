package ex6_thread;

public class ThreadMain {
	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		t1.start();

		try {
			// 5초간 휴식
			Thread.sleep(5100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("메인스레드 종료");

	} // main
}
