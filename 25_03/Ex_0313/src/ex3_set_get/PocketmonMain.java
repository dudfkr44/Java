package ex3_set_get;

public class PocketmonMain {
	public static void main(String[] args) {
		Pocketmon p1 = new Pocketmon();
		p1.setAttri("전기");
		p1.setName("라이츄");
		System.out.println(p1.getAttri());
		System.out.println(p1.getName());

		System.out.println("---------------");

		Pocketmon p2 = new Pocketmon();
		p2.setAttri("불");
		p2.setName("파이리");
		System.out.println(p2.getAttri());
		System.out.println(p2.getName());

		System.out.println("---------------");

		Pocketmon p3 = new Pocketmon();
		p3.setAttri("물");
		p3.setName("꼬부기");
		System.out.println(p3.getAttri());
		System.out.println(p3.getName());
	} // main
}
