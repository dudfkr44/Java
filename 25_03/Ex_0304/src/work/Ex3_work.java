package work;

import java.util.Scanner;

public class Ex3_work {

	public static void main(String[] args) {
		// 1 ~ 10까지의 숫자 중에서 홀수의 합을 계산하여 출력
		int result = 0;

		for (int i = 1; i <= 10; i += 2) { // 1 ~ 10의 숫자 중 홀수만을 더함
			result += i;
		}

		System.out.println("1 ~ 10까지의 숫자 중 홀수의 합은 " + result + "입니다."); // 홀수의 총 더한 값을 출력

		System.out.println("----------------------");

		// 하루에 1원씩 이자가 붙는 예끔이 있다.
		// 키보드에서 원금과 예치일수를 입력받고
		// 예치일이 끝났을 때 나의 원금을 출력
		// 원금 : 1000
		// 예치일 : 5
		// 5일 후의 잔액은 1005원 입니다.

		Scanner sc = new Scanner(System.in);

		System.out.print("원금 : ");
		int money = sc.nextInt();
		System.out.println(money + "원");

		System.out.print("예치일 : ");
		int day = sc.nextInt();
		System.out.println(day + "일");

		for(int i = 0; i < day; i++) {
			money++;
		}

		System.out.println(day + "일 후의 잔액은 " + money + "원입니다.");

	} // main

}
