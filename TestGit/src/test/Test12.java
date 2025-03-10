package test;

import java.util.Random;

public class Test12 {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		System.out.print("로또 번호 : ");
		outer: for (int i = 0; i < lotto.length;) {

			lotto[i] = new Random().nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue outer;
				}
			} // inner
			System.out.print(lotto[i] + " ");
			i++;
		} // outer

	} // main
}
