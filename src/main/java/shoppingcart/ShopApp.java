package shoppingcart;

import java.util.ArrayList;
import java.util.Scanner;


public class ShopApp {

	// can add to cart and you will see your total increase with each item added).
	// Use a loop to simulate shopping, asking the user to enter the item, quantity
	// and price.

	// Store the items in an ArrayList and update the total due at checkout.

	public static void main(String[] args) {

		Cart myCart = new Cart();

		
		Item myItem = new Item("shoes", 50 , 3);
		
		Item myItem2 = new Item("socks", 12.50, 4);
		

		myCart.addItem(myItem);
		myCart.addItem(myItem2);
		myCart.addItem(new Item("pants", 30, 1));
				
		
		System.out.println(myCart.toString());
		
		
		
		// LOOP
//
//		while (true) {
//
//			System.out.println("What would you like to buy?");
//			// show items for sale?
//
//			String itemToBuy = input.nextLine();
//
//			System.out.println("Enter price per item: ");
//
//			double itemPrice = input.nextInt();
//
//			System.out.println("Enter quantity: ");
//
//			int itemQuantity = input.nextInt();
//
//			int totalPrice = (itemPrice * itemQuantity);
//
//			System.out.println("\n" + "Your current cart: ");
//			System.out.println(myCart.toString());
//		}

	}

}
