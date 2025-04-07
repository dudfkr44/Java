package kh.model.vo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Food implements Serializable {

	private String name;
	private int kcal;

	public Food() {
	}

	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	} // Food

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return name + "(" + kcal + " kcal)";
	}

    public void fileSave(String fileName) {
        Food apple = new Food("사과", 20);
        String path = "C:\\Test\\";
        File f = new File(path);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path + fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(apple);
            System.out.println("저장 성공!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    } // fileSave
}