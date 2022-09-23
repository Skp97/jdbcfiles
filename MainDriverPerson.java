package jdbc_use_maven;

import java.util.Scanner;

public class MainDriver {
	
	
	public static void main(String[] args) {
		
		DAO d=new DAO();
		boolean flag=true;
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Below Options");
			System.out.println("1.Save Person");
			System.out.println("2.Update Person");
			System.out.println("3.Delete Person");
			System.out.println("4.Get Person");
			System.out.println("5.exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the id:");
			int id=sc1.nextInt();
			System.out.println("Enter the name:");
			String name=sc1.next();
			System.out.println("Enter the address:");
			String address=sc1.next();
			System.out.println("Enter the phone number");
			long phoneNum=sc1.nextLong();
			System.out.println("Enter the pincode");
			long pin=sc1.nextLong();
					Person p=new Person();
					p.setId(id);
					p.setName(name);
					p.setAddress(address);
					p.setPhoneNum(phoneNum);
					p.setPin(pin);
					String res=d.insertPerson(p);
					System.out.println(res);
			break;
			case 2: Scanner sc2=new Scanner(System.in);
			System.out.println("Enter the id to update:");
			int id1=sc2.nextInt();
			System.out.println("Enter the name to update:");
			String name1=sc2.next();
			System.out.println("Enter the address to update:");
			String address1=sc2.next();
			System.out.println("Enter the phone number to update");
			long phoneNum1=sc2.nextLong();
			System.out.println("Enter the pincode to update");
			long pin1=sc2.nextLong();
			Person p1=new Person();
			p1.setId(id1);
			p1.setName(name1);
			p1.setAddress(address1);
			p1.setPhoneNum(phoneNum1);
			p1.setPin(pin1);
					String res1=d.updatePerson(p1);
					System.out.println(res1);
			break;
			case 3:Scanner sc3=new Scanner(System.in);
					System.out.println("Select the row to be deleted");
					int id2=sc.nextInt();
					d.deletePerson(id2);
			break;
			/*case 4: Scanner sc4=new Scanner(System.in);
					System.out.println("Enter the row to be fetched");
					int id3=sc.nextInt();
					d.getPerson(id3);
			break;*/
			case 4:Scanner sc4=new Scanner(System.in);
					System.out.println("Enter the row to be fetched");
					int id3=sc.nextInt();
					Person p2=d.getPerson(id3);
					System.out.println(p2.getId());
					System.out.println(p2.getName());
					System.out.println(p2.getAddress());
					System.out.println(p2.getPhoneNum());
					System.out.println(p2.getPin());
					
					
			break;
			case 5:flag=false;
			break;
			default:System.out.println("Enter the valid option");
			}
			
		}
	}
}
