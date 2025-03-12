package work01;

import java.util.Scanner;

public class GuguMain { // class A
	public static void main(String[] args) {
//		클래스 A에서 입력받은 값에 해당하는 구구단을
//		클래스 B에서 출력하는 코드를 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 단수 : ");
		int dan = sc.nextInt();
		sc.close();
		Gugu gugudan = new Gugu();
		gugudan.printGugu(dan);

	} // main
}
