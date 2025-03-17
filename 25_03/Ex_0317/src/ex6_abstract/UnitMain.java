package ex6_abstract;

public class UnitMain {

	public static void main(String[] args) {

		Terran t1 = new Terran("해병", 100, false);
		t1.decEnergy();
		t1.decEnergy();
		System.out.println("t1 : " + t1.getEnergy());
		
		Protoss p1 = new Protoss("셔틀", 200, true);
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("p1 : " + p1.getEnergy());
		
		Zerg z1 = new Zerg("저글링", 50, false);
		z1.decEnergy();
		z1.decEnergy();
		System.out.println("z1 : " + z1.getEnergy());

	} // main

}
