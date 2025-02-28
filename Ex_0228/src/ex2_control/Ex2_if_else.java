package ex2_control;

public class Ex2_if_else {

	public static void main(String[] args) {

		/*
		 * if(조건식){ 조건식이 참일 때 실행되는 영역 } else { 조건식이 거짓일 때 실행되는 영역 }
		 */

		int n = 45;
		String s1 = "하이";

		if (++n >= 50) {
			s1 = "n은 50 이상의 수입니다.";
		} else {
			s1 = "n은 50 미만의 수입니다.";
		}

		System.out.println(n);
		System.out.println(s1);

		System.out.println("-------------");

		// 변수 age에 나이를 대입하고
		// 30세 이상이면 "드실만큼 드셨군요."를 출력
		// 그렇지 않으면 "조금 더 드셔도 되겠어요."를 출력
		int age = 36;

		if (age >= 30) {
			s1 = "드실만큼 드셨군요.";
		} else {
			s1 = "조금 더 드셔도 되겠어요.";
		}

		System.out.println("나이 : " + age + "세");
		System.out.println(s1);

		System.out.println("-------------");

		/*
		 * 변수 age에 나이를 대입하고 30세 이상이면 "드실만큼 드셨군요."를 출력 그렇지 않으면 "조금 더 드셔도 되겠어요."를 출력
		 */
		age = 27;
		
		System.out.println("나이 : " + age + "세");
		System.out.println(age >= 30 ? "드실만큼 드셨군요." : "조금 더 드셔도 되겠어요.");
		
		age = 35;
		
		String res = age >= 30 ? "드실만큼 드셨군요." : "조금 더 드셔도 되겠어요.";
		
		System.out.println("나이 : " + age + "세");
		System.out.println(res);
	} // main
}