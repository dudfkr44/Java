package ex6_work_exam;

import java.util.Random;

public class Updown {
    private int cnt;
    private int answer = new Random().nextInt(50) + 1; // 1~50 범위

    // Boolean 타입 반환 함수
    public boolean check(int user) {
        cnt++;
        
        if (user < 1 || user > 50) { // 유효성 검사
            System.out.println("1부터 50까지의 수 중 하나를 입력하세요.");
            return false;
        }
        
        if (user == answer) {
            System.out.printf("%d회 만에 정답!\n", cnt);
            return true;
        } else {
            System.out.println(user < answer ? "Up!" : "Down!");
            return false;
        }
    }
}