package ex14_deamon_thread;

public class DeamonTest extends Thread {
	public static void main(String[] args) {

//		데몬 스레드
//		다른 스레드의 작업을 돕는 보조 스레드
//		나를 실행한 클래스가 종료될 때 함께 종료.

		SaveThread st = new SaveThread();

//		SaveThread가 데몬임을 명시하는 메서드
		st.setDaemon(true);
		st.start();

		for (int i = 1; i <= 15; i++) {

			try {
				Thread.sleep(1000);
				System.out.println("main" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	} // main
}
