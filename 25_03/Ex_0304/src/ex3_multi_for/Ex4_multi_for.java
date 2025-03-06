package ex3_multi_for;

public class Ex4_multi_for {
	public static void main(String[] args) {
		/*
		 * 1 2 3 4 5 6 7 8 9
		 * 2 4 6 8 10 12 14 16 18
		 * ...
		 * 9 18 27 36 45 54 63 72 81
		 */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			} // inner
			System.out.println();
		} // outer
		System.out.println("-----------------------------");
	}// main
}
