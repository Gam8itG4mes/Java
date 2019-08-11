public class MonthOffset {
	public static void main (String [] args) {
		System.out.println( "Offset for month 1: " + month_offset(1) );
		System.out.println( "Offset for month 2: " + month_offset(2) );
		System.out.println( "Offset for month 3: " + month_offset(3) );
		System.out.println( "Offset for month 4: " + month_offset(4) );
		System.out.println( "Offset for month 5: " + month_offset(5) );
		System.out.println( "Offset for month 6: " + month_offset(6) );
		System.out.println( "Offset for month 7: " + month_offset(7) );
		System.out.println( "Offset for month 8: " + month_offset(8) );
		System.out.println( "Offset for month 9: " + month_offset(9) );
		System.out.println( "Offset for month 10: " + month_offset(10) );
		System.out.println( "Offset for month 11: " + month_offset(11) );
		System.out.println( "Offset for month 12: " + month_offset(12) );
		System.out.println( "Offset for month 43: " + month_offset(43) );
	}
	// the offset is how many days from monday the 1st of a month
	// is. Jan 1 2013 = tuesday. 1 removed from monday.
	// April 1 = monday. 0 removed from monday.
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
}
