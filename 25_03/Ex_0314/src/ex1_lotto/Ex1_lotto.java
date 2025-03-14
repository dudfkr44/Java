package ex1_lotto;

import java.util.Random;

public class Ex1_lotto {
	public static void main(String[] args) {
		// 1 ~ 45 사이의 중복되지 않는 난수 6개를 출력
		// 로또 번호 : 1 2 3 4 5 6

		int[] lotto = new int[6];

		System.out.print("로또 번호: ");
		outer: for (int i = 0; i < lotto.length;) {
			lotto[i] = new Random().nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					continue outer;
				}
			} // inner
			System.out.print(lotto[i] + " ");
			i++;
		} // outer

	} // main

}
