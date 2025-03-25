package ex9_homework_pra;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ScoreLoader {

	RpsUser ru;

	public RpsUser getRu() {
		return ru;
	} // getRu

	public RpsUser loader(String id) {
		String path = "C:\\Users\\user1\\git\\Java\\RpsGame\\" + id + "\\userInfo.sav";
		File dir = new File(path);

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		if (dir.exists()) {
			try {
				fis = new FileInputStream(dir);
				ois = new ObjectInputStream(fis);

				ru = (RpsUser) ois.readObject();
				System.out.println("볼러오기 성공");

			} catch (Exception e) {
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (IOException e) {
					System.out.println("볼러오기 실패");
					e.printStackTrace();
				}
			} // try-catch-finally

		} else {
			System.out.println("가입을 환영합니다.");
		} // if-else

		return ru;

	}

}
