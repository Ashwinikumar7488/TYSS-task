package com.ty.mobile_phone_task;

public class Mobile {

	private String os;
	private int ram;
	private int memory;
	private double price;
	private double rating;

	public Mobile(String os, int ram, int memory, double price, double rating) {
		super();
		this.os = os;
		this.ram = ram;
		this.memory = memory;
		this.price = price;
		this.rating = rating;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Mobile [os=" + os + ", ram=" + ram + ", memory=" + memory + ", price=" + price + ", rating=" + rating
				+ "]";
	}

}
