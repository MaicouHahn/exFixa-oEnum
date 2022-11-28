package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class App {

	public static void main(String[] args) throws ParseException {
		
		Scanner scan=new Scanner(System.in);
		Scanner scanNum=new Scanner(System.in);

		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter Client data:");
		
		System.out.print("Name: ");
		String name=scan.nextLine();
		
		System.out.print("Email: ");
		String email=scan.nextLine();
		
		System.out.print("Birth Date(DD/MM/YYYY): ");
		Date birthDate = sdf.parse(scan.next());
		
		Client client1=new Client(name,email,birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scan.next());
		
		Order order=new Order(new Date(),status,client1);
		
		System.out.println("How many items to this order?");
		int it=scanNum.nextInt();
		
		for(int i=0;i<it;i++) {
			System.out.println("Enter #"+(i+1)+" item Data");
			
			System.out.print("Product Name: ");
			scan.nextLine();
			String pName=scan.nextLine();
			
			System.out.print("\nProduct Price: ");
			double pPrice=scanNum.nextDouble();
			
			System.out.print("\nProduct Quantity: ");
			int pQuantity=scanNum.nextInt();
			
			Product product = new Product(pName,pPrice);
			OrderItem pr = new OrderItem(pQuantity,pPrice,product);
			order.addItem(pr);
			
			
		}
		System.out.println();
		System.out.println(order);
	}

}
