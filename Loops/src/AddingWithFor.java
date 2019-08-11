import java.util.Scanner;
public class AddingWithFor {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number: ");
		int num = scan.nextInt();
		System.out.println();
		
		int total = 0;
		for (int x = 1; x <= num; x++) {
			System.out.print(x + " ");
			
			total += x;
		}
		
		System.out.println("\nThe sum is " + total);
	}

}
