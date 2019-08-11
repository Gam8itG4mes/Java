import java.util.Random;
public class CopyingArrays {
	public static void main (String [] args) {
		Random r = new Random();
		
		int[] myArray = new int[10];
		int[] otherArray = new int[10];
		
		for (int i = 0; i < 10; i++) {
			myArray[i] = (r.nextInt(100-1)+1);
		}
		
		for (int j = 0; j < 10; j++) {
			otherArray[j] = myArray[j];
		}
		
		System.out.print("Array 1: ");
		for (int k = 0; k < 10; k++) {
			System.out.print( myArray[k] + " ");
		}
		System.out.print("\nArray 2: ");
		for (int l = 0; l <10; l++) {
			System.out.print(otherArray[l] + " ");
		}
	}
}
