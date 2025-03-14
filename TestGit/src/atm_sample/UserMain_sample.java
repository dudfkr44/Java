package atm_sample;

import java.util.Scanner;

public class UserMain_sample {
	public static void main(String[] args) {
//		1.입   금 :
//		2.출   금 :
//		3.잔액 확인 :
//		etc.종 료
//		--- 입금 ---
//		입금액 : 1000
//		입금 성공
//		-----------
//		1.입   금 :
//		2.출   금 :
//		3.잔액 확인 :
//		etc.종 료
//		>> 3
//		잔액 : 1000
//		-----------
		try (Scanner sc = new Scanner(System.in)) {
			Atm_sample atm = new Atm_sample();
			int choice = 0;
			while (true) {
				atm.atmPrint(choice);
				choice = sc.nextInt();

				switch (choice) {
				case 1: // 입금
					System.out.printf("입금액: ");
					int money = sc.nextInt();
					atm.deposit(money);
					break;
				case 2: // 출금
					System.out.printf("출금액: ");
					money = sc.nextInt();
					atm.withdraw(money);
					break;
				case 3: // 잔액 확인
					atm.balance();
					break;
				case 4:
					System.out.println("이용해 주셔서 감사합니다.");
					return;
				default:
					System.out.println("올바른 메뉴를 선택하세요.");
					break;
				}// switch
			} // while

		} // try
	} // main

}
