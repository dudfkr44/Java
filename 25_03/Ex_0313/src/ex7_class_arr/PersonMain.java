package ex7_class_arr;


public class PersonMain {
	public static void main(String[] args) {
		
		Person[] person = new Person[2];
		
//		클래스를 배열화 하면 메모리 할당을 위한 주소만 배치를 받기 때문에
//		실제로 메모리 할당을 받으려면 각 index 별로 명시적 객체 생성을 수행해 줘야 함
		
		for(int i = 0; i < person.length; i++) {
			person[i] = new Person();
		}
		
		person[0].setName("홍길동");
		person[0].setAge(20);
		
		person[1].setName("박길동");
		person[1].setAge(22);
		
		for(int i = 0; i < person.length; i++) {
		System.out.printf("| %s | %d세 |\r\n", person[i].getName(), person[i].getAge());
		}
		
		
		//홍길동 / 20
		//박길동 / 22
		
		
	} // main
}
