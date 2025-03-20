package ex1_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_List {
	public static void main(String[] args) {

//		숫자를 입력하세요.(입력 종료 : 0)
//		45
//		17
//		20
//		21
//		0
//		원하는 숫자 범위를 입력하세요.
//		시작 : 15
//		끝 : 20
//		범위 내의 숫자들
//		17 20
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("입력(종료는 0): ");
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			list.add(input);
		}

		System.out.println("원하는 숫자 범위를 입력하세요.");
		System.out.print("시작 : ");
		int num1 = sc.nextInt();
		System.out.print("끝 : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) >= num1 && list.get(i) <= num2) {
//				result.add(list.get(i));
//			} else {
//				continue;
//			}

		for (int num : result)
			if (num >= num1 && num <= num2) {
				System.out.print(num + " ");
			} else {
				continue;
			}

		sc.close();
		System.out.println("범위 내의 숫자들\n" + result);

	} // main
}
