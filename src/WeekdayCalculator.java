import java.util.Scanner;
public class WeekdayCalculator {
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
		total += month_offset(mm);
		
		if (is_leap(yyyy) == true && mm == 1) {
			total -= 1;
		}
		if (is_leap(yyyy) == true && mm == 2) {
			total -= 1;
		}
		
		int rem = total % 7;
		
		String date = "";
		
		date = weekday_name(rem)+ ", " +  month_name(mm) + " "
		+ dd + ", " + yyyy;

		return date;
	}
	
	public static String weekday_name(int num) {
		String day = "";
		
		if (num == 1) {
			day = "Sunday";
		}
		else if (num == 2) {
			day = "Monday";
		}
		else if (num == 3) {
			day = "Tuesday";
		}
		else if (num == 4) {
			day = "Wednesday";
		}
		else if (num == 5) {
			day = "Thursday";
		}
		else if (num == 6) {
			day = "Friday";
		}
		else if (num == 7) {
			day = "Saturday";
		}
		else {
			day = "error";
		}
		
		return day;
	}
	
	public static String month_name(int month) {
		String m = "";
		
		if (month == 1) {
			m = "January";
		}
		else if (month == 2) {
			m = "February"; 
		}
		else if (month == 3) {
			m = "March";
		}
		else if (month == 4) {
			m = "April";
		}
		else if (month == 5) {
			m = "May";
		}
		else if (month == 6) {
			m = "June";
		}
		else if (month == 7) {
			m = "July";
		}
		else if (month == 8) {
			m = "August";
		}
		else if (month == 9) {
			m = "September";
		}
		else if (month == 10) {
			m = "October";
		}
		else if (month == 11) {
			m = "November";
		}
		else if (month == 12) {
			m = "December";
		}
		else {
			m = "error";
		}
		
		return m;
	}
	
	public static int month_offset(int month) {
		int offset = 0;
		
		if (month == 1) {
			offset = 1;
		}
		else if (month == 2) {
			offset = 4; 
		}
		else if (month == 3) {
			offset = 4;
		}
		else if (month == 4) {
			offset = 0;
		}
		else if (month == 5) {
			offset = 2;
		}
		else if (month == 6) {
			offset = 5;
		}
		else if (month == 7) {
			offset = 0;
		}
		else if (month == 8) {
			offset = 3;
		}
		else if (month == 9) {
			offset = 6;
		}
		else if (month == 10) {
			offset = 1;
		}
		else if (month == 11) {
			offset = 4;
		}
		else if (month == 12) {
			offset = 6;
		}
		else {
			offset = -1;
		}
		
		return offset;
	}
	
	public static boolean is_leap( int year ) {
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}
