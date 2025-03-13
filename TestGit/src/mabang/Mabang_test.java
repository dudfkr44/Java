package mabang;

public class Mabang_test {
	public void getMabang(int size) {
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

			if (y < 0) {
				y = size - 1;
			}

			if (x == size) {
				x -= size;
			}
			++num;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		}

	}
}
