import java.util.Scanner;

public class ItemApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cart userCart = new Cart(); 
		System.out.println("Welcome");		
		Scanner input = new Scanner(System.in); 
		String userExit = "";
		do {	
			System.out.println("What would you like to do with your Cart");
			System.out.println("1. Buy item");
			System.out.println("2. Remove item");
			System.out.println("3. See items in Cart");
			String userOption = input.nextLine().trim(); 
				
			if(userOption.equals("1")) {
				System.out.println("Please enter item name to purchase:");
				String userInput = input.nextLine();
				System.out.println("Please enter the price:");
				double userPrice = input.nextDouble(); 
				System.out.println("Please enter quantity on item:");
				int userQuantity = input.nextInt(); 
				Item userOrder = new Item(userInput,userPrice,userQuantity); 
				userCart.addOrder(userOrder);
			} 
			
			if(userOption.equals("2")) {
				System.out.println("Please enter item number to remove");
				int toRemove = input.nextInt(); 
				userCart.removeItem(toRemove);
			}
			//cart summary
			userCart.currentCartOrders();
			System.out.println("Would you like to continue Yes or No?");
			userExit = input.next();
			input.nextLine(); 
			
		
		}while(userExit.equalsIgnoreCase("Yes") || userExit.equalsIgnoreCase("Y"));
			
			
		
		
	
		
				
	
		
		
		
		
		
		
		
	}

}
