import java.util.Random;
public class BasicArrays3 {
	public static void main (String [] args) {
		Random r = new Random();
		
		int[] myArray = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			myArray[i] = ((r.nextInt(99-10)+10));
		}
		
		for (int j = 0; j < myArray.length; j++) {
			System.out.print(myArray[j] + " ");
		}
	}

}
