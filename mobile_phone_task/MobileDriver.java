package com.ty.mobile_phone_task;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Available phones");
		mobile.setNoOfPhones(5);
		System.out.println("\n***********Specifications for the mobile phones****************");
		System.out.println("OS RAM(in GB) MEMORY(in GB) PRICE(in Rs.) RATING");
		System.out.println("windows 2 32 100 100\r\n"
				+ "windows 4 64 10 52\r\n"
				+ "android 2 32 56 9\r\n"
				+ "ios 2 32 20 63\r\n"
				+ "windows 2 32 452 50");
		System.out.println("\nEnter the below details for the phone you want to buy:");
		mobile.setNoOfCustomers(2);
		System.out.println("OPERATING SYSTEM:\n1. Windows\n2. Android\n3. iOS");
		String os = scanner.next();
		System.out.println("RAM SIZE:\n2, 4 or 8 GB");
		int ram = scanner.nextInt();
		System.out.println("Enter the MEMORY SPACE:\n32 or 64 GB ");
		int memory = scanner.nextInt();
		System.out.println("Enter your budget:");
		double budget = scanner.nextDouble();
		System.out.println("\n***********Choice of Customers Visited************");
		System.out.println("OS RAM(in GB) MEMORY(in GB) PRICE(in Rs.)");
		System.out.println(os+" "+ram+" "+memory+" "+budget);
		mobile.setRating(100);
		if(mobile.getRating()==100) {
			System.out.println("Ratings: "+100);
		}
		else {
			System.out.println(-1);
		}
	}
}
