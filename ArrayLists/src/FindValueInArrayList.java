import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class FindValueInArrayList {
	public static void main (String [] args) {
		Random r = new Random();
		ArrayList<Integer> arrli = new ArrayList<Integer>(10);
		Scanner scan = new Scanner(System.in);
		
		while (arrli.size() < 10) {
			arrli.add(r.nextInt(50-1)+1);
		}
		
		System.out.println("ArrayList: " + arrli);
		System.out.print("Value to find: ");
		int num = scan.nextInt();
		
		scan.close();
		
		for(int i = 0; i < arrli.size(); i++) {
			if (arrli.get(i) == num) {
				System.out.println(num + " is in the ArrayList.");
			}
			
		}
	}

}
