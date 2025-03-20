package ex7_homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_homework {
	public static void main(String[] args) {

//		exam.txt의 내용을 읽어서 숫자들의 합만 출력

		String path = "C:\\Users\\user1\\git\\Java\\exam.txt";// path 변수에 불러올 파일의 경로를 저장

		File f = new File(path);// 파일을 불러올 방식을 선언할 File 클래스의 f 변수 선언
		byte[] read = new byte[(int) f.length()];// txt 안의 내용의 길이 만큼 바이트를 불러오 read의 바이트 배열 선언

		if (f.exists()) { // 파일일 존재할 경우를 판단

			FileInputStream fis = null; // 파일인풋스트림 fis 변수 선언

			try {
				fis = new FileInputStream(f); // f에 담긴 파일을 불러올 fis라는 변수의 통로를 생성
				fis.read(read);// 변수 fis를 통해 read 메서드로 read 배열에 담긴 값을 불러옴

				String res = new String(read); // 불러온 read 배열의 값을 문자열 형태로 변환 후 문자열 형태의 변수 res에 저장
				int sum = 0; // 숫자의 합을 담을 변수 sum 선언
				for (int i = 0; i < res.length(); i++) { // 문자열 변수 res의 길이 만큼 검사
					char c = res.charAt(i); // 문자 변수 c에 res의 i번째 문자를 저장
					if (c >= '0' && c <= '9') { // c가 문자 0 ~ 9까지 문자에 해당하는지 판별
						// ➊ 문자를 숫자로 변환 후 합산
						sum += c - '0'; // ASCII 코드 값 차이 이용
						// 문자 c 변수에 들어간 값에 문자 '0'의 값을 차를 이용해 숫자 변환 후 sum에 저장
					}
				}
				System.out.println(res); // 원래의 문자열 값을 출력
				System.out.println("숫자들의 합: " + sum); // 숫자로 변환된 값을 출력

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	} // main
}