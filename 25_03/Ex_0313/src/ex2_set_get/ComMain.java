package ex2_set_get;


public class ComMain {
	public static void main(String[] args) {
	
		Computer com1 = new Computer();
//		System.out.println(com1.Company());
		System.out.println(com1.ssd);
		System.out.println(com1.cpu);
		System.out.println(com1.ram);
		
		System.out.println("---------------");
		
		Computer com2 = new Computer();
		com2.setCompany("sony");
		com2.ssd = 1024;
		
		String ss = com2.getCompany();
		System.out.println(ss);
		System.out.println(com2.ssd);
		System.out.println(com2.cpu);
		System.out.println(com2.ram);
		
	} // main
}
