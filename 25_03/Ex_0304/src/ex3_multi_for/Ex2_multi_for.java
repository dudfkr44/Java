package ex3_multi_for;

public class Ex2_multi_for {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(j + " ");
			} // inner
			System.out.println();
		} // outer

		System.out.println("---------------------");

		int num = 0;		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(++num + " ");
			} // inner
			System.out.println();
		} // outer
	}// main
}
