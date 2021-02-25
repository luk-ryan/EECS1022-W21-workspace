package model;

public class VendingMachine {
	
	int coke;
	int orangeJuice;
	int kitKat;
	int lays;
	String statusReport;
	
	// upon creating vending machine, the stock of all products is 0
	public VendingMachine() {
		this.coke = 0;
		this.orangeJuice = 0;
		this.kitKat = 0;
		this.lays = 0;
		this.statusReport = "Empty VM Started";
	}
	
	// show a status report to user
	public String checkStatus() {
		
		return this.statusReport;
	}
	
	// check how many of each product the vending machine currently holds
	public String checkStock() {
		String result = String.format("Stock: Coke (%s), Orange Juice (%s), Kitkat Chunky Bar (%s), Lay's Classic Chips (%s)",this.coke, this.orangeJuice, this.kitKat, this.lays);
		
		return result;
	}

	// check how many of each product the vending machine currently holds
	public String checkStock(String product) {
		String result = "";
		
		if (product == "Coke") {
			result = "Coke (" + this.coke + ")";
		}
		else if (product == "Orange Juice") {
			result = "Orange Juice (" + this.orangeJuice + ")";
		}
		else if (product == "Kitkat Chunky Bar") {
			result = "Kitkat Chunky Bar (" + this.kitKat + ")";
		}
		else if (product == "Lay's Classic Chips") {
			result = "Lay's Classic Chips (" + this.lays + ")";
		}
		else {
			result = "Invalid product: " + product;
		}
		
		return result;
	}
	
	// add a number of a certain product to the vending machine
	public void add(String product, int quantity) {
		
		if (product == "Coke") {
			this.coke += quantity;
			this.statusReport = "Product added: Coke (" + quantity + ")";
		}
		else if (product == "Orange Juice") {
			this.orangeJuice += quantity;
			this.statusReport = "Product added: Orange Juice (" + quantity + ")";
		}
		else if (product == "Kitkat Chunky Bar") {
			this.kitKat += quantity;
			this.statusReport = "Product added: Kitkat Chunky Bar (" + quantity + ")";
		}
		else if (product == "Lay's Classic Chips") {
			this.lays += quantity;
			this.statusReport = "Product added: Lay's Classic Chips (" + quantity + ")";
		}
		else {
			this.statusReport = "Invalid product: " + product;
		}
	}
	
	// remove a number of a certain product from the vending machine
	public void dispense(String product, int quantity) {
		
		if (product == "Coke") {
			this.coke -= quantity;
			this.statusReport = "Product removed: Coke (" + quantity + ")";
		}
		else if (product == "Orange Juice") {
			this.orangeJuice -= quantity;
			this.statusReport = "Product removed: Orange Juice (" + quantity + ")";
		}
		else if (product == "Kitkat Chunky Bar") {
			this.kitKat -= quantity;
			this.statusReport = "Product removed: Kitkat Chunky Bar (" + quantity + ")";
		}
		else if (product == "Lay's Classic Chips") {
			this.lays -= quantity;
			this.statusReport = "Product removed: Lay's Classic Chips (" + quantity + ")";
		}
		else {
			this.statusReport = "Invalid product: " + product;
		}
	}
}
