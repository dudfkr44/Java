package starPyramid;

import java.util.Scanner;

public class StarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("피라미드 층 수 : ");
		int n = sc.nextInt();
		Star out = new Star();
		out.star(n);

	} // main
}
