import java.util.Scanner;
public class EnterPIN {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int pin = 12345;
		
		System.out.println("WELCOME TO THE BEST BANK EVER.");
		System.out.print("PLEASE ENTER YOUR PIN: ");
		int entry = scan.nextInt();
		
		while (entry != pin) {
			System.out.println("\nINCORRECT PIN. PLEASE TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = scan.nextInt();
		}
		
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}

}
