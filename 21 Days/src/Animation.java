import javax.swing.*;
import java.awt.*;

public class Animation {
	static int x = 0;
	static int y = 0;
	
	public void play() 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawPanel draw = new DrawPanel();
		frame.getContentPane().add(draw);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		for (int i = 0; i < 500; i++) 
		{
			x++;
			y++;
			
			draw.repaint();
			try {Thread.sleep(25);}
			catch(Exception e) {}
		}	
	}
	
	public static void main (String [] args) {
		Animation gui = new Animation();
		gui.play();
		
	}
}

class DrawPanel extends JPanel{
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.GREEN);
		g.fillOval(Animation.x, Animation.y, 50, 50);
	}
}
