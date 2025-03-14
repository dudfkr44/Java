package mabang;

import java.util.Scanner;

public class MabangMain_test {
	public static void main(String[] args) {
//		마방진 크기 : 3
//		8 1 6
//		3 5 7
//		4 9 2
		// 홀수 입력 검증
		Scanner sc = new Scanner(System.in);
		int size = 0;

		do {
			System.out.print("마방진의 크기 : ");
			if (!sc.hasNextInt()) {
				System.out.println("숫자를 입력하세요.");
				sc.next();
				continue;
			}
			size = sc.nextInt();

			if (size % 2 == 0 || size <= 1) {
				System.out.println("마방진의 크기는 1을 초과한 홀수여야 합니다.");
				continue;
			} else {
				break;
			}

		} while (size % 2 == 0 || size <= 1);

		Mabang_test m = new Mabang_test();
		m.getMabang(size);
		sc.close();

	}
}