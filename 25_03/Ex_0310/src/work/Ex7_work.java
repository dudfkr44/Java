package work;

import java.util.Scanner;

public class Ex7_work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("등록 인원: ");
		int n = sc.nextInt();
		sc.nextLine(); // 개행 문자 처리

		String[] info = { "이름", "수학", "영어" };
		String[][] str = new String[n][info.length];

		// 학생 정보 입력
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(info[j] + ": ");
				str[i][j] = sc.nextLine();
			}
			System.out.println("--------------------");
		}

		System.out.println(n + "명 등록 완료!");
		// 학생 정보 출력
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}