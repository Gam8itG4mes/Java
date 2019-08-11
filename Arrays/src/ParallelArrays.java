import java.util.Scanner;

public class ParallelArrays {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] lastNames = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};
		double[] grades = {99.5, 78.5, 95.6, 96.8, 82.7};
		int[] ids = {123456, 654789, 827131, 307760, 823669};
		
		System.out.print("Values: \n\t");
		for (int i = 0; i < ids.length; i++) {
			System.out.print(lastNames[i] + " " + grades[i]
					+ " " + ids[i] + "\n\t");
		}
		System.out.print("\nID number to find: ");
		int idNum = scan.nextInt();
		
		for (int j = 0; j < ids.length; j++) {
			if (ids[j] == idNum) {
				System.out.println("\nFound in index " + j);
				System.out.println("\tName: " + lastNames[j]);
				System.out.println("\tAverage: " + grades[j]);
				System.out.println("\tID: " + ids[j]);
				
			}
			
		}
		
	}

}
