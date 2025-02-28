package ex_work;

public class Ex1_work {
	public static void main(String[] args) {

		// main - [Ctrl + Spacebar] = public static void main(String[] args) {}
		// syso - [Ctrl + Spacebar] = System.out.println();
		// Ctrl + / : 한줄주석
		// Ctrl + Shift + / : 다중주석
		// Ctrl + Shift + \ : 다중주석 해제
		// Ctrl + Shift + F : 코드 정렬
		// Ctrl + i : 코드 정렬2
		// Ctrl + Alt + (상하방향키) : 라인 복사

		/*
		 * 과수원이 있다. 배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 양은 각각 5개, 7개, 5개다. 과수원에서 하루에 생산되는 과일의
		 * 총 갯수를 출력하고 시간당 전체 과일의 평균 생산갯수를 출력
		 * 
		 * 단, 과일의 갯수와 평균값을 담을 변수는 float으로 할 것.
		 */

		int pear = 5;
		int apple = 7;
		int orange = 5;

		int sum = pear + apple + orange;
		// float avg = sum/24F;
		float avg = (float) sum / 24;

		System.out.println("하루에 생산되는 과일의 총 갯수는 " + sum + "개입니다.");
		System.out.println("1시간당 전체 과일의 평균 생산 갯수는 " + avg + "개입니다.");

	} // main
}
