package week_exam;

public class Ex6_week {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				continue;
			sum += i;
		}
		System.out.printf("1부터 10까지의 수에서 홀수의 합은 %d입니다.", sum);
	} // main
}
