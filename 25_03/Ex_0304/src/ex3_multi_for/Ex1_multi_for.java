package ex3_multi_for;

import java.util.Scanner;

public class Ex1_multi_for {
	public static void main(String[] args) {
		/*
		 * 다중 for문 : for문 안에 for문이 있는 경우
		 * 1 2
		 * 1 2
		 * for() { //y축(행)
		 * for() { //x축(열) 
		 * }//inner
		 * }//outer
		 * 
		 */
		for (int i = 1; i <= 3; i++) {//y축(행)

			for (int j = 1; j <= 5; j++) {//x축(열)
				
				System.out.print(j + " ");
				
			} // inner
			System.out.println();
		}

	}// main
}
