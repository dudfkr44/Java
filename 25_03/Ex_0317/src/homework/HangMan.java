package homework;

import java.util.*;

public class HangMan {
	private String[] words; // 단어 배열
	private String selectedWord; // 선택된 단어
	private StringBuilder currentState; // 현재 상태 (☆ 또는 맞춘 문자)
	private Set<Character> guessedLetters; // 추측한 문자 집합

	// 생성자: 단어 배열을 받아 게임 초기화
	public HangMan(String[] words) {
		this.words = words;
		Random random = new Random();
		selectedWord = words[random.nextInt(words.length)].toLowerCase(); // 무작위 단어 선택
		currentState = new StringBuilder("☆".repeat(selectedWord.length())); // ☆로 초기화
		guessedLetters = new HashSet<>();
	}

	// 추측 처리 메서드
	public void guess(char letter) {
		if (guessedLetters.contains(letter)) {
			System.out.println("이미 추측한 문자입니다.");
			return;
		}
		guessedLetters.add(letter);
		if (selectedWord.indexOf(letter) >= 0) {
			// 맞춘 경우, 해당 위치에 문자 표시
			for (int i = 0; i < selectedWord.length(); i++) {
				if (selectedWord.charAt(i) == letter) {
					currentState.setCharAt(i, letter);
				}
			}
		} 
	}

	// 단어를 모두 맞췄는지 확인
	public boolean isWordGuessed() {
		return currentState.indexOf("☆") == -1;
	}


	// 현재 상태 반환
	public String getCurrentState() {
		return currentState.toString();
	}

	// 추측한 문자 집합 반환
	public Set<Character> getGuessedLetters() {
		return guessedLetters;
	}

	// 선택된 단어 반환 (게임 종료 시 공개용)
	public String getSelectedWord() {
		return selectedWord;
	}

	public String[] getWords() {
		return words;
	}

}