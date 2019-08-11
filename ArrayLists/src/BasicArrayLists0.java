import java.util.ArrayList;

public class BasicArrayLists0 {
	public static void main (String [] args) {
		ArrayList<Integer> arrli = new ArrayList<Integer>(10);
		
		arrli.add(0, -113);
		arrli.add(1, -113);
		arrli.add(2, -113);
		arrli.add(3, -113);
		arrli.add(4, -113);
		arrli.add(5, -113);
		arrli.add(6, -113);
		arrli.add(7, -113);
		arrli.add(8, -113);
		arrli.add(9, -113);
		
		System.out.println("Slot 0: " + arrli.get(0));
		System.out.println("Slot 1: " + arrli.get(1));
		System.out.println("Slot 2: " + arrli.get(2));
		System.out.println("Slot 3: " + arrli.get(3));
		System.out.println("Slot 4: " + arrli.get(4));
		System.out.println("Slot 5: " + arrli.get(5));
		System.out.println("Slot 6: " + arrli.get(6));
		System.out.println("Slot 7: " + arrli.get(7));
		System.out.println("Slot 8: " + arrli.get(8));
		System.out.println("Slot 9: " + arrli.get(9));
	}
}
