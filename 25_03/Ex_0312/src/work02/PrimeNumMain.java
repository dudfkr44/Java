package work02;

import java.util.Scanner;

public class PrimeNumMain { // class A
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		sc.close();
		PrimeNum pn = new PrimeNum();
		pn.iam_prime(n);
		
		
		
	} // main
}
