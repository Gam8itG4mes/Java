import java.util.Random;
import java.util.ArrayList;

public class ArrayListLocateMax {
	public static void main (String [] args) {
		Random r = new Random();
		ArrayList<Integer> arrli = new ArrayList<Integer>(10);
		
		while(arrli.size() < 10) {
			arrli.add(r.nextInt(100-1)+1);
		}
		
		System.out.println("ArrayList: " + arrli);
		
		int max = 0;
		for (int i = 0; i < arrli.size(); i++) {
			if (arrli.get(i) > max ) {
				max = arrli.get(i);
			}
		}
		
		System.out.println("The largest value is " + max 
				+ " and is in slot " + arrli.indexOf(max));
	}

}
