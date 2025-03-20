package ex4_list;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;



	public int getSum() {

		sum = kor + eng + math;

		return sum;
	}

	public float getAvg() {

		avg = (float) (kor + eng + math) / 3;
		return avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
