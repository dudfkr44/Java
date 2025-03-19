package ex15_homework_practice;

public class TimeCount extends Thread {
	private int time;
	private boolean running = true;
	boolean isPlaying = true;

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public int getTime() {
		return time;
	}

	protected synchronized void setRunning(boolean running) {
		this.running = running;
	}

	public void run() {
		while (running) {
			try {
				Thread.sleep(1000);
				time++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}