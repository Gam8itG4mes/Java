import java.util.Scanner;
public class Keychains1 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		
		System.out.println("Ye Olde Keychain Shoppe");
		
		do {
			System.out.println("\n1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("4. View Current Order");
			System.out.println("4. Checkout");
			System.out.print("\nPlease enter your choice: ");
			input = scan.nextInt();
			
			if(input == 1) {
				add_chain();
			}
			else if (input == 2) {
				remove_chain();
			}
			else if (input == 3) {
				view_order();
			}
			
			
		} while (input != 4);
		
		checkout();
	}
	
	public static void add_chain() {
		
		System.out.println("\nADD KEYCHAINS");	
	}
	
	public static void remove_chain() {
		System.out.println("\nREMOVE KEYCHAINS");
	}
	
	public static void view_order() {
		System.out.println("\nVIEW ORDER");
	}
	
	public static void checkout() {
		System.out.println("\nCHECKOUT");
	}
}