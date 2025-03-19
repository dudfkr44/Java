package ex9_runnable;

public class RunMain {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread thread = new Thread(t1);
		thread.start();
		
		
		
	} // main
}
