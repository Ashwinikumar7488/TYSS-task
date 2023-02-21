package com.ty.mobile_phone_task;

import java.util.ArrayList;
import java.util.Scanner;

public class MobileController {

	public static void main(String[] args) {

		int flag = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Mobile> list = new ArrayList<>();
		Mobile mobile1 = new Mobile("windows", 2, 32, 10000.0, 8.0);
		Mobile mobile2 = new Mobile("windows", 4, 64, 15000.0, 6.5);
		Mobile mobile3 = new Mobile("android", 2, 32, 20000.0, 9.0);
		Mobile mobile4 = new Mobile("iOS", 2, 32, 60000.0, 10.0);
		Mobile mobile5 = new Mobile("windows", 2, 32, 25000.0, 7.0);

		list.add(mobile1);
		list.add(mobile2);
		list.add(mobile3);
		list.add(mobile4);
		list.add(mobile5);

		System.out.println("***************Available Mobiles***************");
		for (Mobile mobile : list) {
			System.out.println(mobile);
		}

		System.out.println("\nEnter the below details for the phone you want to buy:");
		System.out.println("OPERATING SYSTEM:\n1. Windows\n2. Android\n3. iOS");
		String os = scanner.next();
		System.out.println("RAM SIZE:\n2, 4 or 8 GB");
		int ram = scanner.nextInt();
		System.out.println("Enter the MEMORY SPACE:\n32 or 64 GB ");
		int memory = scanner.nextInt();
		System.out.println("Enter your budget:");
		double budget = scanner.nextDouble();

		System.out.println("\n***********CUSTOMER SPECIFICATIONS************");
		System.out.println(os + " " + ram + " " + memory + " " + budget);
		System.out.println("\nRating of Available Mobiles within the budget:");
		for (Mobile mobile : list) {
			if (mobile.getOs().equalsIgnoreCase(os) && mobile.getRam() == ram && mobile.getMemory() == memory
					&& budget >= mobile.getPrice() && mobile.getRating() <= 10) {
				System.out.println(mobile.getRating());
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println(-1);
		}
	}
}
