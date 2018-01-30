import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CartTest {
	
//	@Test
//	public void cartConstructorOrderList() {
//		Cart underTest = new Cart();
//		
//		assertNotNull(underTest); 
//		
//	}
//	
	@Test
	public void addOrder() {
		Cart underTest = new Cart(); 
		
		underTest.addOrder(new Item("Shoe",5.00,1));
		
		int check = underTest.listSize();
		
		assertEquals(1,check); 
		
	}
	
	@Test
	public void assertThatAddOrderIsTwo() {
		Cart underTest = new Cart(); 
		
		underTest.addOrder(new Item("Shoe",5.00,1));
		underTest.addOrder(new Item("Dog",10.00,1));
		int check = underTest.listSize();
		
		assertEquals(2,check);
		
	}
	
//	@Test
//	public void currentCartOrders() {
//		Cart underTest = new Cart();
//		underTest.addOrder(new Item("Shoe",5.00,1));
//		
//		
//		Item test = new Item("Shoe",5.00,1);
//		Cart check = underTest.currentCartOrders();
//		
//		
//		assertEquals(test,check);
//		
//	}
//	
	
	@Test
	public void removeItemFromCart() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Shoe",5.00,1));
		underTest.removeItem(0); 
		
		int check = underTest.listSize();
		
		assertEquals(0,check); 
	}
	
	@Test
	public void removeItemFromCartPartDeux() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Shoe",5.00,1));
		underTest.addOrder(new Item("Bob",5.00,1));
		underTest.removeItem(0); 
		
		int check = underTest.listSize();
		
		assertEquals(1,check); 
	}
	
	
	
	@Test
	public void returnTotalPrice() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Shoe",5.00,1));
		underTest.addOrder(new Item("Drink",5.00,1));
		
		 
		double check = underTest.getTotalPrice();
		
		assertEquals(10.00, check, .001);
	}
	
	
	public void returnTotalPriceWithQuantityChange() {
		Cart underTest = new Cart();
		underTest.addOrder(new Item("Shoe",3.00,2));
		underTest.addOrder(new Item("Drink",5.00,1));
		
		double check = underTest.getTotalPrice();
		
		Assert.assertEquals(11.00,check, .001);
	}
	
	@Test
	public void assertTotalItemsInOrder() {
		Cart underTest = new Cart();
		
		underTest.addOrder(new Item("Shoe",3.00,2));
		underTest.addOrder(new Item("Drink",5.00,1));
		
		int check = underTest.getTotalItems(); 
		
		assertEquals(2,check);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
