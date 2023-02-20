package com.ty.mobile_phone_task;

import java.util.Arrays;

public class Mobile {

	private final String[] OS = { "Windows", "Android", "iOS" };
	private final int[] RAM_SIZE = { 2, 4, 8 };
	private final int[] MEMEORY = { 32, 64 };
	private double price;
	private int rating;
	private int noOfPhones;
	private int noOfCustomers;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String[] getOS() {
		return OS;
	}

	public int[] getRAM_SIZE() {
		return RAM_SIZE;
	}

	public int[] getMEMEORY() {
		return MEMEORY;
	}

	public int getNoOfCustomers() {
		return noOfCustomers;
	}

	public void setNoOfCustomers(int noOfCustomers) {
		this.noOfCustomers = noOfCustomers;
	}

	public int getNoOfPhones() {
		return noOfPhones;
	}

	public void setNoOfPhones(int noOfPhones) {
		this.noOfPhones = noOfPhones;
	}

	@Override
	public String toString() {
		return "Mobile [OS=" + Arrays.toString(OS) + ", RAM_SIZE=" + Arrays.toString(RAM_SIZE) + ", MEMEORY="
				+ Arrays.toString(MEMEORY) + ", price=" + price + ", rating=" + rating + ", noOfPhones=" + noOfPhones
				+ ", noOfCustomers=" + noOfCustomers + "]";
	}
}
