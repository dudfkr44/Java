package ex6_homework;

import java.util.Scanner;

public class GraphMain {
	public static void main(String[] args) {
//		0 ~ 9 사이의 난수를 n개 생성하고
//		각 숫자가 몇 개씩 있는지 그래프화
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("생성할 난수의 갯수: ");
		int n = sc.nextInt();

		
		Graph grPr = new Graph();
		grPr.prgraph(n);
		

	} // main
}
