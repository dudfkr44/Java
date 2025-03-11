package work;

public class Ex6_work {
	public static void main(String[] args) {
//	2차원 배열에 아래 결과와 같은 값을 넣고 출력

//	---------------------
//	0 1 2 3
//	1 2 3 4
//	2 3 4 5
//	3 4 5 6

		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
				System.out.print(arr[i][j] + " ");
			}// inner
			System.out.println();
		}// outer
	}// main
}