package work;

import java.util.Scanner;

public class Ex7_homework {

	public static void main(String[] args) {
//		마방진 크기 : 3
//		8 1 6
//		3 5 7
//		4 9 2
		Scanner sc = new Scanner(System.in);
		int n;

		// 홀수 입력 검증
		do {
			System.out.print("3 이상의 홀수 입력: ");
			n = sc.nextInt();
			if (n % 2 == 0 || n < 3) {
				System.out.println("3 이상의 홀수만 가능합니다!");
			}
		} while (n % 2 == 0 || n < 3);

		int[][] magic = new int[n][n];
		int row = 0;
		int col = n / 2;
		magic[row][col] = 1;

		// 시암 방법 적용
		for (int num = 2; num <= n * n; num++) {
			int nextRow = (row - 1 + n) % n; // 음수 방지
			int nextCol = (col + 1) % n;

			if (magic[nextRow][nextCol] != 0) {
				nextRow = (row + 1) % n;
				nextCol = col;
			}

			row = nextRow;
			col = nextCol;
			magic[row][col] = num;
		}

		// 두 자리 포맷 출력
		System.out.println("\n" + n + "x" + n + " 마방진:");
		for (int[] r : magic) {
			for (int num : r) {
				System.out.printf("%02d ", num);
			}
			System.out.println();
		}
		sc.close();
	}
}