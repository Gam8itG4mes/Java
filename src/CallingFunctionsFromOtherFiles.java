import java.util.Scanner;

public class CallingFunctionsFromOtherFiles {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);		
			
		System.out.println("Welcome to the birth-o-meter");
		System.out.println();
		System.out.println("All you have to do is enter your"
				+ " birthday, and it will tell you"
				+ "\nthe day of the week on which you were born.");
		
		System.out.println();
		System.out.println("Some automatic tests.....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();
		
		System.out.println("Now its your turn! What's your birthday?");
		System.out.print("Birthday (mm dd yyyy): ");
		int mm = scan.nextInt();
		int dd = scan.nextInt();
		int yyyy = scan.nextInt();
		
		
		System.out.println("You were born on " + weekday(mm, dd, yyyy));
	}
	
	public static String weekday( int mm, int dd, int yyyy ) {
		// bunch of calculations go here
		int yy, total;
		yy = (yyyy-1900);
		total = (yy / 4) ;
		total += yy;
		total += dd;
		total += MonthOffset.month_offset(mm);
		
		if (WeekdayCalculator.is_leap(yyyy) == true && mm == 1) {
			total -= 1;
		}
		if (WeekdayCalculator.is_leap(yyyy) == true && mm == 2) {
			total -= 1;
		}
		
		int rem = total % 7;
		
		String date = "";
		
		date = WeekdayCalculator.weekday_name(rem)+ ", " +  MonthName.month_name(mm) + " "
		+ dd + ", " + yyyy;

		return date;
	}
	
}
