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
			System.out.print("마방진 크기 : ");

			// 1단계: 정수 여부 확인
			if (!sc.hasNextInt()) {
				System.out.println("숫자를 입력하세요.");
				sc.next(); // 잘못된 입력 제거
				continue;
			}

			// 2단계: 숫자 저장
			size = sc.nextInt();

			// 3단계: 유효성 검사 (홀수/양수/1이 아님)
			if (size % 2 == 0 || size == 1 || size < 0) {
				System.out.println("마방진의 크기는 1을 제외한 홀수인 양의 정수여야 합니다.");
			} else {
				break; // 유효한 경우 루프 탈출
			}
		} while (true);

		Mabang_test m = new Mabang_test();
		m.getMabang(size);
		sc.close();
	}
}