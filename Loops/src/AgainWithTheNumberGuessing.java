import java.util.Random;
import java.util.Scanner;
public class AgainWithTheNumberGuessing {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int secNum = 1 + r.nextInt(10);
		int count = 1;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		int guess = scan.nextInt();
		
		if (guess != secNum) {
		
			do {
				System.out.println("That is incorrect. Guess again.");
				System.out.print("Your guess: ");
				guess = scan.nextInt();
				count++;
				
			} while (guess != secNum);
			
		}
		
		System.out.println("Thats right! it only took you " + count  + " tries.");
	}

}
