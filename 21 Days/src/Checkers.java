import java.awt.*;
import javax.swing.*;

public class Checkers 
{
	static int xpos;
	
	public void run ()
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw draw = new Draw();
		frame.getContentPane().add(draw);
		frame.setSize(225, 150);
		
		draw.setBackground(Color.BLUE);
		
		while(true) 
		{
			for(xpos = 5; xpos <= 105; xpos += 4) 
			{
				draw.repaint();
				try {Thread.sleep(80);}
				catch (Exception e) {}
			}
		}

	}
	
	public static void main(String [] args) 
	{
		Checkers check = new Checkers();
		
		check.run();
	}
}

class Draw extends JPanel 
{
	public void paint(Graphics g) 
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 100, 100);
		g.setColor(Color.WHITE);
		g.fillRect(101, 0, 100, 100);
		
		g.setColor(Color.RED);
		g.fillOval(Checkers.xpos, 5, 90, 90);
	}
}