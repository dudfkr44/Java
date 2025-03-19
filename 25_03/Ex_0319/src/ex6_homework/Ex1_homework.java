package ex6_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex1_homework {
//	list에 3초마다 준비한 문장을 추가하고 그 중에 입력된 문장을 제거하는 코드

	static List<String> list = new ArrayList<String>();
	static Random ran = new Random();
	static String[] wordlist = { "frog", "cherry", "apple", "horizon", "mountain", "house", "whale", "cloud",
			"umbrella", "zebra", "notebook", "igloo", "kangaroo", "forest", "queen", "sun", "yacht", "pencil", "garden",
			"orange", "date", "banana", "elephant", "tiger", "river", "jungle", "violin", "giraffe", "xylophone",
			"lemon" };
	static boolean play = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TimeCount t = new TimeCount();

		addlist();
		addlist();
		addlist();

		t.setDaemon(true);
		t.start();

		while (list.size() != 0 && play) {
			System.out.println("\n[" + list.get(0) + "]");
			String input = sc.nextLine();

			if (input.equals("exit")) {
				play = false;
				break;
			}

			if (input.equals(list.get(0))) {
				synchronized (list) {
					list.remove(0);
				}

				if (list.size() == 0) {
					play = false;
				}
			}
		}

		sc.close();
		System.out.println("\n게임 오버");
	} // main

	static void addlist() {
		list.add(wordlist[ran.nextInt(wordlist.length)]);
		System.out.println("단어추가: " + list.get(list.size() - 1) + ", 남은단어 : " + (list.size()) + "개");
	}
}
