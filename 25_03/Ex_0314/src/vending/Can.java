package vending;

public class Can {
	private int price;
	private String name;

	public Can(String name, int price) {
		this.name = name;
		this.price = price;
	}

	protected int getPrice() {
		return price;
	}

	protected String getName() {
		return name;
	}

}
