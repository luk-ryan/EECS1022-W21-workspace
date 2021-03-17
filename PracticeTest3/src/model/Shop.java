package model;

public class Shop {

	private Customer[] customers;
	
	public Shop() {
		this.customers = new Customer[0];
	}
	
	/*
	 * Accessor Methods (return useful information)
	 */
	
	public Customer[] getCustomers() {
		return this.customers;
	} 
	
	/*
	 * Mutator Methods (not returning anything)
	 */
	
	public void addCustomer(Customer customer) {
		
		Customer[] tempArray = new Customer[this.customers.length+1]; // make a temporary customer array with one index greater than original
		
		for (int i = 0; i < this.customers.length; i++) { // add existing records into temporary record array
			tempArray[i] = this.customers[i];
		}
		this.customers = new Customer[tempArray.length]; // make original record array a new array with one more index
		tempArray[tempArray.length-1] = customer; // add new record into temporary array's last index
		
		for (int i = 0; i < this.customers.length; i++) { // put everything from temporary array back into the records array
			this.customers[i] = tempArray[i];
		}
	}
	
	public void pay(String name) {
		
		for (int i = 0; i < this.customers.length; i++) {
			if (name == this.customers[i].getName()) {
				this.customers[i].pay(this.customers[i].getAmountDue());
				this.customers[i].clearRecords();
			}
		}
	}
}
