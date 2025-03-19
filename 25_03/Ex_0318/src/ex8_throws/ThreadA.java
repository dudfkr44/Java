package ex8_throws;

public class ThreadA {
	public ThreadA() throws InterruptedException {

		Thread.sleep(3000);

		System.out.println("A 스레드 생성");

	}
}
