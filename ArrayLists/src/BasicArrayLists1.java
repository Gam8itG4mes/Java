import java.util.ArrayList;

public class BasicArrayLists1 {
	public static void main (String [] args) throws Exception {
		ArrayList<Integer> arrli = new ArrayList<Integer>(10);
		
		
		while (arrli.size() < 10) {
			arrli.add(-113);
		}
		
		for (int i = 0; i < arrli.size(); i ++) {
			System.out.println("Slot " +(i+1) +": "+arrli.get(i));
		}
		
		
	}

}
