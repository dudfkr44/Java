package work03;

import java.util.Scanner;

public class WorkMain { // Class A
	public static void main(String[] args) {

//		클래스 A에서 입력받은 두 개의 값에 대한 최소공배수를
//		클래스 B에서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		sc.close();

		Test res = new Test();
		res.lcm(n1, n2);

	} // main
}
