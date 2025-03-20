package starPyramid;

public class Star {
//		 * 문제 설명: 사용자로부터 양의 정수(예: 5)를 입력받은 후, 입력된 수 만큼의 줄에 걸쳐 별(*)로 구성된 피라미드를 출력하는 프로그램을
//		 * 작성하세요. 피라미드는 다음과 같이 출력되어야 합니다. (예를 들어 입력 값이 5일 경우)
//		     *
//		    ***
//		   *****
//		  *******
//		 *********

	public void starChar(int h) {

		while (true) {
			if (h <= 1) {
				System.out.println("1보다 큰 수를 입력하세요.");
				continue;
			} else {
				break;
			}
		}

		for (int i = 1; i <= h; i++) {
			for (int j = 0; j < h - i; j++) {
				System.out.print(" ");
			} // inner
			for (int k = 0; k <= (2 * i) - 2; k++) {
				System.out.print("*");
			} // inner
			System.out.println();
		} // outer
		
		for (int i = h - 1; i < 0; i++) {
			for (int j = 1; j < h; j++) {
				System.out.print(" ");
			} // inner
			for (int k = i; k <= i; k--) {
				System.out.print("*");
			} // inner
			System.out.println();
		} // outer

	} // starChar

}
