package work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {

//		배열 arr에 담긴 값들 중 가장 큰 값을 출력
//		--------------
//		가장 큰 값 : 19

		int[] arr = new int[6];
		int max = 0;

		System.out.print("배열의 값: ");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = new Random().nextInt(99) + 1;

			if (arr[i] > max) {
				max = arr[i];

			}

			System.out.print(arr[i] + (i < arr.length - 1 ? ", " : "\n"));
		}

//		배열 arr을 오름차순 정렬해서 출력.
//		오름차순 결과 : 1 4 7 13 15 19

		System.out.println("-------------------------");

		System.out.print("오름차순 결과 : ");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} // 오름차순 정렬 inner for
			} // 비교형 outer for
		}//
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.printf("\n가장 큰 값 : %d", arr[arr.length - 1]);

	} // main
}
