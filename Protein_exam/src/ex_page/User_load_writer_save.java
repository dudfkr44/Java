package ex_page;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class User_load_writer_save 
{
	User user;
	public User_load_writer_save() 
	{
		// TODO Auto-generated constructor stub
	}
	
	// User 객체가 주어질 때, user 객체의 ID에 따라 경로를 설정
	public User_load_writer_save(User user) 
	{
		this.user = user;
	}

	public User load() 
	{
		// user 객체의 ID를 기반으로 디렉토리 경로 설정
		String dir_r = "C:/4jo/Protein/User/" + user.getId();
		File dir = new File(dir_r);

		// 해당 디렉토리가 없다면 새로 생성
		if (!dir.exists()) 
		{
			dir.mkdirs(); // 새 디렉토리 생성

			// 새로 생성된 디렉토리에 userInfo.sav 파일을 생성하고 저장
			File f = new File(dir_r, "userInfo.sav");
			try (FileOutputStream fos = new FileOutputStream(f); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(user); // user 객체를 파일에 저장
				oos.flush();
			} catch (Exception e) {
				System.out.println("유저 정보 저장 실패");
			}

			return user; // 새로운 유저 객체 반환
		} 
		else 
		{
			// 디렉토리가 존재하면 userInfo.sav 파일을 로드
			File f = new File(dir_r, "userInfo.sav");
			if (f.exists()) 
			{
				try 
				{
					FileInputStream fis = new FileInputStream(f); 
					ObjectInputStream oi = new ObjectInputStream(fis);
					user = (User) oi.readObject(); // 저장된 user 객체를 불러옴
				} 
				catch (Exception e) 
				{
					System.out.println("유저 정보 로드 실패");
				}
			} 
			else 
			{
				// userInfo.sav 파일이 존재하지 않으면, 디렉토리 생성 후 저장
				try (FileOutputStream fos = new FileOutputStream(f);
						ObjectOutputStream oos = new ObjectOutputStream(fos)) 
				{
					oos.writeObject(user); // 새 파일에 user 객체 저장
					oos.flush();
				} 
				catch (Exception e) 
				{
					System.out.println("유저 정보 저장 실패");
				}
			}//else

			return user; // 로드된 user 객체 반환
		}

	}//load
	
	public User load(String id)
	{
		String dir_r = "C:/4jo/Protein/User/" + id.trim();
		File f = new File(dir_r, "/userInfo.sav");
		try 
		{
			FileInputStream fis = new FileInputStream(f); 
			ObjectInputStream oi = new ObjectInputStream(fis);
			user = (User) oi.readObject(); // 저장된 user 객체를 불러옴
		} 
		catch (Exception e) 
		{
			System.out.println("유저 정보 로드 실패");
		}
		return user; // 로드된 user 객체 반환
	}
}
