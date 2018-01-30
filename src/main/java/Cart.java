import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Item> shoppingOrders = new ArrayList<>();

	public void addOrder(Item order) {
		// TODO Auto-generated method stub
		shoppingOrders.add(order);
	}

	public int listSize() {
		// TODO Auto-generated method stub
		return shoppingOrders.size();
	}

	public void currentCartOrders() {
	
		for(int i = 0; i<shoppingOrders.size(); i++) {
			System.out.println("Order #: " + (i+1) + " Item Name: " + shoppingOrders.get(i).getItemName() + " Price: " + shoppingOrders.get(i).getPrice() + " Quantity: " + shoppingOrders.get(i).getQuantity()); 
//			System.out.println(shoppingOrders.get(i).getItemName()); 
		}
		
		//check order #s
	}

	public void removeItem(int toRemove) {
		// TODO Auto-generated method stub
		shoppingOrders.remove(toRemove); 
	}

	public double getTotalPrice() {
		// TODO Auto-generated method stub
		double totalPrice = 0; 
		for(Item order : shoppingOrders) {
			totalPrice += order.getPrice()*order.getQuantity();
		}
		
		
		return totalPrice; 
	}

	public int getTotalItems() {
		// TODO Auto-generated method stub
		int amountOrdered = 0; 
		for(Item order : shoppingOrders) {
			amountOrdered ++;   
		}
		return amountOrdered;
	}
	
	
	//allow for removal an individual quantity
	
	
	
	
	
	
}
