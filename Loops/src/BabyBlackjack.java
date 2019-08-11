import java.util.Random;
public class BabyBlackjack {
	public static void main (String [] args) {
		//Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Baby Blackjack!");
		System.out.println();
		
		// cards for the players.
		int player1 = (1 + r.nextInt(10));
		int player2 = (1 + r.nextInt(10));
		
		// cards for the dealers.
		int dealer1 = (1 + r.nextInt(10));
		int dealer2 = (1 + r.nextInt(10));
		
		System.out.println("You drew " + player1 + " and " + player2);
		System.out.println("Your total is " + (player1 + player2));
		
		System.out.println();
		
		System.out.println("The dealer has " + dealer1 + " and " + dealer2);
		System.out.println("Dealers total is " + (dealer1 + dealer2));
		
		System.out.println();
		
		if ((dealer1 + dealer2) < (player1 + player2)) {
			System.out.println("YOU WIN!");
		}
		else {
			System.out.println("Dealer wins.");
		}
	}

}
