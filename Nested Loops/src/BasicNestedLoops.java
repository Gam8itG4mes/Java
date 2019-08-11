
public class BasicNestedLoops {
	public static void main (String [] args) {
		int count=0;
		for (int x = 0; x < 6; x++) {
			System.out.print("\n");
			for (int y = 0; y< 6; y++) {
				System.out.print("(" + x + "," + y + ")");
				count ++;
			}
		}
	}

}
