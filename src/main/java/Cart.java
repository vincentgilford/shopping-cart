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

		}
		
	
	}

	public void removeItem(int toRemove) {
		// TODO Auto-generated method stub
		toRemove +=1; 
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

	public void removeQuantityFromCart(String itemName, int quantity ) {
		// TODO Auto-generated method stub
		for (Item order : shoppingOrders) {
			if(order.getItemName().equals(itemName)) {
				order.removeQuantityItem(quantity);
			}			
		}
	}

	public void removeQuantityByIndexFromCart(int orderNum, int quantity) {
		// TODO Auto-generated method stub
		for(int i = shoppingOrders.size(); i>0; i--) {
			if( i == (orderNum-1)) {
				shoppingOrders.get(i).removeQuantityItem(quantity);
			}	//use backwards iteration when removing from an iterable data structure
		}
	}
	
	
	
	
	
	
	
	
	
}
