import java.util.Random;
import java.util.Scanner;
public class LimitedHiLo {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int secNum = (1 + r.nextInt(100));
		int tries = 0;
		
		System.out.println("I'm thinking of a number from 1-100. You have 7 tries.");
		System.out.print("First guess: ");
		int guess = scan.nextInt();
		
		while (guess != secNum && tries < 7) {
			if (guess < secNum) {
				System.out.println("You are too low.");
				System.out.print("Your guess: ");
				guess = scan.nextInt();
			}
			else if (guess > secNum) {
				System.out.println("You are too high.");
				System.out.print("Your guess: ");
				guess = scan.nextInt();
			}
			tries++;
		}
		if (guess == secNum) {
			System.out.println("You guessed it. " + secNum + " What are the odds.");
		}
		else if (tries >= 7) {
			System.out.println("Sorry you didn't guess it in 7 tries. You lose.");
		}
	}

}
