import java.util.Scanner;
public class ShortAdventure2 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int nextRoom = 1;
		String choice = "";
		
		while (nextRoom != 0) {
			if (nextRoom == 1) {
				System.out.print("\nYou are in a creepy house! Would you like to go \"upstairs\" or "
						+ "into the \"kitchen\"? \n> ");
				choice = scan.nextLine();
				
				if (choice.toLowerCase().equals("upstairs")) {
					nextRoom = 2;
				}
				else if (choice.toLowerCase().equals("kitchen")) {
					nextRoom = 3;
				}
				else {
					System.out.println(choice + " wasn't an option. Try again.");
				}
			}
			
			if (nextRoom == 2) {
				System.out.print("\nUpstairs you see a hallway. At the end of the hallway is the master "
						+ "\n\"bedroom\". There is also a \"bathroom\"off the hallway. Or,"
						+ "\nyou can go back \"downstairs\". Where would you like to go? \n> ");
				choice = scan.nextLine();
				
				if (choice.toLowerCase().equals("downstairs")) {
					nextRoom = 1;
				}
				else if (choice.toLowerCase().equals("bedroom")) {
					nextRoom = 4;
				}
				else if (choice.toLowerCase().equals("bathroom")) {
					nextRoom = 5;
				}
				else {
					System.out.println(choice + " wasn't an option. Try again.");
				}
			}
			
			if (nextRoom == 3) {
				System.out.print("\nThere is a long counter top with dirty dishes everywhere "
						+ "\nOff to one side there is a refrigerator. You may open "
						+ "\n\"refrigerator\" or go \"back\" \n> ");
				choice = scan.nextLine();
				
				if (choice.toLowerCase().equals("back")) {
					nextRoom = 1;
				}
				else if (choice.toLowerCase().equals("refrigerator")) {
					nextRoom = 6;
				}
				else {
					System.out.println(choice + " wasn't an option. Try again.");
				}
			}
				
			if (nextRoom == 6) {
				System.out.print("\nInside the fridge, you find food and stuff. It looks "
						+ "\npretty nasty. Would you like to eat some of the food (yes/no)? \n> ");
				choice = scan.nextLine();
				
				if (choice.toLowerCase().equals("yes")) {
					System.out.println("\nThe food is slimy and foul, but you manage to choke it down"
							+ "\nYour stomach starts jumping like a frog in hot water. You feel faint. "
							+ "\nSliding to the floor darkness closes in.");
					nextRoom = 0;
				}
			
			}
		}
		
		System.out.println("\nYou have died.");
	}
}
