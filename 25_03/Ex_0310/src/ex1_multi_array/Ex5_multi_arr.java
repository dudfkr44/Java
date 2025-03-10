package ex1_multi_array;

public class Ex5_multi_arr {
	public static void main(String[] args) {

//		2차원 배열 arr에서 3의 배수를 제외한 나머지 값을 출력
//		-------
//		2
//		4 5 7
//		2 10

		int[][] arr = { { 9, 2, 6 }, { 4, 5, 6, 7 }, { 2, 12, 10 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 3 == 0) {
					continue;
				} // if
				System.out.print(arr[i][j] + " ");
			} // inner
			System.out.println();
		} // outer

	} // main
}
