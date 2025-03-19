package ex4_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		System.out.println("메인스레드가 시작됩니다.");
		
		Ex_Thread th = new Ex_Thread();
		
		//start() : 스레드의 run() 메서드를 독립적으로 실행시키는 메서드
		th.start();
		
		System.out.println("메인스레드가 종료되었습니다.");
		
	} // main

}
