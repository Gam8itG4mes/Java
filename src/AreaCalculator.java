import java.util.Scanner;
public class AreaCalculator {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Shape Area Calculator version 0.1 (c) 2018");
		
		System.out.println();
		
		do {
			System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("\n1) Triangle"
					+ "\n2) Rectangle"
					+ "\n3) Square"
					+ "\n4) Circle"
					+ "\n5) Quit");
			System.out.print("Which shape: ");
			num = scan.nextInt();
			
			if (num == 1) {//triangle
				System.out.print("\nBase: ");
				int base = scan.nextInt();
				System.out.print("Height: ");
				int height = scan.nextInt();
				
				System.out.println("\nThe area is " + area_triangle(base, height));
			}
			else if(num == 2) {//rectangle
				System.out.print("\nLength: ");
				int len = scan.nextInt();
				System.out.print("Height: ");
				int height = scan.nextInt();
				
				System.out.println("\nThe area is " + area_rectangle(len, height));
				
			}
			else if (num == 3) {//square
				System.out.print("\nSide: ");
				int side = scan.nextInt();
				
				System.out.println("\nThe area is " + area_square(side));
			}
			else if (num == 4) {// circle
				System.out.print("Radius: ");
				int rad = scan.nextInt();
				
				System.out.println("\nThe area is " + area_circle(rad));
				
			}
			
		} while (num != 5);
	}
	                                  //base  Height
	public static double area_triangle(int b, int h) {
		double A = 0;
		A = .5 * b * h;
		return A;
	}
									// Length, Width
	public static int area_rectangle(int l, int w) {
		int A = 0;
		A = l * w;
		return A;
	}
								// Side length
	public static int area_square(int s) {
		int A = 0;
		A = s*s;
		return A;
	}
	
	public static double area_circle (int radius) {
		double A = 0;
		A = Math.PI*Math.pow(radius, 2);
		return A;
	}
}