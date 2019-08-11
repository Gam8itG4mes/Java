import java.util.Scanner;
import java.util.Random;

public class WhereIsIt {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (r.nextInt(50-1)+1);
		}
		
		System.out.print("Array: ");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		
		System.out.print("\nValue to find: ");
		int num = scan.nextInt();
		
		scan.close();
		
		boolean res = false;
		System.out.println();
		for (int k = 0; k < array.length; k++) {
			if (array[k] == num) {
				System.out.println(num + " is in index " + k);
				res = true;
			}
		}
		
		if (res != true) {
			System.out.println(num + " is not in the array.");
		}
	}

}