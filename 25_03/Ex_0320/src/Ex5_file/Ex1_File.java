package Ex5_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {

//		IO(Input, Output)
//		io는 입출력 스트림을 의미
//		스트림이란, 데이터는 입력 또는 출력하기 위한 방법(통로)
//		JVM에서 콘솔로 값을 보내는 것을 출력(Output)
//		콘솔에서 JVM으로 값을 읽는 것을 입력(Input)
		
		String path = "C:\\Users\\user1\\git\\Java\\test.txt";
		
		File f = new File(path);
		
		
		//file 클래스의 생성 경로가 폴더가 아니라 파일 구조인 경우에 if문으로 들어와야 함
		if(f.isFile()) {
			System.out.println("파일의 크기 : " + f.length() + "byte");
		}
		
		
		
		
		

	} // main
}
