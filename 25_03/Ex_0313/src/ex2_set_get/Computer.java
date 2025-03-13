package ex2_set_get;

public class Computer {
	
	private String company = "sany";
	int ssd = 512;
	int ram = 32;
	float cpu = 4.8f;
	
	public void setCompany(String com) {
		company = com;
	}
	
	public String getCompany() {
		return company;
	}
}
