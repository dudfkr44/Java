package ex5_multi_thread;

public class Thread01 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			System.out.print("1");
		} // for

	}

}
