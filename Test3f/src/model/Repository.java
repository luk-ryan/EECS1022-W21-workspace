package model;

public class Repository {
	
	private Item[] items;
	private int MAX_NUMBER_OF_ITEMS;
	
	public Repository(int number) {
		
		MAX_NUMBER_OF_ITEMS = number;
		this.items = new Item[0];
	}
	
	/*
	 * Accessor Methods (return useful information)
	 */
	
	public Item[] getItems() {
		return this.items;
	}
	
	public Item[] getItems(String[] titles) {
		int len = 0;
		
		for (int i = 0; i < this.items.length; i++) { // loop through length of items array
			for (int j = 0; j < titles.length; j++) { // loop through titles array each time we check one index in the items array
				if (this.items[i].getTitle() == titles[j]) { // decide how many indexes should be in the array first
					len += 1;
				}
			}
		}
		Item[] tempItems = new Item[len]; // set up an array with the length from above
		int count = 0; // set up a counter for a loop
		
		for (int i = 0; i < this.items.length; i++) {
			for (int j = 0; j < titles.length; j++) { // loop through titles array each time we check one index in the items array
				if (this.items[i].getTitle() == titles[j]) { // decide how many indexes should be in the array first
					tempItems[count] = this.items[i]; // if the amount is larger than the inputed number, add it into the array
					count ++;
				}
			}
		}
		return tempItems;
	}

	public Item[] getItemsOutsideRange(int upper, int lower) {
		int len = 0;
		
		for (int i = 0; i < this.items.length; i++) { // loop through items array
			if (this.items[i].getAmount() > upper || this.items[i].getAmount() < lower) {
				len += 1;
			}
		}
		Item[] itemsOutsideRange = new Item[len]; // set up an array with the length from above
		int count = 0; // set up a counter
		
		for (int i = 0; i < this.items.length; i++) { // loop through items array
			if (this.items[i].getAmount() > upper || this.items[i].getAmount() < lower) {
				itemsOutsideRange[count] = this.items[i]; // if the amount is outside the range given, add it into the array
				count ++; // increase counter by 1
			}
		}
		return itemsOutsideRange;
	}
	
	public int getAmount(String title) {
		int amount = -1;
		
		for (int i = 0; i < this.items.length; i++) { // loop through items array
			if (this.items[i].getTitle() == title) { // check which index has the same title name stored and get amount of it
				amount = items[i].getAmount();
			}
		}
		return amount;
	}
	
	/*
	 * Mutator Methods (not returning anything)
	 */
	
	public void addItem(Item item) {
		boolean sameName = false;
		for (int i = 0; i < this.items.length; i++) { // loop through this.items array
			if (this.items[i].getTitle() == item.getTitle()) { // check if there is any duplicate in title names
				this.items[i].increaseAmount(item.getAmount());
				sameName = true;
			}
		}
		if (this.items.length < MAX_NUMBER_OF_ITEMS) { // check if there is enough space in the repository
			if (!sameName) { // if there is no duplicate name, then add the item
				Item[] tempArray = new Item[this.items.length+1]; // make a temporary item array with one index greater than original
		
				for (int i = 0; i < this.items.length; i++) { // add existing items into temporary record array
					tempArray[i] = this.items[i];
				}
				this.items = new Item[tempArray.length]; // make original item array a new array with one more index
				tempArray[tempArray.length-1] = item; // add new item into temporary array's last index
		
				for (int i = 0; i < this.items.length; i++) { // put everything from temporary array back into the items array
					this.items[i] = tempArray[i];
				}
			}
		} // if there is no space in the repository, do nothing (don't add anymore)
	}
	
	public void decreaseAmount(String title, int amount) {
		for (int i = 0; i < this.items.length; i++) { // loop through this.items array
			if (this.items[i].getTitle() == title) { // check if the corresponding item is in the repository
				this.items[i].decreaseAmount(amount); // decrease by the amount given if so
			}
		}
	}
}
