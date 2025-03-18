package ex10_thread;

import java.util.Scanner;

public class TMain {
	public static void main(String[] args) {

//		메인에서 입력받은 정수를
//		스레드를 상속받고 있는 클래스 B에서 1씩 감소시키면서 출력
//		---------
//		값 : 5
//		5
//		4
//		3
//		2
//		1
		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		int num = sc.nextInt();
		ThreadA ta = new ThreadA();
		ta.setNum(num);
		ta.start();
		sc.close();

	} // main
}
