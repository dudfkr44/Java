package ex3_multi_for;

public class ex6_multi_for {
	public static void main(String[] args) {
		
/*
1 2 3 4 5 6 7 8 9 10
2 3 4 5 6 7 8 9 10 1
...
10 1 2 3 4 5 6 7 8 9	
 */
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print((i + j) % 10 + 1 +" ");
			}
		System.out.println();		
		}
		System.out.println("-------------------------------");
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 0; j < 10; j++) {
				sum = i + j;
				if(sum > 10) {
					sum -= 10;
				}
				System.out.print(sum + " ");
			}
		System.out.println();		
		}
	}
}
