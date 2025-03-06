package work;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {

//		1부터 키보드에서 입력받은 숫자까지 순차적으로 출력하는 코드를 작성하되,
//		5의 배수이거나 1의 자리가 3인 경우는 제외하고 출력.
//		1
//		2
//		4
//		6
//		7
//		8
//		9
//		11
//		12
//		14

		Scanner sc = new Scanner(System.in);

		System.out.print("최대값: ");
		int max = sc.nextInt();

		out: for (int i = 1; i <= max; i++) {
			if (i % 5 == 0 || i % 10 == 3)
				continue out; // if
			System.out.println(i);
		} // for
		sc.close();

	} // main
}
