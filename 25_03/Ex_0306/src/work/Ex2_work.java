package work;

import java.util.Scanner;

public class Ex2_work {

//	두 개의 주사위를 던져 합이 5, 6, 7이 되는 경우의 수를 출력
//	-------------
//	5 : (1, 4) (2, 3) (3, 2) (4, 1)
//	6 : (1, 5) (2, 4) (3, 3) (4, 2) (5, 1)
//	7 : (1, 6) (2, 5) (3, 4) (4, 3) (5, 2) (6, 1)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 두 개의 주사위 면 수 입력받기
		System.out.print("첫 번째 주사위의 최대 눈금을 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 주사위의 최대 눈금을 입력하세요: ");
		int num2 = sc.nextInt();

		System.out.println("\n🎲 두 개의 주사위를 던져 합이 5, 6, 7이 되는 경우의 수:");

		// 두 개의 주사위 값을 반복 (1부터 입력된 주사위 최대값까지)
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				int sum = i + j; // 두 주사위의 합

				// 합이 5, 6, 7일 경우 출력
				switch (sum) {
				case 5:
					int five = sum;
					System.out.println("(" + i + ", " + j + ") → 합: " + five);
					break;
				case 6:
					int six = sum;
					System.out.println("(" + i + ", " + j + ") → 합: " + six);
					break;
				case 7:
					int seven = sum;
					System.out.println("(" + i + ", " + j + ") → 합: " + seven);
					break;
				}
			}
		}
		sc.close();

	} // main
}
