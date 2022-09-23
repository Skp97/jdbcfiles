package jdbc_mobileObj;

import java.util.Scanner;

import jdbc_use_maven.Person;

public class MobileDriver {
public static void main(String[] args) {
		
		DAO d=new DAO();
		boolean flag=true;
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Below Options");
			System.out.println("1.Enter Mobile Details");
			System.out.println("2.Update Mobile Details");
			System.out.println("3.Delete Mobile Details");
			System.out.println("4.Get Mobile Details");
			System.out.println("5.exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the id:");
			int id=sc1.nextInt();
			System.out.println("Enter the name:");
			String name=sc1.next();
			System.out.println("Enter the brand:");
			String brand=sc1.next();
			System.out.println("Enter the colour:");
			String colour=sc1.next();
			System.out.println("Enter the price:");
			double price=sc1.nextDouble();
			System.out.println("Enter the Ram:");
			int ram=sc1.nextInt();
			System.out.println("Enter the Manufaturer");
			String manufacturer=sc.next();
					Mobile m=new Mobile();
					m.setId(id);
					m.setName(name);
					m.setBrand(brand);
					m.setColour(colour);
					m.setPrice(price);
					m.setRam(ram);
					m.setManufacturer(manufacturer);
					d=new DAO();
					String res=d.insertMobile(m);
					System.out.println(res);
			break;
			case 2: Scanner sc2=new Scanner(System.in);
			System.out.println("Enter the id:");
			int id2=sc2.nextInt();
			System.out.println("Enter the name:");
			String name2=sc2.next();
			System.out.println("Enter the brand:");
			String brand2=sc2.next();
			System.out.println("Enter the colour:");
			String colour2=sc2.next();
			System.out.println("Enter the price:");
			double price2=sc2.nextDouble();
			System.out.println("Enter the Ram:");
			int ram2=sc2.nextInt();
			System.out.println("Enter the Manufaturer");
			String manufacturer2=sc.next();
					Mobile m2=new Mobile();
					m2.setId(id2);
					m2.setName(name2);
					m2.setBrand(brand2);
					m2.setColour(colour2);
					m2.setPrice(price2);
					m2.setRam(ram2);
					m2.setManufacturer(manufacturer2);
					d=new DAO();
					String res2=d.updateMobile(m2);
					System.out.println(res2);
			break;
			case 3:Scanner sc3=new Scanner(System.in);
				System.out.println("Enter the id");
				int id3=sc.nextInt();
				String res3=d.deleteMobile(id3);
				System.out.println(res3);
			break;
			case 4:Scanner sc4=new Scanner(System.in);
			System.out.println("Enter the id");
			int id4=sc.nextInt();
			Mobile m3=d.getMobile(id4);
			System.out.println(m3.getId());
			System.out.println(m3.getName());
			System.out.println(m3.getBrand());
			System.out.println(m3.getColour());
			System.out.println(m3.getPrice());
			System.out.println(m3.getRam());
			System.out.println(m3.getManufacturer());
				
}
		}
}
}
