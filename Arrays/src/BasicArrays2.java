import java.util.Random;
public class BasicArrays2 {
	public static void main (String [] args) {
		Random r = new Random();
		int[] myArray = new int[10];
		
		for (int i = 0; i < 10; i++) {
			myArray[i] = (r.nextInt(100-1)+1);
		}
		
		for (int j = 0; j < myArray.length; j++) {
			System.out.println("Slot " + j + " contains a " + myArray[j]);
		}
	}
}
