package ex4_square_exam;

import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square sq = new Square();
		int size = sq.getSizeCheck(sc);
		int[][] arr = sq.square(size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%02d ", arr[i][j]);
			} // inner
			System.out.println();
		} // outer

	} // main

}
