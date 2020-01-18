package shoppingcart;

import java.util.ArrayList;

public class Cart {

	ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item itemToAdd) {
		items.add(itemToAdd);
	}

	@Override
	public String toString() {
		String cartOutput = "";
		double totalPrice = 0;

		for (Item currentItem : items) { // iterate over list of items -
			// equivalent to for(int i = 0; i < items.size(); i++);
			// Item currentItem = items [i];

			cartOutput += currentItem.toString() + "\n";
			totalPrice += currentItem.getItemPrice() * currentItem.getItemQuantity();

		}

		cartOutput += "Total Price: " + totalPrice;

		return cartOutput;

	}

}
