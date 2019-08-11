import java.util.Scanner;
public class RightTriangle {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int leg1, leg2, hyp; // legs 1 and 2 and hypotenuse 
		
		System.out.println("Enter 3 integers:");
		System.out.print("Side 1: ");
		leg1 = scan.nextInt();
		
		System.out.print("Side 2: ");
		leg2 = scan.nextInt();
		
		while(leg2 < leg1) {
			System.out.println(leg2 + " is smaller than " + leg1 + ". Try again.");
			System.out.print("Side 2: ");
			leg2 = scan.nextInt();
		}
		
		System.out.print("Side 3: ");
		hyp = scan.nextInt();
		
		while (hyp < leg2) {
			System.out.println(hyp + " is smaller than " + leg2 + ". Try again.");
			System.out.print("Side 3: ");
			hyp = scan.nextInt();
		}
		
		System.out.println("Your three sides are " + leg1 + " " + leg2 + " " + hyp);
		
		int legsSquare = ((leg1 * leg1) + (leg2 * leg2));
		int hypSquare = (hyp * hyp);
		
		if (legsSquare == hypSquare) { // is the square of the legs equal to the square of the hypotenuse
			System.out.println("These sides *do* make a right triangle.");
		}
		else {
			System.out.println("NO! These sides do not make a right triangle.");
		}
	}

}
