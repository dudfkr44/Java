package ex3_square;

import java.util.Scanner;

public class Square {
	// 입력 검증 메서드
	public static int getSizeCheck(Scanner sc) {
		int size;
		while (true) {
			System.out.print("마방진 크기 : ");
			if (!sc.hasNextInt()) {
				System.out.println("숫자를 입력하세요.");
				sc.next();
				continue;
			}
			size = sc.nextInt();
			if (size <= 1 || size % 2 == 0) {
				System.out.println("1보다 큰 홀수를 입력하세요.");
			} else {
				break;
			}
		}
		return size;
	} // getSizeCheck

	// 마방진 생성 메서드
	public int[][] mabang(int size) {
		int y = 0;
		int x = size / 2;
		int[][] arr = new int[size][size];
		int num = 1;

		while (num <= size * size) {
			arr[y][x] = num;
			if (num % size == 0) {
				y++;
			} else {
				y--;
				x++;
			}

			if (y < 0)
				y = size - 1;
			if (x >= size)
				x = 0;

			++num;
		}
		return arr;
	} // mabang
}