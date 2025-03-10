package work;

import java.util.Random;

public class Ex2_work {
	public static void main(String[] args) {
//		변수 money에 10 ~ 5000까지의 난수를 발생시켜 입력
//		단, 발생하는 난수의 1의 자리는 반드시 0으로 넣을 것.
//		발생한 난수를 가능한 한 적은 수의 동전으로 나눈 결과를 출력
//		----------------------
//		난수 : 2590
//		500원: 5개
//		50원: 1개
//		10원: 4개
		int[] coin = { 500, 100, 50, 10 };
		int money = new Random().nextInt(501) * 10;
		System.out.printf("남은 돈 : %d원\n", money);
		for (int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			System.out.print(res > 0 ? coin[i] + "원: " + res + "개\n" : "");
			money %= coin[i];
		}
	}// main

}
