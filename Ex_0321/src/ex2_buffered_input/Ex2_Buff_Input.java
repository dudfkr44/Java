package ex2_buffered_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex2_Buff_Input {
	public static void main(String[] args) {

//		fis와 bis를 연결하여 파일을 읽을 때 버퍼링 작업을 수행하도록 한다.
//		버퍼링이란, 출력할 데이터를 버퍼라는 메모리 영역에 byte[] 형식으로
//		저장 후 한 번에 출력하는 것
//		버퍼 영역은 파일을 쓰고 받기 위해 마련된 메모리의 한 부분으로써
//		입출력만을 위해 사용되므로 효율적인 자료 관리가 용이

		String path = "C:\\Users\\user1\\git\\Java\\test.txt";
		File f = new File(path);
		byte[] read = new byte[(int) f.length()];

		if (f.exists()) {

			FileInputStream fis = null;
			BufferedInputStream bis = null;

			try {
				fis = new FileInputStream(f);
				bis = new BufferedInputStream(fis);
				bis.read(read);

				System.out.println(new String(read));

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					bis.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	} // main
}
