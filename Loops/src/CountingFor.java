import java.util.Scanner;
import java.util.Random;
public class CountingFor {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int num = 1 + r.nextInt(10);
		
		System.out.println("Type a message and I will display it 5 times.");
		System.out.print("Message: ");
		String message = scan.nextLine();
		
		for (int n = 1; n <= num; n++) {
			System.out.println(n + ". " + message );
		}
	}

}
