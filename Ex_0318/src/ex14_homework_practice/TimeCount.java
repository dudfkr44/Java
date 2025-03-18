package ex14_homework_practice;

public class TimeCount extends Thread {

	int time = 0;
	int correctCount = 0;
	boolean running = true;

	/**
	 * @return the time
	 */
	protected synchronized int getTime() {
		return time;
	} // time 시간 반환 메서드

	public void TimeStop() {
		running = false;
	} // Running 시간 종료 메서드

	@Override
	public void run() {
		while (running) {
			try {
				Thread.sleep(1000);
				time++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // run

	}

}
