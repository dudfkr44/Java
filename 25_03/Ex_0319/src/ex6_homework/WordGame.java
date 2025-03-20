package ex6_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordGame {

//	list에 3초마다 준비한 문장을 추가하고 그 중에 입력된 문장을 제거하는 코드
	static List<String> list = new ArrayList<>(); // 단어를 저장할 리스트
	static Random ran = new Random();
	static String[] wordlist = { "frog", "cherry", "apple", "horizon", "mountain", "house", "whale", "cloud",
			"umbrella", "zebra", "notebook", "igloo", "kangaroo", "forest", "queen", "sun", "yacht", "pencil", "garden",
			"orange", "date", "banana", "elephant", "tiger", "river", "jungle", "violin", "giraffe", "xylophone",
			"lemon" };

	static boolean play = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TimeCount 스레드 초기화, 리스트와 wordlist를 전달
		TimeCount t = new TimeCount(list, wordlist);
		t.setDaemon(true); // 데몬 스레드로 설정
		t.start(); // 스레드 시작

		while (list.size() != 0 && play) {

			synchronized (list) {
				if (!list.isEmpty()) {
					System.out.println("\n[" + list.get(0) + "]"); // 리스트에서 첫 번째 단어 출력
				}
			}

			String input = sc.nextLine(); // 사용자 입력 받기

			if (input.equals("exit")) {
				play = false;
				break;
			}

			synchronized (list) {
				if (!list.isEmpty() && input.equals(list.get(0))) {
					list.remove(0); // 사용자가 입력한 단어가 리스트의 첫 번째 단어와 같으면 제거
					System.out.println("단어 제거: " + input);
				}

				if (list.size() == 0) {
					play = false; // 리스트가 비면 게임 종료
				}
			}
		}

		sc.close();
		System.out.println("\n게임을 종료합니다.");
	}
}
