package work;

import java.util.Random;
import java.util.Scanner;

public class Ex5_homework {
    public static void main(String[] args) {

        // 100 ~ 999 사이의 세자리 난수를 생성합니다.
        int randomNum = new Random().nextInt(900) + 100;
        int[] secret = new int[3];
        secret[0] = randomNum / 100;         // 백의 자리
        secret[1] = (randomNum / 10) % 10;     // 십의 자리
        secret[2] = randomNum % 10;            // 일의 자리

        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("숫자 야구 게임을 시작합니다!");

        // 정답(3 Strike)이 될 때까지 반복
        while (true) {
            int strike = 0;
            int ball = 0;
            count++;

            System.out.print(">> ");
            int input = sc.nextInt();

            int[] guess = new int[3];
            guess[0] = input / 100;         // 백의 자리
            guess[1] = (input / 10) % 10;     // 십의 자리
            guess[2] = input % 10;            // 일의 자리

            // 매칭된 자리를 체크하기 위한 배열 (각각 secret과 guess에 대해)
            boolean[] secretMatched = new boolean[3];
            boolean[] guessMatched = new boolean[3];

            // 1. Strike 판별 (동일한 자리에서 숫자가 같으면)
            for (int i = 0; i < 3; i++) {
                if (guess[i] == secret[i]) {
                    strike++;
                    secretMatched[i] = true;
                    guessMatched[i] = true;
                }
            }

            // 2. Ball 판별 (자리는 다르지만 동일한 숫자가 있는 경우)
            for (int i = 0; i < 3; i++) {
                if (!guessMatched[i]) { // 이미 Strike로 매칭된 건 제외
                    for (int j = 0; j < 3; j++) {
                        if (!secretMatched[j] && guess[i] == secret[j]) {
                            ball++;
                            secretMatched[j] = true; // 해당 secret 자리는 더 이상 사용하지 않음
                            break;
                        }
                    }
                }
            }

            // 결과 출력
            if (strike == 0 && ball == 0) {
                System.out.println("----------------------------");
                System.out.println("Out!");
            } else if (strike == 3) {
                System.out.println("----------------------------");
                System.out.println(count + "회만에 정답!");
                break;
            } else {
                System.out.println("----------------------------");
                System.out.println(strike + " Strike, " + ball + " Ball");
            }
            System.out.println("----------------------------");
        }

        System.out.println("정답 : " + randomNum);
        sc.close();
    }
}
