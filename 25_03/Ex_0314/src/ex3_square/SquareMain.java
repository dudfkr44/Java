package ex3_square;

import java.util.Scanner;

public class SquareMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Square 클래스에서 입력 처리
		int size = Square.getSizeCheck(sc);

		// 마방진 생성 및 출력
		Square m = new Square();
		int[][] res = m.mabang(size);

		System.out.println("\n[마방진 결과]");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.printf("%02d ", res[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}