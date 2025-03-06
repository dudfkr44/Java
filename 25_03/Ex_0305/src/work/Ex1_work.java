package work;

public class Ex1_work {
	public static void main(String[] args) {
/*
2 X 1 = 2	3 X 1 = 3	4 X 1 = 4	.........
...
2 X 9 = 18	3 X 9 = 27	4 X 9 = 36	.........
 */
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d X %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
		
		
		
	}
}
