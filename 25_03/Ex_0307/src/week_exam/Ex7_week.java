package week_exam;

public class Ex7_week {
	public static void main(String[] args) {
		char ch = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%c ", ch++);
			} // inner
			System.out.println();
		} // outer

	} // main
}
