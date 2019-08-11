import java.util.Scanner;
public class NumberPuzzles2 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1) Find two digit numbers <= 56 with digits"
					+ " of sums > 10");
			System.out.println("2) Find two digit numbers minus "
					+ "number reversed which equals sum of digits");
			System.out.println("3) Quit\n");
			
			System.out.print("> ");
			choice = scan.nextInt();
			
			if (choice == 1) {
				System.out.println("");
				sumDigits();
				System.out.print("\n");
			}
			else if (choice == 2)
			{
				System.out.println("");
				minusReverse();
				System.out.print("\n");
			}
			
		}while (choice != 3);
		scan.close();
	}
	
	public static void sumDigits() {
		//For loop for tens place
		for (int a=0; a<6; a++){
			//For loop for ones place
			for (int b=0; b<10; b++){
				int ab = 10*a+b;
				if (ab >= 10 && ab <= 56 && (a+b)==10) {
					System.out.println(ab +" ("+a+"+"+b+") = " + (a+b));
				}
			
			}
		}
	}
	
	public static void minusReverse() {
		//for loop for tens
		for (int i =0; i < 10; i++) {
			//for loop for ones
			for(int j = 0; j < 10; j++) {
				int ij = 10*i+j; // forward i.e. 72
				int ji = 10*j+i; // reverse i.e. 27
				if ((ij-ji) == (i+j)) {
					System.out.println(ij +"-"+ji+"="+(ij-ji));
					System.out.println(i+"+"+j+"="+(i+j));
				}
			}
		}
	}
}
