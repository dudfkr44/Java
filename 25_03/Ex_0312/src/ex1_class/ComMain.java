package ex1_class;

public class ComMain {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		
		System.out.println("c1");
		//company 변수(속성)는 private 접근제한자로 선언되었기 때문에
		//다른 클래스에서 사용할 수 없다.
		//c1.company = "LG";
		c1.getInfo();
		
		System.out.println("c2");
		c2.ssd = 512;
		c2.ram = 62;
		c2.cpu = 4.8f;
		c2.color = "gold";
		c2.getInfo();
	} // main
}
