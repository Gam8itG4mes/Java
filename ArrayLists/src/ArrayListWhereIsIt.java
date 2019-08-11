import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ArrayListWhereIsIt {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Integer> arrli = new ArrayList<Integer>(10);
		
		while (arrli.size() < 10) {
			arrli.add(r.nextInt(50-1)+1);
		}
		
		System.out.println("ArrayList: " + arrli);
		System.out.print("Value to find: ");
		int num = scan.nextInt();
		scan.close();
		
		boolean res = false;
		for(int i = 0; i < arrli.size(); i++) {
			if (arrli.get(i) == num) {
				System.out.println(num + " is in slot " + arrli.indexOf(num));
				res = true;
			}
		}
		if (res != true) {
			System.out.println(num + " is not in the ArrayList.");
		}
	}

}
