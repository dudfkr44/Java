package ex1_test;

public class Test01 {
	public static void main(String[] args) {

		System.out.println("Hello, World!!");

		int pear = 5; //배를 pear로 잡고 int 자료형인 변수에 5를 집어넣음.
		int apple = 7; //사과를 apple로 잡고 int 자료형인 변수에 7을 집어넣음.
		int orange = 5; //오렌지를 orange로 잡고 int 자료형인 변수에 5를 집어넣음.
		int sum; //변수의 합을 담을 자료형 int의 sum을 설정
		float avg; //변수의 평균값을 담을 자료형 float의 avg를 설정

		sum = pear + apple + orange; //각 변수의 합을 더한 값을 변수 sum에 집어넣음
		avg = sum / 24F; //변수 avg의 자료형이 float이므로 하루를 24시간으로 나눌 때 24의 자료형을 float로 바꿈

		System.out.println("과수원의 하루 생산량은 " + sum + "개이고, 시간당 평균 생산량은 " + avg + "개입니다.");
		//각 자료의 대입한 변수를 집어넣어 출력값을 완성 

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
