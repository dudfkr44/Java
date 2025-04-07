package work_exam;

public class Ex01_work {
	public static void main(String[] args) {
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
		float avg = sum / 3;
		
		
		
		System.out.printf("과수원에서 하루에 생산되는 과일의 총 갯수는 %d개이고, 시간당 생산되는 과일의 갯수 평균값은 %.1f개입니다.\n", sum, avg);
		

	} // main
}
