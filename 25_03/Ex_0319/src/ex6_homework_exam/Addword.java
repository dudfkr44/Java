package ex6_homework_exam;

import java.util.List;
import java.util.Random;

public class Addword extends Thread {

	List<String> arr;
	String[] data;

	public Addword(List<String> arr, String[] data) {
		this.arr = arr;
		this.data = data;
	}

	@Override
	public void run() {
		while (true) {
			// 랜덤으로 단어를 선택하여 arr 리스트에 추가
			int rnd = new Random().nextInt(data.length);
			arr.add(data[rnd]);
			System.out.println(arr);
			// 3초 간격으로 arr에 단어를 추가
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // while
	}
}
