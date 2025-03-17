package homework;

import java.util.Random;
import java.util.Scanner;

public class WordGame_exam {
	public static void main(String[] args) {

		String[] strArr = { "APPLE", "HOPE", "VIEW", "CHANGE" };
		int idx = new Random().nextInt(strArr.length);
		String answer = strArr[idx];

		Scrambled scr = new Scrambled();
		String question = scr.getQuestion(answer);

		System.out.println("문제 : " + question);
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");
			String str = sc.next();

			if (str.equalsIgnoreCase(answer)) {
				System.out.println("정답!!");
				break;
			} else {
				System.out.println(str + "오답...");
			} // if - else
		} // while
		sc.close();
	} // main
}
