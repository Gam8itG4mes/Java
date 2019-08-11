import java.util.Scanner;
public class Keychains2 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		int num_chain = 0; //customers # of chains
		int price = 10; //price per keychain
		
		System.out.println("Ye Olde Keychain Shoppe");
		
		do {
			System.out.println("\n1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Order");
			System.out.println("4. Checkout");
			
			System.out.print("\nPlease enter your choice: ");
			input = scan.nextInt();
			
			if (input == 1) {
				System.out.print("\nYou have " + num_chain 
						+ " keychains. How many to add? ");
				int add = scan.nextInt();
				num_chain += add_chain(add);
				System.out.println("You now have " + num_chain 
						+ " keychains" );
			}
			else if(input == 2) {
				System.out.print("\nYou have " + num_chain 
						+ " keychains. How many to remove. ");
				int rem = scan.nextInt();
				num_chain -= remove_chain(rem);
				System.out.println("You now have " + num_chain 
						+ " keychains.");
			}
			
			else if (input == 3) {
				view_order(num_chain, price);
			}
			
		}while (input != 4);
		
		System.out.println("\nCHECKOUT");
		System.out.print("\nWhat is your name? ");
		String name = scan.next();
		
		checkout(num_chain,price);
		
		System.out.println("Thanks for your order, " + name + "!");
		
	}
	
	public static int add_chain(int num) {
		int num_to_add = num; //# of chains to add to the order
		
		//there should definitely probably be code here
		
		return num_to_add;
	}
	
	public static int remove_chain(int num) {
		int num_remove = num;
		
		//also probably here too.
		
		return num_remove;
	}
	
	public static void view_order(int num_key, int p) {
		int num_keys = num_key;
		int price = p;
		
		System.out.println("\nYou have " + num_keys 
				+ " keychains.");
		System.out.println("Keychains cost $" + price + " each" );
		System.out.println("Your total cost is $"
				+ (num_keys*price) +".");
	}
	
	public static void checkout(int num, int p) {
		int num_chain = num;
		int price = p;
	
		System.out.println("You have " + num_chain + " keychains.");
		System.out.println("Keychains cost $" + price + " each");
		System.out.println("Your total cost is $" + (num_chain*price));
		
	}
// still works fine though
}
