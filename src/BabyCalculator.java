import java.util.Scanner;
public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		double a, b, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = scan.nextDouble();
			op = scan.next();
			b  = scan.nextDouble();

			if ( op.equals("+") ) {
				c = a + b;
			}
			else if (op.equals("-")) {
				c = a - b;
			}
			else if (op.equals("*")) {
				c = a * b;
			}
			else if (op.equals("/")) {
				c = a / b;
			}
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}
			System.out.println(c);
		} while ( a != 0 );
		System.out.println("Bye, now.");
	}
}