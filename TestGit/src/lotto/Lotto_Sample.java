package lotto;

import java.util.Random;

public class Lotto_Sample {
	public static void main(String[] args) {

//		중복되지 않는 1 ~ 45까지의 번호를 6개 출력
//		로또 번호 : 1 2 3 4 5 6
		int[] lotto = new int[6];
		System.out.print("로또 번호 : ");
		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = new Random().nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue;
				}
			} // inner
			System.out.print(lotto[i] + " ");
		} // outer

	} // main
}
