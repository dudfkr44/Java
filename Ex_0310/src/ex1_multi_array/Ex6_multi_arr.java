package ex1_multi_array;

import java.util.Scanner;

public class Ex6_multi_arr {
	public static void main(String[] args) {

//		arr에 담긴 값중 키보드에서 입력받은 값보다 첫번째 요소를 출력

//		입력 : 10
//		출력 : 11
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int input = sc.nextInt();
		sc.close();
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9 }, { 10, 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

		out: for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (input < arr[i][j]) {
					System.out.println("출력 : " + arr[i][j]);
					break out;
				} // for
			} // inner
		} // outer
	} // main
}
