package work_exam;

public class Ex05_work {
	public static void main(String[] args) {
		/*
		 * 2 X 1 = 2 3 X 1 = 3 4 X 1 = 4 ......... ... 2 X 9 = 18 3 X 9 = 27 4 X 9 = 36
		 * .........
		 */
		int n1 = 0;
		int n2 = 0;
		int result = 0;

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				n1 = i;
				n2 = j;
				result = n1 * n2;
				if (j == 1) {
					System.out.printf("%d × %d = %d", n1, n2, result);
				} else {
					System.out.printf("\t%d × %d = %d", n1, n2, result);
				}
			} // inner
			System.out.println();
		} // outer
	} // main
}
