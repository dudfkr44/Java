package ex5_multi_thread;

public class TMain {
	public static void main(String[] args) {
		
		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		t1.start();
		t2.start();
		System.out.print(3);
		
	} // main

}
