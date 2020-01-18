package shoppingcart;

public class Item {

	// Create an Item class that models an Item to be purchased. It should contain
	// instance data and a constructor to hold the following characteristics: name,
	// price and quantity. Item class should also include accessor methods for the 3
	// characteristics and a toString summary.

	// Item name

	private String itemName;
	private double itemPrice;
	private int itemQuantity;

	public Item(String itemName, double itemPrice, int itemQuantity) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}
	
	
	
	
	public String getItemName() {
		return itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	@Override
	public String toString() {
		return "Item: " + itemName + "     Price: " + itemPrice + "     Quantity: " + itemQuantity;
		
	}
	
	
	
	
	
}
