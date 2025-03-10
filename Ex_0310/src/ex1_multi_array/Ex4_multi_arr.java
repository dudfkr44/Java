package ex1_multi_array;

public class Ex4_multi_arr {
	public static void main(String[] args) {
//		2차원 배열 arr에 담긴 모든 값의 합과 평균을 출력
//		-------------
//		총합 : 87
//		평균 : 5.4

		int[][] arr = { { 5, 8, 3, 5 }, { 11, 6, 3 }, { 1, 2, 5, 9, 12 }, { 7, 3, 1, 6 } };
		int sum = 0;
		int num = 0;
		float avg = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				num++;
			} // inner
		} // outer
		System.out.println("총 합 : " + sum);
		avg = (float) sum / num;
		System.out.printf("평 균 : %.1f", avg);

	} // main
}
