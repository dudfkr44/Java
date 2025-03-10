package work;

import java.util.Random;
import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
//		배열의 크기 입력 : 5
//		0번 인덱스 : 5
//		1번 인덱스 : 3
//		2번 인덱스 : 2
//		3번 인덱스 : 11
//		4번 인덱스 : 20

		System.out.print("배열의 크기: ");
		Scanner sc = new Scanner(System.in);
		int arrCnt = sc.nextInt();
		int[] arr = new int[arrCnt];
		int evenN = 0;
		int oddN = 0;

		for (int i = 0; i < arrCnt; i++) {
			arr[i] = new Random().nextInt(101) + 1;
			System.out.printf("%d번 인덱스: %d\n", i, arr[i]);

			if (arr[i] % 2 == 0) {
				evenN++;
			} else {
				oddN++;
			}

		}
		System.out.printf("짝수의 개수: %d\n", evenN);
		System.out.printf("홀수의 개수: %d\n", oddN);

		sc.close();

	} // main
}
