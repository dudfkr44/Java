package ex11_thread;

public class ThreadB extends Thread {

	int arr[];
	int res = 1;

	public ThreadB(int[] arr) {
		this.arr = arr;

	}

	@Override
	public void run() {
		for (int i = 0; i < arr.length; i++) {
			res *= arr[i];
		}
		System.out.printf("배열 안의 곱은 %d입니다.\n", res);
	}

}
