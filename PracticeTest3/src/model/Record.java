package model;

public class Record {
	
	private String name;
	private double price;
	private int quantity;
	
	public Record() {
		// do nothing
	}
	
	public Record(String name) {
		this.name = name;
	}
	
	public Record(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Record(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/*
	 * Accessor Methods (return useful information)
	 */
	
	public String getItem() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	/*
	 * Mutator Methods (not returning anything)
	 */
	
	public void setItem(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}	
