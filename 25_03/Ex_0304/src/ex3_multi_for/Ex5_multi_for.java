package ex3_multi_for;


public class Ex5_multi_for {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
	}
}
