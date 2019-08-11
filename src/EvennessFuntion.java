
public class EvennessFuntion {
	public static void main (String [] args) {
		
		for (int i = 1; i <= 20; i++) {
			if (isEven(i) && divBy3(i)) {
				System.out.println(i + " <=");
			}
			else if (divBy3(i)) {
				System.out.println(i + " =");
			}
			else if (isEven(i)) {
				System.out.println(i + " <");
			} 
			else {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isEven(int n) {
		if (n % 2 == 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean divBy3(int n) {
		if (n % 3 == 0) {
			return true;
		}
		else {
			return false;
		}	
	}
}