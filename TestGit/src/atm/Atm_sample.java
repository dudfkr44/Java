package atm;

import java.util.Scanner;

public class Atm_sample {
	Scanner sc = new Scanner(System.in);
	private int money;

	public void atmPrint(int check) {
		System.out.print("1.입    금 :\r\n");
		System.out.print("2.출    금 :\r\n");
		System.out.print("3.잔액 확인 :\r\n");
		System.out.print("etc.종 료\r\n");
		System.out.print(">> ");
	}// atmPrint

	public void deposit(int money) {
		this.money += money;
		System.out.println("입금 성공\r\n");
	}// 입금 메서드

	public int withdraw(int money) {
		if (this.money < money) {
			System.out.println("잔액이 부족합니다!\r\n");
			return 0;
		} else {
			System.out.println("출금이 완료되었습니다.\r\n");
			this.money -= money;
			return money;
		}
	}// 출금 메서드

	public void balance() {
		System.out.printf("잔 액: %d원\n", money);
	}// 잔액 확인 메서드

}
