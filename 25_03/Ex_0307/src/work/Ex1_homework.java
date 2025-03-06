package work;

import java.util.Scanner;

public class Ex1_homework {
	public static void main(String[] args) {

//		키보드에서 입력받은 정수가 소수인지 아닌지를 판단하세요.
//		-----------------
//		입력 : 7
//		7은(는) 소수입니다.
//		입력 : 4
//		4은(는) 소수가 아닙니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수: ");
		int input = sc.nextInt();

		if (input % 2 == 0 && input != 2 || input == 1) {
			System.out.println(input + "은(는) 소수가 아닙니다.");
		} else {
			for (int i = 2; i < input; i++) {
				if (input % i == 0) {
					System.out.println(input + "은(는) 소수가 아닙니다.");
					return;
				}
			}
			
			System.out.println(input + "은(는) 소수입니다.");

		}
		sc.close();
	} // main
}
