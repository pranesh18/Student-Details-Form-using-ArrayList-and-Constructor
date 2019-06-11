package test;

import java.util.*;
import java.util.ArrayList;

public class user {
	ArrayList<Student> stdList = new ArrayList<Student>();
	public void cont() {
		System.out.println("1.insert ----insert student data");
		System.out.println("2.view ------view student data");
		System.out.println("3.remove ----remove student data");
		System.out.println("4.update ----update student data");
		System.out.println("5.exit-------exit program");
		while (true) {	
			Scanner scanner = new Scanner(System.in);
			String decision=scanner.nextLine();
			if (decision.equalsIgnoreCase("insert")) {
				add1();
			} else if (decision.equalsIgnoreCase("view")) {
				display();
			} else if (decision.equalsIgnoreCase("remove")) {
				delete();
			}else if(decision.equalsIgnoreCase("update")) {
				update();
			}else if(decision.equalsIgnoreCase("exit")){
				System.out.println("-----Exited-----");
				break;
			}else {
				System.out.println("Worng Option:(");
				System.out.println("Try the option values");
				
			}

		}

	}

	public void add1() {
		Scanner scanner = new Scanner(System.in);
		Student std = new Student();
		System.out.println("Enter name : ");
		std.setName(scanner.next());
		System.out.println("Enter age : ");
		std.setAge(scanner.nextInt());
		System.out.println("Enter standard : ");
		std.setStandard(scanner.nextInt());
		System.out.println("Enter place : ");
		std.setPlace(scanner.next());
		stdList.add(std);
		System.out.println("Inserted sucessfully");
	}

	public void display() {

		for (Student st : stdList) {
			System.out.println(st.getName()+" "+st.getAge()+" "+st.getStandard()+" "+st.getPlace());

		}

	}
	
	public void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row to be removed");
		int x=scanner.nextInt();
		int y=x-1;
		stdList.remove(y);
		System.out.println("removed sucessfully");
		
	}
	public void update() {
		Student  up = new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row to br updated:");
		int a =scanner.nextInt();
		int b = a-1;
		System.out.println("Enter updated name : ");
		up.setName(scanner.next());
		System.out.println("Enter updated age : ");
		up.setAge(scanner.nextInt());
		System.out.println("Enter updated standard : ");
		up.setStandard(scanner.nextInt());
		System.out.println("Enter updated place : ");
		up.setPlace(scanner.next());
		//stdList.add(up);
		stdList.set(b, up);
		System.out.println("updated successfully");
		
	}

	public static void main(String[] args) {

		user us = new user();
		us.cont();
	}
}
