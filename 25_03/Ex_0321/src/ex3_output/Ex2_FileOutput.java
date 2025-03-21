package ex3_output;

import java.io.File;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java\\output예제.txt";
		File f = new File(path);

		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream(f, true);

			String msg = "새로운 내용";

			fos.write(msg.getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	} // main
}
