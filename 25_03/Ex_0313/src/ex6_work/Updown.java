package ex6_work;

import java.util.Random;
import java.util.Scanner;

public class Updown {// Class B

	private int cnt;
	private int answer = new Random().nextInt(50) + 1;
	public void check(int user) {
		Scanner sc = new Scanner(System.in);
		do {
			if(cnt != 0) {
			System.out.print("입력 : ");
			user = sc.nextInt();
			}
			cnt++;
			if (user > 50 || user < 1) {
				System.out.println("1부터 50까지의 수 중 하나를 입력하세요.");
				continue;
			} else if (user <= 50 || user >= 1) {
				if (user < answer) {
					System.out.println("Up!");
					continue;
				} else {
					if (user == answer) {
						System.out.printf("%d회 만에 정답!\n", cnt);
						return;
					} else {
						System.out.println("Down!");
						continue;
					}
				}
			}
			sc.close();
		} while (user != answer);
	}
}
