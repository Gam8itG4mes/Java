import java.util.Random;
import java.util.ArrayList;

public class SortingArrayList {
	public static void main (String [] args) {
		Random r = new Random();
		ArrayList<Integer> arrli = new ArrayList<Integer>(10);
		
		while(arrli.size() < 10) {
			arrli.add(r.nextInt(99-10)+10);
		}
		
		System.out.println("ArrayList before: " + arrli);
		
		sortArrayList(arrli);
	}
	
	public static void sortArrayList(ArrayList<Integer> array) {
		//Sort an array list from smallest to largest
		int temp= 0;
		
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size(); j++) {
				if (array.get(i) < array.get(j)) {
					temp = array.get(i);
					array.set(i, array.get(j));
					array.set(j, temp);
				}
			}
		}	
		System.out.println("ArrayList after : " + array);
	}
}