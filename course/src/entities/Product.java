package entities;

public class Product {
	
	private String name;
	private double price;
	
	public Product(String name,double price) {
		this.name=name;
		this.price=price;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return name +"  " + String.format("%.2f", price);
	}
	
}
