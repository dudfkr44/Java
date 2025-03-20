package Ex5_file;

import java.io.File;

public class Ex4_File {

	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java\\abcd";
		File f = new File(path);

		// path 경로의 존재 여부 확인
		if (!f.exists()) {// (f.exists() == false)
			System.out.println("폴더를 생성합니다.");
			f.mkdirs();// 폴더 생성
		} else {
			System.out.println("이미 존재하는 폴더입니다.");
		}

	} // main

}
