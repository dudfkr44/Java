package work;

import java.util.Scanner;

public class Ex2_homework {
	public static void main(String[] args) {

//		1 ~ 100까지 반복하는 for문에서
//		사용자가 입력받은 숫자보다 큰 첫번째 숫자가 나왔을 때 종료
//		값 : 7
//		1
//		2
//		3
//		...
//		8
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		int num = sc.nextInt();
		if(num >= 101 ) {
			System.out.println("1부터 100까지 사이의 수를 입력하세요");
		} else {//if-else
			for (int i = 1; i <= 100; i++) {
			if (i > num + 1) {
				break;
			}// inner if
			System.out.println(i);
			}// for
		}//else

	} // main
}
