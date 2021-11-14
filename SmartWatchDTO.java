package com.Xworkz.SmartWatch.DTO;

public class SmartWatchDTO {

	private String Brand;
	private String color;
	private int serialnumber;
	private int price;

	public SmartWatchDTO(String brand, String color, int serialnumber, int price) {
		System.out.println("Smartwatch DTO is created");
		Brand = brand;
		this.color = color;
		this.serialnumber = serialnumber;
		this.price = price;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		this.Brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}