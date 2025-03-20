package ex6_file_input;

import java.io.File;
import java.io.FileInputStream;

public class Ex1_FileInput {
	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java\\test.txt";

		File f = new File(path);

		if (f.exists()) {

			// 파일과 연결된 입력 스트림 생성
			try {
				FileInputStream fis = new FileInputStream(f);

				int code = 0;

				//스트림은 더 이상 읽을 것이 없다면 -1을 반환
				//반복문을 통해서 파일의 내용을 읽고 더 이상 읽을 것이 없는 
				//파일의 끝(EOF)인 -1을 만나면 중단된다.
				while ((code = fis.read()) != -1) {

					System.out.print((char) code);

				} // while
				
				//스트림을 사용한 후에는 반드시 닫아줘야 한다.
				fis.close();

			} catch (Exception e) {
				System.out.println("파일을 찾을 수 없습니다.");
				e.printStackTrace();
			}

			System.out.println();
		}

	} // main
}
