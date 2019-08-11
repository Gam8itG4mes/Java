import java.util.Scanner;
import java.util.Random;
public class KeepGuessing {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int secNum = (1 + r.nextInt(10));
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		int guess = scan.nextInt();
		
		while (guess != secNum) {
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = scan.nextInt();
		}
		
		System.out.println("That's right! You're a good guesser.");
	}

}
