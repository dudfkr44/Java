package ex9_homework_pra;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreWriter {
	public void writer(RpsUser ru) {

		String path = "C:\\Users\\user1\\git\\Java\\RpsGame\\" + ru.getId();
		File dir = new File(path);

		if (!dir.exists()) {
			dir.mkdirs();
		}

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {

			fos = new FileOutputStream(path + "\\userInfo.sav");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(ru);

			System.out.println("저장 성공");

		} catch (Exception e) {
			System.out.println("저장 실패");
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // writer
}
