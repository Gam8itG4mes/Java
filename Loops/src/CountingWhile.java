import java.util.Scanner;
public class CountingWhile {
	public static void main (String [] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Type a message and I will display it 5 times.");
		System.out.print("Your Message: ");
		String message = scan.nextLine();
		System.out.print("How many times: ");
		int times = scan.nextInt();
		
		int n = 1;
		while (n <= times) {
			System.out.println((n * 10) + "." + message);
			n++;
		}
	}

}
