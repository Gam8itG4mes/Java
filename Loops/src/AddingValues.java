import java.util.Scanner;
public class AddingValues {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		
		System.out.println("I will add all the numbers you enter. Enter 0 to end");
		System.out.print("Number: ");
		int entry = scan.nextInt();
		
		while (entry != 0) {
			System.out.println("Total so far is " + (total += entry));
			System.out.print("Number: ");
			entry = scan.nextInt();
		}
		
		System.out.println("The total is " + total);
	}

}
