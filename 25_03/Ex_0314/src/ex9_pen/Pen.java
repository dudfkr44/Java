package ex9_pen;

public class Pen {

	private String company;
	private String color;
	private int price;

	public Pen(String color, int price) {
		company = "Monami";
		this.color = "Gold";
		this.price = 20000;
	} // Pen
	
	
	public Pen() {
		company = "Monami";
		color = "Black";
		price = 1000;
	}// Pen (Constructor)

	protected String getCompany() {
		return company;
	}// company

	protected String getColor() {
		return color;
	}// color

	protected int getPrice() {
		return price;
	}// price
}
