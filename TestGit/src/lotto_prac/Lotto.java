package lotto_prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
	List<Integer> num = new ArrayList<Integer>();
	Random rnd = new Random();

	public void lottoGen(int number) {
		int[] lotto = new int[number];
		System.out.print("로또 번호 : ");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rnd.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					continue;
				} // if
			} // inner
			System.out.print(lotto[i] + " ");
		} // outer
	} // LottoGen

}
