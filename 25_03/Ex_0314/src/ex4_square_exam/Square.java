package ex4_square_exam;

import java.util.Scanner;

public class Square {
	int size;

	public int getSizeCheck(Scanner sc) {
		while (true) {
			System.out.print("마방진의 크기: ");

			if (!sc.hasNextInt()) {
				System.out.println("숫자를 입력하세요.");
				sc.next();
				continue;
			}
			size = sc.nextInt();

			if (size % 2 == 0 || size <= 1) {
				System.out.println("1보다 큰 홀수를 입력하세요.");
				continue;
			} else {
				break;
			}
		}
		return size;

	} // getSizeCheck

	public int[][] square(int size) {
		int y = 0;
		int x = size / 2;
		int num = 1;
		int[][] arr = new int[size][size];

		while (num <= size * size) {
			arr[y][x] = num;

			if (num % size == 0) {
				y++;
			} else {
				y--;
				x++;
			}

			if (y < 0) {
				y += size;
			}
			if (x == size) {
				x -= size;
			}
			++num;
		}
		return arr;

	} // square

}
