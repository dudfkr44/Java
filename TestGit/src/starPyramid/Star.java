package starPyramid;

public class Star {
	public void star(int n) {

		for (int i = 0; i <= n; i++) {// n = 5
			for (int j = 0; j < n - i; j++) {// 
				System.out.print(" ");
			}
			for (int k = 0; k <= (i * 2) - 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		} // outer

	}
}
