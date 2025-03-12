package mabang;

public class Mabang {
	public void getMabang(int n) {

		int y = 0;
		int x = n / 2;
		int[][] arr = new int[n][n];
		int num = 1;

		while (num <= n * n) {
			arr[y][x] = num;
			if (num % n == 0) {
				y++;
			} else {
				y--;
				x++;
			}

			if (y < 0) {
				y = n - 1;
			}

			if (x == n) {
				x -= n;
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
