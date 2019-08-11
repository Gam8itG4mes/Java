import java.util.Scanner;
public class Calculator {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c;
		String op;
		
		// could redo with case statements
		do {
			System.out.print("> ");
			a = scan.nextDouble();
			op = scan.next();
			b = scan.nextDouble();
			
			if (a == 0) {
				System.out.println("Bye, now.");
				break;
			}
			
			if (op.equals("+")) {
				System.out.println(add(a,b));
			}
			else if (op.equals("-")) {
				System.out.println(sub(a,b));
			}
			else if (op.equals("*") || op.equalsIgnoreCase("x")) {
				System.out.println(mult(a,b));
			}
			else if (op.equals("/")) {
				System.out.println(div(a,b));
			}
			else if(op.equals("^")) {
				System.out.println(exp(a,b));
			}
			else if(op.equals("!")) {
				System.out.println(factorial(a));
			}
			else if (op.equals("%")) {
				System.out.println(mod(a,b));
			}
			else {
				System.out.println("Undefined operator '" + op + "'.");
			}
		}while (a != 0);	
	}
	
	public static double add(double a, double b) {
		double c = a + b;
		return c;
	}
	
	public static double sub(double a, double b) {
		double c = a - b;
		return c;
	}
	
	public static double mult(double a, double b) {
		double c = a * b;
		return c;
	}
	
	public static double div(double a, double b) {
		double c = a / b;
		return c;
	}
	
	public static double exp(double a, double b) {
		double c=1;
		double num = a;
		double pow = b;
		for(int i = 1; i <= pow; i++) {
			c *= num;
		}
		// or c= Math.pow(a,b); //but where's the fun
		return c;
	}
	
	public static double factorial(double a) {
		double c=1;
		
		for(int i = 1; i <= a; i++)
			c *= i;
		return c;
	}
	
	public static double mod(double a, double b) {
		double c = a % b;
		return c;
	}
	
	

}
