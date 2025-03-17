package homework;

import java.util.Random;

public class Scrambled {

	private String shake;

	public Scrambled() {
		shake = "";
	} // Scrambled

//	정답을 섞어서 문제로 만드는 메서드
	public String getQuestion(String answer) {
//		정답(answer)을 문자 단위로 끊어서 배열에 저장
		int[] intArr = new int[answer.length()];

		outer: for (int i = 0; i < intArr.length; i++) {

			intArr[i] = new Random().nextInt(answer.length());

			for (int j = 0; j < i; j++) {

				if (intArr[i] == intArr[j]) {
					continue outer;
				} // inner
			} // outer

		}

//		만들어진 난수대로 문자열을 저장
		for (int i = 0; i < intArr.length; i++) {
			shake += answer.charAt(intArr[i]);
		}
		return shake;
	} // getQuestion
}
