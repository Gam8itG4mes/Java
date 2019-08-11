import java.util.Scanner;
public class BabyNim {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 3;
		int b = 3;
		int c = 3;
		
		//keep playing until all are 0
		while (a > 0 || b > 0 || c > 0) {
			System.out.print("A: " + a + "    B: " + b + "    C: " + c);
			System.out.print("\nChoose a pile: ");
			String choice = scan.nextLine();
			System.out.print("How many to remove from " + choice + ": ");
			int remove = scan.nextInt();
			
			scan.nextLine(); //idk why i need this but it doesn't work with out it.
			
			if (choice.equals("A")) {
				a -= remove;
			}
			else if (choice.equals("B")) {
				b -= remove;
			}
			else if (choice.equals("C")) {
				c -= remove;
			}
			
			if (a <= 0 && b <= 0 && c <= 00) {
				System.out.println("All piles are empty.");
			}
		}
	}
}


