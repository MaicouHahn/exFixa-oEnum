package entities;

public class OrderItem {
	private int quantity;
	private double price;
	private Product product;

	public OrderItem(int quantity, double price, Product product) {
		
		this.quantity = quantity;
		this.price = price;
		this.product = product;

	}
	
	public void addQuantity(int qnt) {
		this.quantity+=qnt;
	}
	public void removeQuantity(int qnt) {
		this.quantity-=qnt;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public double getPrice() {
		return this.price;
	}
	public Product getProduct() {
		return this.product;
	}
	public double subTotal() {
		return price*quantity;
	}

	@Override
	public String toString() {
		return product+" Quantity: " + quantity + " SubTotal: " + String.format("%.2f", subTotal());
	}

	
}
