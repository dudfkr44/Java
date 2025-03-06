package work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		/*
		 * 키보드에서 숫자를 입력받고, 입력받은 값에 해당하는 구구단을 출력 단, 2~9 사이의 값을 입력받지 않았다면 구구단 범위의 숫자를
		 * 입력하세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 2 ~ 9단의 수를 입력 : ");
		int dan = sc.nextInt();
		int result = 0;
		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				result = dan * i;
				System.out.println(dan + " X " + i + " = " + result);
			}//for
		} else {
			System.out.println("올바른 단의 값을 입력하세요.");
		}//if-else

		sc.close();
	}

}
