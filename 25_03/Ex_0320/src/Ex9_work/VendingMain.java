package Ex9_work;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {

//		orange - 1200원
//		coke - 1400원
//		-------------------기본 음료 5개 생성
//		insert coin : 1000
//		fanta - 1000원
//		>> coke
//		coke(을)를 선택하셨군요.
//		100원 반환됩니다.
		Scanner sc = new Scanner(System.in);
		Vending ven = new Vending();
//		ven.init();
		
		System.out.printf("Insert Coin : ");

		int money = sc.nextInt();

		ven.showDrink(money);

		System.out.print(">> \r");

		String select = sc.next();
		ven.outDrink(select);
		sc.close();
	} // main
}
