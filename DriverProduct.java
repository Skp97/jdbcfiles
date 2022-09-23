package jdbc_product;

import java.util.Scanner;

public class DriverProduct {
		static int id;
		static  String name;
		static double price;
		static String manufacturer;
		static double discount;
		static int warrenty;
		static String mandate;
		static double gst;
		static Scanner sc=new Scanner(System.in);
		public static void inputs()	{
		System.out.println("Enter the id:");
		id = sc.nextInt();
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the price:");
		price = sc.nextDouble();
		System.out.println("Enter the Manufact:");
		manufacturer = sc.next();
		System.out.println("Enter the discount:");
		discount = sc.nextDouble();
		System.out.println("Enter the warrenty:");
		warrenty = sc.nextInt();
		System.out.println("Enter the man date");
		mandate = sc.next();
		System.out.println("Enter the gst:");
		gst = sc.nextDouble();
	}
		public static void main(String[] args) {
		DAO d=new DAO();
		boolean flag = true;
		while (flag) {

			System.out.println("Enter The Below Options");
			System.out.println("1.Enter Product Details");
			System.out.println("2.Update Product Details");
			System.out.println("3.Delete Product Details");
			System.out.println("4.Get Product Details");
			System.out.println("5.exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				inputs();
				Product p = new Product();
				p.setName(name);
				p.setPrice(price);
				p.setManufacturer(manufacturer);
				p.setDiscount(discount);
				p.setWarrenty(warrenty);
				p.setMandate(mandate);
				p.setGst(gst);
				d.insert(p);
				break;
			case 2:
				inputs();
				Product p2 = new Product();
				p2.setId(id);
				p2.setName(name);
				p2.setPrice(price);
				p2.setManufacturer(manufacturer);
				p2.setDiscount(discount);
				p2.setWarrenty(warrenty);
				p2.setMandate(mandate);
				p2.setGst(gst);
				d.update(p2);
				break;
			case 3:
				System.out.println("Enter the id");
				int id3 = sc.nextInt();
				d.delete(id3);

				break;
			case 4:
				System.out.println("Enter the id");
				int id4 = sc.nextInt();
				Product p4 = d.get(id4);
				System.out.println(p4.getId());
				System.out.println(p4.getName());
				System.out.println(p4.getPrice());
				System.out.println(p4.getManufacturer());
				System.out.println(p4.getDiscount());
				System.out.println(p4.getWarrenty());
				System.out.println(p4.getMandate());
				System.out.println(p4.getGst());
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Enter valid option");
			}
			
		}
	}
		
}
