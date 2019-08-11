import java.util.Scanner;
public class CollatzSequence {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.print("Starting number: ");
		num = scan.nextInt();
		
		System.out.println(num);
		
		while (num > 1 ) {
			if (num % 2 == 0) {
				
				num = (num / 2);
				System.out.println(num);
			}
			else {
				num = ((3 * num) + 1);
				System.out.println(num);
			}
		}
	}

}
