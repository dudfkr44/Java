package ex11_thread;

public class ThreadA extends Thread {

	int arr[];
	int res = 0;

	public ThreadA(int[] arr) {
		this.arr = arr;

	}

	@Override
	public void run() {
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		System.out.printf("배열 안의 합은 %d입니다.\n", res);
	}

}
