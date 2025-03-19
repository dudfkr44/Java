package ex4_thread;

public class Ex_Thread extends Thread {
	
//	Thread 클래스는 멀티태스킹(다중 작업)을 하게 만드는 클래스로
//	만들 작업에 새로운 클래스에 Thread를 상속받고
//	Thread 클래스를 상속받으면 run 메서드를 반드시 가져야 함

//	독립적인 실행 단위 : 스레드
//	한번에 두 가지 이상의 프로세스를 실행 가능하게 한다.
	
	
	@Override
	public void run() {
//		run 실행 영역 안에 있는 값만 실행됨
//		독립적인 수행을 위한 영역
		for (int i = 0; i < 10; i++) {
			System.out.println("run() 실행 중");
		}
		
	}
}
