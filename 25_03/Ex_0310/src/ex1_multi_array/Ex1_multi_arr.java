package ex1_multi_array;

public class Ex1_multi_arr {
	public static void main(String[] args) {
//		다차원배열
//		1차원 배열이 2개 모이면 2차원 배열
//		1차원 배열이 3개 모이면 3차원 배열

//		int[][] arr = new int[1차원 배열의 수 ][각 1차원 배열의 index 수];

		int[][] arr = new int[2][3];

		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;

		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		// arr[1][3] = 700;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			} // inner
			System.out.println();
		} // outer
	} // main

}
