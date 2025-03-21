package Ex8_work;

import java.util.Random;

public class Work1 {
	public static void main(String[] args) {

//		0 ~ 9 사이의 난수 100개를 저장하는 배열을 만들고
//		해당 배열이 가지고 잇는 각 방의 난수를 판별하여 그래프화
//		----------------------------------------

		Random rnd = new Random();
		int[][] arr = new int[5][20]; // 5x20 배열 (5개의 행, 각 행 20개 요소)
		char graph = '#';

		// 배열 초기화 및 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rnd.nextInt(10);
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		// 전체 배열의 숫자별 개수 세기 및 그래프 출력
		int[] count = new int[10]; // 0~9 개수 저장 배열

		// 전체 배열 순회
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int num = arr[i][j];
				count[num]++; // 해당 숫자 인덱스 증가
			}
		}

		// 그래프 출력
		System.out.println("\n전체 그래프:");
		for (int num = 0; num <= 9; num++) {
			System.out.print(num + "의 갯수 : ");
			for (int k = 0; k < count[num]; k++) {
				System.out.print(graph);
			}
			System.out.printf("\t\t(%d개)\n", count[num]);
		}
	}
}