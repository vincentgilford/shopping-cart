import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

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
		Cart underTest = new Cart(new Item("Shoe",5.00,1)); 
		
		underTest.addOrder();
		
		int check = underTest.size();
		
		assertEquals(1,check); 
		
		
	}
	
	
	
	
	
	
	
	
	
}
