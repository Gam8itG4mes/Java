import java.awt.*;
import javax.swing.*;

public class ColorBoxes extends Canvas {
	@SuppressWarnings("deprecation")
	public void paint(Graphics g)
	{
		//values for red, green, blue
		int rval, gval, bval;
		
		//draws the rows
		for(int j = 30; j < (this.size().height-25); j +=30 ) 
		{
			//draws the boxes for the rows
			for(int i = 5; i < (this.size().height - 25); i +=30 ) 
			{
				rval = (int)Math.floor(Math.random() * 256);
				gval = (int)Math.floor(Math.random() * 256);
				bval = (int)Math.floor(Math.random() * 256);
				
				g.setColor(new Color(rval, gval, bval));
				g.fillRect(i, j, 25, 25);
				g.setColor(Color.BLACK);
				g.drawRect(i-1, j-1, 25, 25);
			}
		}
	}
	
	public static void main (String [] args) {
		Canvas canvas = new ColorBoxes();
		
		JFrame win = new JFrame("Color Boxes");
		win.setSize(600, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(canvas);
		win.setVisible(true);
	}
}
