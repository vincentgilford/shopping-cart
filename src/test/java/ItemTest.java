import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

	
@Before	public void setUp() {
	Item underTest = new Item(); 
}
	

@Test
public void itemDefaultClass() {
	Item underTest = new Item(); 
	
	assertNotNull(underTest);
	
	
}

@Test
public void itemWithFields() {
	Item underTest = new Item("",0.0,0); 
	
	assertNotNull(underTest); 
	
	
}

@Test 
public void parameterNameEqualClassVariableName() {
	Item underTest = new Item("Item",0.0,0);
	
	String check = underTest.getItemName(); 
	
	assertEquals("Item", check);
	
}

@Test
public void testToStringMethod() { 
	Item underTest = new Item("Item",1.00,1);
	
	String check = underTest.toString();
	
	assertEquals("Item" + 1.00 + 1,check);
}

@Test
public void removeQuantityFromItem() {
	Item underTest = new Item("Item",1.00,1);
	underTest.removeQuantityItem(1); 
	
	
	int check = underTest.getQuantity();
	
	assertEquals(2,check); 
	
}




	
	
	
	
	
}
