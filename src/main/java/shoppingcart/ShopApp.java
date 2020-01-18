package shoppingcart;

import java.util.Scanner;

public class ShopApp {

	// can add to cart and you will see your total increase with each item added).
	// Use a loop to simulate shopping, asking the user to enter the item, quantity
	// and price.

	// Store the items in an ArrayList and update the total due at checkout.

	private static Object myCart;

	public static void main(String[] args) {

		System.out.println("Your Cart:");

		while (true) {
			Scanner input = new Scanner(System.in);

			System.out.println("What would you like to buy?");
			String userItem = input.nextLine();

			System.out.println("What is the price?");
			double userPrice = input.nextDouble();

			System.out.println("How many?");
			int userQuantity = input.nextInt();

			Cart myCart = new Cart();

			myCart.addItem(new Item(userItem, userPrice, userQuantity));

//			myCart.addItem(new Item("shoes", 50, 3));
//			myCart.addItem(new Item("socks", 12.50, 4));
//			myCart.addItem(new Item("pants", 30, 1));

			System.out.println("Current Cart : " + myCart.toString());

			System.out.println("Would you like to keep shopping? (y/n)");
			
				if(input.nextLine().equals("n")) {  //need to add something to allow y to go to the top of the loop again
					input.close();
				}
	}
}
}
