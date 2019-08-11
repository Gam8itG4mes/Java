import java.util.Scanner;
public class Refresher {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your name: ");
		String name = scan.nextLine();
		System.out.println();
		
		if (name.equalsIgnoreCase("mitchell")) {
			for (int i = 0; i < 5; i ++) {
				System.out.println(name);
			}
		}
		else {
			for (int i = 0; i < 10; i++) {
				System.out.println(name);
			}
		}
	}

}
