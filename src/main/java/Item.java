
public class Item {

	private String name; 
	private double price; 
	private int quantity;
	
	
	
	
	public Item(String name, double price, int quantity) {
		// TODO Auto-generated constructor stub
		this.name = name; 
		this.price = price; 
		this.quantity = quantity;
	
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public String getItemName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public double getPrice() {
		return price; 
	}
	
	public int getQuantity() {
		return quantity; 
	}

	@Override
	public String toString() {
		return name + price + quantity;  
	}
	
	
	
	
	
	
}
