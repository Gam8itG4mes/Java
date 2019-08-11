import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again; //need again = "y"; to run with regular while loop. do while always runs at least once
		/*
		while ( again.equals("y") )
		{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		} 
		*/
		
		//do while
			do {
				int flip = rng.nextInt(2);
				String coin;
					
				if (flip == 1) {
					coin = "HEADS";
				}
				else {
					coin = "TAILS";
				}
				
				System.out.println( "You flip a coin and it is... " + coin );

				System.out.print( "Would you like to flip again (y/n)? " );
				again = keyboard.next();
						
						
				} while (again.equals("y"));
	}
}
