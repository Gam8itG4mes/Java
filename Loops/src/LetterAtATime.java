import java.util.Scanner;
public class LetterAtATime {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your message? ");
		String message = scan.nextLine();
		
		System.out.println();
		
		System.out.println("Your message is " + message.length()
				+ " characters long");
		System.out.println("The first character is at 0 and is "
				+ message.charAt(0));
		
		System.out.println("The last character is at " 
				+ (message.length()-1) + " and is " 
				+ (message.charAt(message.length()-1)));
		
		System.out.println();
		System.out.println("Here are all the characters one at a time:");
		System.out.println();
		for (int x = 0; x <= (message.length()-1); x++) {
			System.out.println("\t" + x + " - " + "'" + message.charAt(x) + "'");
			
		}
	}

}
