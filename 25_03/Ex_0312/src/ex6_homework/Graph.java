package ex6_homework;

import java.util.Random;

public class Graph {
	public void prgraph(int n) {

		// 1. 100개 난수 생성
		int[] counts = new int[10]; // 0~9 숫자 배열
		int[] numbers = new int[n]; // 100개의 난수 배열

		System.out.println("생성된 난수:");
		for (int i = 0; i < n; i++) {
			numbers[i] = new Random().nextInt(10); // 0~9 난수를 number 각 배열에 넣음
			System.out.print(numbers[i] + " ");// number 배열에 들어간 값을 각 번호마다 출력
			if ((i + 1) % 20 == 0) {
				System.out.println(); // 20개마다 줄바꿈
			}
		}

		// 2. 빈도수 계산
		for (int num : numbers) {
			counts[num]++;
		}

		// 3. 결과 출력
		System.out.println("\n각 숫자의 빈도 수:");
		char graphChar = '#';
		for (int i = 0; i < 10; i++) {
			String graph = "";
			for (int j = 0; j < counts[i]; j++) {
				graph += (char) graphChar; // 예: ### (3개)
			}
			if (graph.equalsIgnoreCase("")) {
				graph = "없음";
			}
			// 동적 간격 계산: 최대 너비 + # 개수
			int maxWidth = 80;
			System.out.printf("%d의 갯수 : %-" + maxWidth + "s\t(%02d개)\n", i, graph, counts[i]);
		}
	}// prgraph
}
