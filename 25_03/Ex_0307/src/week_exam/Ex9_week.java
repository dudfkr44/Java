package week_exam;

public class Ex9_week {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i + j > 10) {
					System.out.print(i + j - 10 + " ");
				} else {
					System.out.print(i + j + " ");
				}
			}
			System.out.println();
		}

	} // main
}