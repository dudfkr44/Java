package mabang;

import java.util.Scanner;

public class MabangMain {
	public static void main(String[] args) {
//		마방진 크기 : 3
//		8 1 6
//		3 5 7
//		4 9 2
		// 홀수 입력 검증
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.print("마방진의 크기(홀수만 입력 가능): ");
			// 숫자가 아닌 입력 방지
			while (!sc.hasNextInt()) {
				System.out.println("숫자를 입력하세요!");
				sc.next(); // 잘못된 입력 버리기
			}
			size = sc.nextInt();

			if (size % 2 == 0 || size < 1) {
				System.out.println("홀수만 입력 가능합니다. 다시 입력해주세요.");
			}
		} while (size % 2 == 0 || size < 1);

		Mabang mabang = new Mabang();
		mabang.getMabang(size);

		// 명시적으로 Scanner 닫기
		sc.close();
		return;
	}
}
