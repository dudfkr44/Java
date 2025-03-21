package lotto_prac;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("추첨할 복권의 자릿수 : ");
		int number = sc.nextInt();
		Lotto lotto = new Lotto();
		
		lotto.lottoGen(number);
		sc.close();

	} // main

}
