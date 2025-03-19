package ex14_deamon_thread;

public class SaveThread extends Thread {

	public void run() {

		while (true) {
			try {
				Thread.sleep(3000);
				System.out.println("자동 저장 완료");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
