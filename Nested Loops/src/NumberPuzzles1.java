
public class NumberPuzzles1 {
	public static void main (String [] args) {
		//list of all the pairs of positive two digit 
		//numbers whose sum is 60, and whose difference is 14.
		for (int x = 10; x < 100; x++) {
			for (int y = 10; y < 100; y++) {
				if ((x+y)==60 && (x-y)==14) {
					System.out.println(x + " & " + y);
				}
			}
		}
	}

}
