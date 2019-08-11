import java.util.Scanner;
public class Multiples {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Choose a number: ");
		int num = scan.nextInt();
		System.out.println();
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(num + "x"+ i + " = " + (num*i));
		}
	}

}
