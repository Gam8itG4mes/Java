import java.util.Scanner;
import java.util.Random;
public class NumberGuessWithCounter {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int secNum = (1 + r.nextInt(10));
		int tries = 1;
		
		System.out.println("I have chosen a number between 1-10. Try to guess it.");
		System.out.print("Your guess: ");
		int guess = scan.nextInt();
		
		while (guess != secNum) {
			System.out.println("That guess is incorrect. Try again.");
			System.out.print("Your guess: ");
			guess = scan.nextInt();
			tries++;	
		}
		
		System.out.println("That's correct! It only took " + tries  + " tries."); 
	}

}
