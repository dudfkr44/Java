package ex9_pen;

public class PenMain {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		Pen p2 = new Pen();
		System.out.println(p1.getColor());
		System.out.println(p1.getCompany());
		System.out.println(p1.getPrice());

		System.out.println("------------");

		System.out.println(p2.getColor());
		System.out.println(p2.getCompany());
		System.out.println(p2.getPrice());
		
		System.out.println("------------");

		Pen p3 = new Pen("Gold", 20000);
		System.out.println(p3.getCompany());
		System.out.println(p3.getPrice());
		
		
	} // main
}
