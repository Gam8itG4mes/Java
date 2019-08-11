import java.util.Scanner;
public class Nim {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		String playOne, playTwo;
		int a = 3;
		int b = 4;
		int c = 5;
		int turn = 1;
		
		String choice = "";
		int remove;
		
		
		System.out.print("Player 1, enter your name: ");
		playOne = scan.nextLine();
		System.out.print("Player 2, enter your name: ");
		playTwo = scan.nextLine();
		
		
		
		while (a > 0 || b > 0 || c > 0) {
			System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
			if (turn % 2 == 1) {
				System.out.print("\n" + playOne + ", choose a pile: ");
				choice = scan.nextLine();
				System.out.print("How many to remove from pile " + choice + ": ");
				remove = scan.nextInt();
				
				scan.nextLine();
				
				if (choice.equals("A")) {
					a -= remove;
				}
				else if (choice.equals("B")) {
					b -= remove;
				}
				else if (choice.equals("C")) {
					c -= remove;
				}
			}
			
			if (turn % 2 == 0) {
				System.out.print("\n" + playTwo + ", choose a pile: ");
				choice = scan.nextLine();
				System.out.print("How many to remove from pile " + choice + ": ");
				remove = scan.nextInt();
				
				scan.nextLine();
				
				if (choice.equals("A")) {
					a -= remove;
				}
				else if (choice.equals("B")) {
					b -= remove;
				}
				else if (choice.equals("C")) {
					c -= remove;
				}
			}
			
			turn++;
		}
		
		if(a <= 0 && b <= 0 && c <= 0) {
			if (turn % 2 == 1) {
				System.out.println("All the piles are empty. " + playOne.toUpperCase() + " WINS!!");
			}
			else if (turn % 2 == 0) {
				System.out.println("All the piles are empty. " + playTwo.toUpperCase() + " WINS!!");
			}
		}
		
		
	}

}
