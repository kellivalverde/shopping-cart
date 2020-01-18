package shoppingcart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ItemTest {



	@Test // 1

	public void shouldReturnTotalItemsAsOne() {
		// name method with what you hope to test for
		Item underTest = new Item();

		underTest.addOrder(new ItemOrder("", 1));
		// 1 is what we think it will return

		int check = underTest.getTotalItems();

		assertEquals(1, check);
	}
	
}

}
