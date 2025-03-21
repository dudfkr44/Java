package basegame_pac;

import java.util.Random;
import java.util.Scanner;

public class BaseGame {
	public static void main(String[] args) {
//		중복되지 않은 세자리의 숫자를 난수로 생성
//		입력받은 세자리의 숫자 중 숫자와 자릿수가 같다면 Strike
//		숫자는 같지만 자릿수가 다르다면 Ball
//		모든 숫자가 맞으면 정답을 출력하고 입력을 시도한 숫자를 기입

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int[] arr = new int[3]; // 백의 자리, 십의 자리, 일의 자리 저장
		int i = 0;

		for (i = 0; i < arr.length; i++) {
			int num = 0;

			boolean isDuplicate;
			do {
				num = (i == 0) ? (rnd.nextInt(9) + 1) : rnd.nextInt(10);

				isDuplicate = false;
				for (int j = 0; j < i; j++) {
					if (num == arr[j]) {
						isDuplicate = true;
						break;
					} // if
				} // inner
			} while (isDuplicate);// do-while
			arr[i] = num;
		} // do-while

		while (true) {
			int cnt++;
			// 각 자리에 맞게 곱셈 후 합산
			int number = arr[0] * 100 + arr[1] * 10 + arr[2];
			System.out.printf("중복 없는 난수: %d%n>>", number);
			String userIn = sc.next();
			int res = Integer.parseInt(userIn);
			int[] user = new int[3];

			if (!sc.hasNextInt()) {
				System.out.println("정수를 입력하세요.");
			}

			if (res >= 999 || res <= 0) {
				System.out.println("세 자리의 양의 정수를 입력하세요.");
			}

			user[0] = (int) res / 100;
			user[1] = (int) res / 10 % 10;
			user[2] = (int) res % 10;

			if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("중복되지 않은 숫자를 입력하세요.");
				continue;
			}

			int strike = 0;
			int ball = 0;
			for (i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (user[i] == arr[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						} // if-else;
					} // if
				} // inner
			} // outer
			
			if (strike == 3) {
				System.out.println(cnt + "회만에 정답!");
				break;
			} else {
				if ((0 < ball) || (0 < strike)) {
					System.out.println(strike + " Strike " + ball + " Ball");
				} else {
					System.out.println("Out!!");
				}
			}
		}
		sc.close();
	} // main
}