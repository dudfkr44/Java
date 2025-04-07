package work_exam;

import java.util.Scanner;

public class Ex04_work {
	public static void main(String[] args) {
		/*
		 * 키보드에서 숫자를 입력받고, 입력받은 값에 해당하는 구구단을 출력 단, 2~9 사이의 값을 입력받지 않았다면 구구단 범위의 숫자를
		 * 입력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단의 수 : ");
		int dan = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= 9; i++) {
			result = dan * i;
			System.out.printf("%d × %d = %d\n", dan, i, result);
		} // inner
	}

}
