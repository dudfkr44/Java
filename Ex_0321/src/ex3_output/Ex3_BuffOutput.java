package ex3_output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3_BuffOutput {
	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java\\bufOut.txt";

		File f = new File(path);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream(f);
			bos = new BufferedOutputStream(fos);
			String msg = "안녕, hi\n나도\n만들 수 있어.";
			bos.write(msg.getBytes());

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// OutputStream은 역순으로 닫는다.
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	} // main
}
