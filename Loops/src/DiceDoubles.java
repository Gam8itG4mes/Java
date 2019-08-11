import java.util.Random;
public class DiceDoubles {
	public static void main (String [] args) {
		Random r = new Random();
		
		int rollOne = (1 + r.nextInt(6));
		int rollTwo = (1 + r.nextInt(6));
		
		System.out.println("HERE COMES THE DICE!");
		System.out.println();
		
		while (rollOne != rollTwo) {
			System.out.println("Roll #1: " + rollOne);
			System.out.println("Roll #2: " + rollTwo);
			System.out.println("The total is " + (rollOne + rollTwo));
			
			rollOne = (1 + r.nextInt(6));
			rollTwo = (1 + r.nextInt(6));
		}
		
		System.out.println("You rolled doubles");
		System.out.println("Roll #1: " + rollOne);
		System.out.println("Roll #2: " + rollTwo);
		System.out.println("The total is " + (rollOne + rollTwo));
	}

}
