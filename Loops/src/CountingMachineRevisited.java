import java.util.Scanner;
public class CountingMachineRevisited {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Count from: ");
		int from = scan.nextInt();
		System.out.print("Count to: ");
		int to = scan.nextInt();
		System.out.print("Count by: ");
		int by = scan.nextInt();
		
		for (int i = from; i <= to; i += by) {
			System.out.print(i + " ");
			
		}
	}

}
