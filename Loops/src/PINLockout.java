import java.util.Scanner;
public class PINLockout {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int pin = 12345;
		int tries = 0;
		
		System.out.println("WELCOME TO THE BIG HOUSE");
		System.out.print("ENTER YOUR PIN: ");
		int entry = scan.nextInt();
		
		while (entry != pin && tries < 3) {
			System.out.println("\nIncorrect PIN. TRY AGAIN.");
			System.out.println("ENTER YOUR PIN: ");
			entry = scan.nextInt();
			tries++;
		}
		
		if (entry == pin) {
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		}
		else if (tries >= 3) {
			System.out.println("\nTOO MANY ATTEMPTS. ACCOUNT LOCKED.");
		}
	}

}
