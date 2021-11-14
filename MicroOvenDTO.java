package com.Xworkz.MicroOven.DTO;

public class MicroOvenDTO {

	private String Brand;
	private int capacity;
	private int Price;
	private String model;
	private String color;

	public MicroOvenDTO(String brand, int capacity, int price,String model,String color) {
		System.out.println("microoven dto created");
		Brand = brand;
		this.capacity = capacity;
		Price = price;
		this.color = color;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		this.Brand = brand;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(int price) {
		model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
