import java.awt.Point;

public class ReferencesTest {
	public static void main (String [] args) {
		Point p1, p2;
		p1 = new Point(100, 100);
		p2 = p1;
		
		
		p1.x = 200;
		p1.y = 200;
		System.out.println("Point 1: " + p1.x + ", " + p1.y);
		System.out.println("Point 2: " + p2.x + ", " + p2.y);
	}
}
