import java.awt.*;
import javax.swing.JFrame;

public class Lamp extends Canvas{
	public void paint (Graphics g)
	{
		//lamp platform
		g.fillRect(0, 250, 290, 290);
		
		
		//base of lamp
		g.drawLine(125, 250, 125, 160);
		g.drawLine(175, 250, 175, 160);
		
		//lamp shade
		g.drawArc(85, 157, 130, 50, -65, 312);
		g.drawArc(85, 87, 130, 50, 62, 58);
		
		//lamp shade sides
		g.drawLine(85, 177, 119, 89);
		g.drawLine(215, 177, 181, 89);
		
		//Dots on the shade
		g.fillArc(78, 120, 40, 40, 63, -174);
		g.fillOval(120, 96, 40, 40);
		g.fillArc(173, 100, 40, 40, 110, 180);
		
	}
	
	public static void main (String [] args) {
		Canvas canvas = new Lamp();
		
		JFrame win = new JFrame("Lamp");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(canvas);
		win.setVisible(true);
		
	}
}
