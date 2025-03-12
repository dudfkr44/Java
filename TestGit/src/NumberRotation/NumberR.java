package NumberRotation;

public class NumberR {

	public void NumberR(int n) {

		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j > n) {
					res = (i + j) - n;
					System.out.printf("%02d ", res);
				} else {
					res = (i + j);
					System.out.printf("%02d ", res);
				}
			}
			System.out.println();
		}

	}

}
