package model;

public class Customer {

	private String name;
	private	Record[] records;
	private double balance;
	
	public Customer(String name) {
		this.name = name;
		this.records = new Record[0];
	}
	
	public Customer(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.records = new Record[0];
	}
	
	/*
	 * Accessor Methods (return useful information)
	 */
	
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public Record[] getRecords() {
		return this.records;
	}
	
	public double getAmountDue() {
		double amountDue = 0.0;
		
		for (int i = 0; i < this.records.length; i++) {
			amountDue += this.records[i].getPrice() * this.records[i].getQuantity();
		}
		return amountDue;
	}
	
	public Record[] getRecordsLargerThan(int number){
		
		int len = 0;
		
		for (int i = 0; i < this.records.length; i++) {
			if (this.records[i].getPrice() * this.records[i].getQuantity() > number) { // decide how many indexes should be in the array first
				len += 1;
			}
		}
		Record[] recordsLargerThan = new Record[len]; // set up an array with the length from above
		int count = 0;
		for (int i = 0; i < this.records.length; i++) {
			if (this.records[i].getPrice() * this.records[i].getQuantity() > number) { // loop through this.records again
				recordsLargerThan[count] = this.records[i]; // if the amount is larger than the inputted number, add it into the array
				count ++;
			}
		}
		return recordsLargerThan;
	}
	
	/*
	 * Mutator Methods (not returning anything)
	 */
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void pay(double amount) {
		this.balance -= amount;
	}
	
	public void addRecord(Record record) {
		Record[] tempArray = new Record[this.records.length+1]; // make a temporary record array with one index greater than original
		
		for (int i = 0; i < this.records.length; i++) { // add existing records into temporary record array
			tempArray[i] = this.records[i];
		}
		this.records = new Record[tempArray.length]; // make original record array a new array with one more index
		tempArray[tempArray.length-1] = record; // add new record into temporary array's last index
		
		for (int i = 0; i < this.records.length; i++) { // put everything from temporary array back into the records array
			this.records[i] = tempArray[i];
		}
	}
	
	public void addRecord(String name, double price, int quantity) {
		Record r = new Record(name, price, quantity); // create a new record object using parameters given
		
		addRecord(r); // use the addRecord method created above
	}
	
	public void addRecords(Record[] orders) {
		
		for (int i = 0; i < orders.length; i ++) {
			addRecord(orders[i]);
		}
	}
	
	public void clearRecords() {
		this.records = new Record[0];
	}
}
