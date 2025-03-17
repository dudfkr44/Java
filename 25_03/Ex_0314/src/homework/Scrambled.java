package homework;

import java.util.Random;

public class Scrambled {

    private String shake;

    public Scrambled() {
        shake = "";
    } // Scrambled

    // 정답을 섞어서 문제로 만드는 메서드
    public String getQuestion(String answer) {
        // 메서드 호출마다 shake를 초기화하여 누적 방지
        shake = "";

        // 정답(answer)의 길이만큼 난수 인덱스를 저장할 배열
        int[] intArr = new int[answer.length()];
        boolean[] used = new boolean[answer.length()]; // 중복 체크용 배열

        // 중복 없는 난수 생성
        Random rand = new Random();
        for (int i = 0; i < intArr.length; i++) {
            int num;
            do {
                num = rand.nextInt(answer.length());
            } while (used[num]); // 이미 사용된 인덱스면 다시 생성
            intArr[i] = num;
            used[num] = true; // 사용된 인덱스 표시
        }

        // 만들어진 난수대로 문자열을 저장
        for (int i = 0; i < intArr.length; i++) {
            shake += answer.charAt(intArr[i]);
        }
        return shake;
    } // getQuestion
}