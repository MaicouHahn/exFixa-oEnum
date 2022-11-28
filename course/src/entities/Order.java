package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import enums.OrderStatus;

public class Order {
	private OrderStatus status;
	private Date moment;
	private Client client;
	List<OrderItem> items = new ArrayList<>();
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH/mm/ss");

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;

	}

	public OrderStatus getStatus() {
		return status;
	}

	public Date getMoment() {
		return moment;
	}

	public Client getClient() {
		return client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem c : items) {
			sum += c.subTotal();
		}

		return sum;
	}

	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Order Moment: ");
		sb.append(sdf.format(moment)+"\n");
		sb.append("Order Status: "+status+"\n");
		sb.append("Client: "+client.toString()+"\n");
		for(OrderItem c:items) {
			sb.append(c+"\n");
		}
		sb.append("Total Price: "+total());
		return sb.toString();
	}
}
