package ex6_thread;

public class Thread1 extends Thread {

	int[] arr = new int[10];

	public Thread1() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

	}

	@Override
	public void run() {
		for (int i = 0; i < arr.length; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(arr[i]);
		}
	}

}
