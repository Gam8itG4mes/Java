
public class MultiplicationTable {
	public static void main (String [] args) {
		
		System.out.println("x | 1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.print("==+=================================================================");
		
		for (int x = 1; x < 13; x++) {
			System.out.print("\n"+x + " |" );
			for (int y = 1; y < 10; y++) {
				System.out.print((x*y) + "\t");
			}
		}
	}

}
