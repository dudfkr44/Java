package ex2_buffered_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex2_BuffInput {
	public static void main(String[] args) {

//		exam.txt의 내용을 읽어서 입력받은 문장의 출현 빈도를 출력
//		-------------
//		입력값 : a
//		a의 갯수 : 4
//		
//		입력값 : abca
//		abca의 갯수 : 2

		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\user1\\git\\Java\\exam.txt";
		File f = new File(path);
		byte[] read = new byte[(int) f.length()];
		int count = 0;

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		// 사용자로부터 찾을 문자 입력 (예: 'n')
		System.out.print("입력값 : ");
		char input = sc.next().charAt(0); // 찾을 문자 입력

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				bis = new BufferedInputStream(fis);
				// 전체 파일을 byte[]에 읽기
				bis.read(read);

				// byte[]를 문자열로 변환하여 출력

				System.out.println(new String(read));

				// byte[]의 각 바이트를 char로 변환하며 비교
				for (byte b : read) {
					char currentChar = (char) b;
					if (currentChar == input) {
						count++;
					}
				}
				System.out.printf("%c의 갯수 : %d\n", input, count);
				sc.close();

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bis.close();
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}// main
}