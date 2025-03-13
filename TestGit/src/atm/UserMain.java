package atm;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Atm atm = new Atm();

		int money = 0;
		int choice = 0;

		while (true) {
			atm.atmMain(choice);
			System.out.print(">> ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("입금액 : ");
				money = sc.nextInt();
				atm.deposit(money);
				break;
			case 2:
				System.out.print("출금액 : ");
				money = sc.nextInt();
				atm.withdraw(money);
				break;
			case 3:
				atm.balance();
				break;
			case 4:
				System.out.println("이용해 주셔서 감사합니다.");
				sc.close();
				return;
			default:
				System.out.println("메뉴에 맞게 입력해 주세요.");
				continue;
			}
		}		
	} // main

}
