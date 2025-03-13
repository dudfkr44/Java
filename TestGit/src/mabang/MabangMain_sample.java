package mabang;

import java.util.Scanner;

public class MabangMain_sample {
	public static void main(String[] args) {
//		마방진 크기 : 3
//		8 1 6
//		3 5 7
//		4 9 2
		// 홀수 입력 검증
		Scanner sc = new Scanner(System.in);
		int size = 0;
		boolean stop = false;
		
		while(stop != true) {
			System.out.print("마방진 크기 :");
			size = sc.nextInt();
			if(size % 2 == 0 || size == 1) {
				System.out.println("1을 제외한 홀수만 입력이 가능합니다.");
				continue;
			} else {
				if(!sc.hasNextInt()) {
					System.out.println("숫자를 입력하세요.");
					continue;
				} else {
					stop = true;
				}
			}
		}
		
		
		Mabang mabang = new Mabang();
		mabang.getMabang(size);
		
		
		
		
	}
}
