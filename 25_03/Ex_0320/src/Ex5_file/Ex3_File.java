package Ex5_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java";
		File f = new File(path);
		//path 경로의 하위 요소를 File[] 구조로 받으면
		//index를 통해 파일의 존재 여부, 디렉토리 구별 등의 기능을 함께 사용할 수 있다.
		File[] f2 = f.listFiles();

		
		for (int i = 0; i < f2.length; i++) {
			if (f2[i].isFile()) {
				System.out.println(f2[i].getName());
			} // if
		} // for

	} // main
}
