package starPyramid;

import java.util.Scanner;

public class StarMain {
//		 * 문제 설명: 사용자로부터 양의 정수(예: 5)를 입력받은 후, 입력된 수 만큼의 줄에 걸쳐 별(*)로 구성된 피라미드를 출력하는 프로그램을
//		 * 작성하세요. 피라미드는 다음과 같이 출력되어야 합니다. (예를 들어 입력 값이 5일 경우)
//		     *
//		    ***
//		   *****
//		  *******
//		 *********
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("피라미드의 높이 : ");
		int h = sc.nextInt();
		Star s = new Star();
		s.starChar(h);
		sc.close();

	} // main
}
