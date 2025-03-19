package ex13_homework;

public class TimeCount extends Thread {
	private int time = 0;
	private boolean running = true; // 스레드 실행 상태 제어 변수

	// 시간 반환 메서드
	public int getTime() {
		return time;
	}

	// 스레드 종료 메서드
	public void stopCounting() {
		running = false;
	}

	@Override
	public void run() {
		while (running) {
			try {
				Thread.sleep(1000); // 1초 대기
				time++; // 1초마다 시간 증가
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}