import java.util.Random;
import java.util.ArrayList;

public class CopyingArrayLists {
	public static void main (String [] args) {
		Random r = new Random();
		ArrayList<Integer> arrli = new ArrayList<Integer>(10);
		ArrayList<Integer> arrli2 = new ArrayList<Integer>(10);
		
		//set values for 1st ArrayList
		while(arrli.size() < 10) {
			arrli.add(r.nextInt(100-1)+1);
		}
		
		//place values of 1st arrayList into 2nd array list
		for (int i = 0; i < arrli.size(); i++) {
			arrli2.add(arrli.get(i));
		}
		
		arrli.set(9, -7); //replace last element in 1st arrayList
		
		System.out.println("ArrayList 1: " + arrli);
		System.out.println("ArrayList 2: " + arrli2);
	}

}
