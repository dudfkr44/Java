package exam;

import java.util.Scanner;

//문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열이라고 합니다.
//꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다.
//예를 들어 문자열 리스트 ["abc", "def", "ghi"]가 있고 문자열 "ef"를 포함한 문자열은 제외하고
//꼬리 문자열을 만들면 "abcghi"가 됩니다.

class Solution {
	public void count() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println(str.length() + "글자 입니다.");
				
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}