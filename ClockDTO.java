package com.Xworkz.Clock.DTO;

public class ClockDTO {

	private String Brand;
	private String color;
	private String model;
	private int price;

	public ClockDTO(String brand, String color, String model, int price) {
		System.out.println("clock dto is created");
		Brand = brand;
		this.color = color;
		this.model = model;
		this.price = price;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
