package ex6_homework_exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordGameMain {
//	list에 3초마다 준비한 문장을 추가하고 그 중에 입력된 문장을 제거하는 코드	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> arr = new ArrayList<String>();
		String[] data = { "apple", "orange", "grape" };
		Addword aw = new Addword(arr, data);
		aw.setDaemon(true);
		aw.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (true) {

			if (arr.size() == 0) {
				System.out.println("클리어!!");
				break;
			}
			System.out.print(">> ");
			String in = sc.nextLine();

			if (in == "exit") {
				System.out.println("게임을 종료합니다.");
				break;
			}

			// 입력받은 단어와 일치하는 값이 arr에 있는지 확인

			for (int i = 0; i < arr.size(); i++) {
				if (in.equals(arr.get(i))) {
					arr.remove(i);
					break;
				}
			}

		}
		sc.close();

	} // main

}
