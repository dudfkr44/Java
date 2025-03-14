package ex5_account;

import java.util.Scanner;

public class Account {
	int money = 0;
	Scanner sc = new Scanner(System.in);

	public void acMain(int choice) {
		System.out.println("1.입    금");
		System.out.println("2.출    금");
		System.out.println("3.잔액 확인");
		System.out.println("etc.종  료");
		System.out.print(">> ");

	} // acMain

	public void deposit(int money) {
		System.out.print("입금액: ");
		money = sc.nextInt();
		if (this.money >= 0) {
			System.out.println("---------");
			System.out.println("입금 성공\n");
			this.money += money;
		}

	} // deposit

	public int withdraw(int money) {
		System.out.print("출금액: ");
		money = sc.nextInt();
		if (this.money < money) {
			System.out.println("잔액이 부족합니다.\n");
			System.out.println("---------");
			return 0;
		} else {
			System.out.println("출금 성공\n");
			System.out.println("---------");
			this.money -= money;
			return money;
		}
	} // withdraw

	public int balance(int money) {
		System.out.printf("잔액: %,d원\n", this.money);
		System.out.println("---------");
		return money;
	} // balance
}
