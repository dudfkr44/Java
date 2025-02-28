package ex1_test;

public class Test01 {
	public static void main(String[] args) {

		System.out.println("Hello, World!!");

		int pear = 5;
		int apple = 7;
		int orange = 5;
		int sum;
		float avg;

		sum = pear + apple + orange;
		avg = sum / 24F;

		System.out.println("과수원의 하루 생산량은 " + sum + "개이고, 시간당 평균 생산량은 " + avg + "개입니다.");

		System.out.println("----------------");

		int age = 30;
		String str;

		if (age >= 30) {
			str = "드실 만큼 드셨네요.";
		} else {
			str = "조금 더 드셔도 되겠어요.";
		}
		System.out.println("현재 나이는 " + age + "세입니다.");
		System.out.println(str);

		System.out.println("----------------");

		age = 27;

		System.out.println("현재 나이는 " + age + "세입니다.");
		System.out.println(age >= 30 ? "드실 만큼 드셨네요." : "조금 더 드셔도 되겠어요.");

	}
}
