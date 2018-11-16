package com.southwind.entity;

public class Car {
	private int num;
	private String brand;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Car(int num, String brand) {
		super();
		this.num = num;
		this.brand = brand;
	}
	public Car() {
		super();
	}
	@Override
	public String toString() {
		return "Car [num=" + num + ", brand=" + brand + "]";
	}
}
