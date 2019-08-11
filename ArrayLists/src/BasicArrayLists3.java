import java.util.Random;
import java.util.ArrayList;

public class BasicArrayLists3 {
	public static void main (String [] args) {
		Random r = new Random();
		ArrayList<Integer> arrli = new ArrayList<Integer>(1000);
		
		while (arrli.size() < 1000) {
			arrli.add(r.nextInt(99-10)+10);
		}	
		System.out.println(arrli);
	}
}
