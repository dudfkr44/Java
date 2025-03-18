package ex11_thread;

public class ThreadMain { // Class A
	public static void main(String[] args) {

		// 배열 Arr에 담긴 합을 A스레드가 계산
		// 배열 Arr에 담긴 곱을 B스레드가 계산

		int[] arr = { 3, 5, 11, 6, 4 };

		ThreadA ta = new ThreadA(arr);
		ThreadB tb = new ThreadB(arr);

		ta.start();
		tb.start();

	} // main
}
