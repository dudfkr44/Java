package ex8_objstream;

import java.io.Serializable;

//	ObjectStream을 통해 저장하거나 읽어올 클래스라면 객체의 직렬화가 필수입니다.
//	메모리에 흩어져 있는 멤버들을 한 번에 읽거나 쓸 수 있도록
//	새로운 메모리 영역에 일렬로 만들어서 복사해두는 과정을
//	'객체의 직렬화'라고 한다.

public class User implements Serializable {
	private String name;
	private int age;
	private String tel;

	public User() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
