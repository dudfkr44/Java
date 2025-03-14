package homework;

import java.util.Random;

public class GameWork {
	private String[] strArr = { "APPLE", "HOPE", "VIEW", "CHANGE" };
	private String original;
	private String shuffled;

	public GameWork() {
		// 1. 단어 선택
		selectRandomWord();
		// 2. 문자 섞기
		shuffleCharacters();
	}

	private void selectRandomWord() {// 단어 선택 메서드
		original = strArr[new Random().nextInt(strArr.length)];
	}

	private void shuffleCharacters() {// 문자 섞기 메서드
		// 1. 수동으로 chars 배열 생성 (for문 사용)
		char[] chars = new char[original.length()];
		for (int i = 0; i < original.length(); i++) {
			chars[i] = original.charAt(i); // 각 문자를 직접 추출
		}

		// 2. for와 swap문으로 문자 섞기
		for (int i = chars.length - 1; i > 0; i--) {
			int j = new Random().nextInt(i + 1);
			// swap으로 문자열 자리 바꾸기
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}

		// 3. 섞인 문자열 생성
		shuffled = new String(chars);
	}

	// 섞인 단어 반환
	public String getShuffledWord() {
		return shuffled;
	}

	// 정답 확인
	public boolean checkAnswer(String guess) {// boolean형의 String 타입의 guess 변수를 불러 옴
		return original.equalsIgnoreCase(guess.trim());// 사용자가 추측해 입력한 문자열의 앞뒤 공백을 제거 후
//														저장한 값을 비교하는 값을 반환
	}

	// 원본 단어 반환 (정답 표시용)
	public String getOriginalWord() {
		return original;
	}
}