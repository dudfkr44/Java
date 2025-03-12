package work;

import java.util.Scanner;

public class Ex7_homework_exam {
	public static void main(String[] args) {
//		마방진 크기 : 3
//		8 1 6
//		3 5 7
//		4 9 2
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        int[][] arr; // 마방진을 저장할 2차원 배열 선언
        int num = 1; // 숫자 카운트 변수 (1부터 시작)
        int y = 0; // 행 (row) 인덱스
        int x = 0; // 열 (column) 인덱스

        System.out.print("마방진 크기 : "); // 사용자에게 마방진 크기 입력 요청
        int size = sc.nextInt(); // 사용자로부터 마방진 크기 입력받기
        arr = new int[size][size]; // 입력받은 크기의 2차원 배열 생성

        x = size / 2; // 첫 번째 숫자의 위치를 첫 행의 가운데 열로 설정

        while (num <= size * size) { // num이 size의 제곱보다 작거나 같을 때까지 반복

            arr[y][x] = num; // 현재 위치에 num 저장

            if (num % size == 0) { // 만약 num이 size의 배수라면
                y++; // 바로 아래 행(y+1)으로 이동
            } else { // 그렇지 않으면
                y--; // 위쪽 행(y-1)으로 이동
                x++; // 오른쪽 열(x+1)으로 이동
            }

            if (y < 0) { // 만약 y 값이 배열의 범위를 벗어나면 (맨 위쪽을 벗어난 경우)
                y = size - 1; // y를 마지막 행으로 이동
            }
            if (x >= size) { // 만약 x 값이 배열의 범위를 벗어나면 (맨 오른쪽을 벗어난 경우)
                x = 0; // x를 첫 번째 열로 이동
            }

            num++; // 숫자를 1 증가시켜 다음 숫자로 이동
        }

        // 마방진 출력 (2중 for문 사용)
        for (int i = 0; i < arr.length; i++) { // 행을 반복
            for (int j = 0; j < arr[i].length; j++) { // 열을 반복
                System.out.printf("%02d ", arr[i][j]); // 배열 값 출력 (2자리 숫자로 정렬)
            }
            System.out.println(); // 한 행을 출력한 후 줄바꿈
        }

        sc.close(); // Scanner 닫기 (메모리 누수 방지)
    } // main 메서드 종료
} // 클래스 종료
