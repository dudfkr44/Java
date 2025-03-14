package ex5_account;

import java.util.Scanner;

public class AccountMain {
//	1.입   금 :
//	2.출   금 :
//	3.잔액 확인 :
//	etc.종 료
//	--- 입금 ---
//	입금액 : 1000
//	입금 성공
//	-----------
//	1.입   금
//	2.출   금
//	3.잔액 확인
//	etc.종 료
//	>> 3
//	잔액 : 1000
//	-----------
	public static void main(String[] args) {
		Account atm = new Account();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			atm.acMain(choice);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				atm.deposit(choice);
				break;
			case 2:
				atm.withdraw(choice);
				break;
			case 3:
				atm.balance(choice);
				break;
			default:
				System.out.print("이용해 주셔서 감사합니다.");
				return;
			}
		} while (choice <= 3 || choice >= 1);
		sc.close();
	} // main

}
