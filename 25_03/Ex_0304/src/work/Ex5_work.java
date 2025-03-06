package work;

import java.util.Scanner;

public class Ex5_work {
	/*
	 * 스캐너를 통해 정수 n을 입력 1부터 입력받은 n까지의 합을 계산하여 출력 입력 : 5 결과 : 15
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n까지 더할 n의 수 입력: ");
		int n = sc.nextInt();// 입력할 n 변수 설정
		int result = 0;// 결과값 초기화
		for (int i = 0; i <= n; i++) { // i가 n수보다 작거나 같을 때까지 1씩 증가하여 아래 식을 실행
			result += i; // i의 값을 result에 누적 합산
		} // for
		System.out.print("1부터 n까지의 합: " + result);// 결과값 result를 표시

	}// main
}
