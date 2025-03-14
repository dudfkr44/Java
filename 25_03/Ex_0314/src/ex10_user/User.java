package ex10_user;

public class User {

	private String name;
	private int age;

	public User(String name, int age) {
		this.age = age;
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

}
