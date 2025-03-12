package work;

public class Gugu {
	public void gugu(int num) {
		int res = 0;

		
		for (int i = 1; i <= 9; i++) {
			res = num * i;
			System.out.printf("%d x %d = %d\n", num, i, res);
		}

	} // gugu
}
