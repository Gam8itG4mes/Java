import java.util.Scanner;
import java.util.Random;
public class FindMax {
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
		
		int max = 0;
		for(int k = 0; k < array.length; k++) {
			if (array[k] > max) {
				max = array[k];
			}
		}
		
		System.out.println("\nThe largest value is " + max);
	}
}
