package model;

public class Item {

	private String title;
	private int amount;
	private String info;
	
	public Item(String title) {
		this.title = title;
		this.amount = 0;
		this.info = "Item: " + this.title + " (" + this.amount + ")";
	}
	
	/*
	 * Accessor Methods (return useful information)
	 */
	
	public String getTitle() { // get title of the item object
		return this.title;
	}
	
	public int getAmount() { // get the amount of the item object
		return this.amount;
	}
	
	public String getInfo() { // get the info of the item object
		return this.info;
	}
	
	/*
	 * Mutator Methods (not returning anything)
	 */
	
	public void increaseAmount(int number) {
		if (number > 0) { // check if input number is greater than 0 and add that number to amount
			this.amount += number;
			this.info = "Item: " + this.title + " (" + this.amount + ")";
		}
		else { // if input number is not greater than 0, change info to an error message
			this.info = "Error: non-positive amount " + number;
		}
	}
	
	public void decreaseAmount(int number) {
		if (number > 0) { // check if input number is less than 0
			
			if (this.amount >= number) { // check if there is enough in this.amount to decrease by
				this.amount -= number; // subtract from amount if so
				this.info = "Item: " + this.title + " (" + this.amount + ")";
			}
			else { // if not, then change info to an error message
				this.info = "Error: amount is short of " + (number - this.amount);
			}
		}
		else { // if input number is not less than 0, change info to an error message
			this.info = "Error: non-positive amount " + number;
		}
	}
}
