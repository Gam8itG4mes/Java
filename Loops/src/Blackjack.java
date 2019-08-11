import java.util.Scanner;
import java.util.Random;
public class Blackjack {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		// cards for player
		int playerCard1 = (r.nextInt(11-2)+2);
		int playerCard2 = (r.nextInt(11-2)+2);
		
		//Cards for dealer
		int dealerCard1 = (r.nextInt(11-2)+2);
		int dealerCard2 = (r.nextInt(11-2)+2);
		
		// totals for player and dealer
		int playerTot = 0;
		int dealerTot = 0;
		
		boolean playerWin = false;
		boolean dealerWin = false;
		
		String pHitStay;
		
		System.out.println("Welcome to Blackjack.");
		
		System.out.println("You get a " + playerCard1 + " and " + playerCard2);
		playerTot = playerCard1 + playerCard2;
		System.out.println("Your total is " + playerTot);
		
		System.out.println();
		System.out.println("The dealer has a " + dealerCard1 + " showing, and a hidden card.");
		System.out.println("His total is hidden too.");
		System.out.println();
		
		
		while (playerTot <= 21 && dealerTot <= 21) {
			//player turn
			System.out.print("Would you like to 'hit' or 'stay'? ");
			pHitStay = scan.nextLine();
			
			while (pHitStay.equals("hit")) {
				int pNewCard = (r.nextInt(11-2)+2);
				System.out.println("You have drawn a " + pNewCard);
				playerTot += pNewCard;
				System.out.println("Your total is " + playerTot);
				
				if(playerTot == 21) {
					playerWin = true;
					//break;
				}
				
				if(playerTot > 21) {
					dealerWin = true;
					//break;
				}
			
				System.out.print("\nWould you like to 'hit' or 'stay'? ");
				pHitStay = scan.next();	
			}
			
			if (playerWin == true) {
				System.out.println("You have 21. YOU WIN!");
				System.exit(0);
			}
			
			if (dealerWin == true) {
				System.out.println("You busted. Dealer wins.");
				System.exit(0);
			}

			

			
			// start dealer turn
			System.out.println("Okay dealers turn now.");
			System.out.println("His hidden card was a " + dealerCard2);
			System.out.println("His total is " + (dealerCard1 + dealerCard2));
			dealerTot = (dealerCard1 + dealerCard2);
			
			while ((dealerTot <= 16)) {
				int dNewCard = (r.nextInt(11-2)+2); // dealer new card
				System.out.println();
				System.out.println("Dealer chooses to hit");
				System.out.println("He draws a " + dNewCard);
				System.out.println("His total is " + (dealerTot += dNewCard));
			} 
			
			
			System.out.println();
			System.out.println("Dealer stays");
			
			System.out.println();
			System.out.println("Dealer total is " + dealerTot);
			System.out.println("Your total is " + playerTot);
			
			if ((playerTot < 21 && playerTot > dealerTot) || dealerTot > 21) {
				System.out.println("\nYOU WIN!");
			}
			else {
				System.out.println("\nDealer Wins.");
			}
			
		}// end first while
		
		System.out.println("END OF GAME!");
				
				
	}

}

