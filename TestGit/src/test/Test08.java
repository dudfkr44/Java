package test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
//		키보드에서 입력받은 정수가 소수인지 아닌지를 판단하세요.
//		-----------------
//		입력 : 7
//		7은(는) 소수입니다.
//		입력 : 4
//		4은(는) 소수가 아닙니다.
//		2를 제외한 1과 자기 자신 이외에는 나누어 지지 않는 양의 정수: 소수
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 :");
		int n = sc.nextInt();
		boolean isA = true;

		if (n % 2 == 0 && n != 2 || n == 1) {
			isA = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isA = false;
					break;
				}
			}
		}

		System.out.println(isA == true ? n + "은(는) 소수입니다." : n + "은(는) 소수가 아닙니다.");
		sc.close();
	}// main
}
