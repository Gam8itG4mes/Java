import java.util.Random;
import java.util.ArrayList;

public class BasicArrayLists2 {
	public static void main (String [] args) {
		Random r = new Random();
		ArrayList<Integer> arrli = new ArrayList<Integer>(10);
		
		while (arrli.size() < 10) {
			arrli.add(r.nextInt(100-1)+1);
		}
		
		System.out.println("ArrayList: " + arrli);
	}
}
