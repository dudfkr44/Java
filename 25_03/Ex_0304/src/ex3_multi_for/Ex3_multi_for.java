package ex3_multi_for;

public class Ex3_multi_for {
	public static void main(String[] args) {
		/*
		 * * * * *
		 1 2 3 4 5
		 * * * * *
		 1 2 3 4 5
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(0 == i % 2 ? "* " : j + " ");
			} // inner
			System.out.println();
		} // outer
		System.out.println("---------------");
		char a = 'A';
		
		for(int i = 0; i < 3; i++ ) {
			for (char j = 0; j < 4; j++) {
				System.out.print(a++ + " ");
			}
			System.out.println();
		}

	}// main
}
