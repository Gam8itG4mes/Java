import java.util.Scanner;
public class SafeSquareRoot {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("SQUARE ROOT");
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		
		while (number < 0) {
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.print("Try again: ");
			number = scan.nextInt();
		}
		
		System.out.println("The square root of " + number + " is "+ Math.sqrt(number));
	}

}
