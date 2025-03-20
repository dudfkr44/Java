package ex6_homework;

import java.util.List;
import java.util.Random;

public class TimeCount extends Thread {
	private List<String> list; // 단어를 저장할 리스트
	private String[] wordlist; // 단어 배열
	private Random ran = new Random(); // 랜덤 단어 선택 객체

	public TimeCount(List<String> list, String[] wordlist) {
		this.list = list;
		this.wordlist = wordlist;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String wordToAdd = wordlist[ran.nextInt(wordlist.length)]; // 랜덤 단어 선택
				synchronized (list) {
					list.add(wordToAdd); // 리스트에 단어 추가
					System.out.println("단어 추가: " + wordToAdd + ", 남은 단어 : " + (list.size()) + "개");
					System.out.println(list);
				}
				Thread.sleep(3000); // 3초마다 단어 추가
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
