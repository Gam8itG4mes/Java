import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class DigitalClock {
	static Date theDate;
	static String newDate;
	
	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawClock draw = new DrawClock();
		frame.getContentPane().add(draw);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		while(true) {
			theDate = new Date();
			newDate = theDate.toString();
			
			draw.repaint();
			try {Thread.sleep(1000);}
			catch(Exception e) {}
			
		}
		
	}
	
	public static void main (String [] args) {
		DigitalClock clock = new DigitalClock();
		
		clock.run();
	}

}

class DrawClock extends JPanel{
	public void paint (Graphics g) {
		super.paintComponent(g); //clear the screen
		Font theFont = new Font("TimesRoman", Font.BOLD, 24);
		g.setFont(theFont);
		g.drawString(DigitalClock.newDate, 100, 250);
		
	}
}
