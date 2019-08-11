import java.awt.*;
import javax.swing.*;

public class ColorSwirl implements Runnable {
	@SuppressWarnings("deprecation")
	Color colors[] = new Color[50];
	Thread runThread;
	
	public void start() {
		if (runThread == null) {
			runThread = new Thread(this);
			runThread.start();
		}
	}
	
	public void stop() {
		if (runThread != null) {
			runThread.stop();
			runThread = null;
		}
	}
	
	public void run() {
		float c = 0;
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		DrawSwirl draw = new DrawSwirl();
		frame.getContentPane().add(draw);
		frame.setSize(500, 500);
		
		for(int i = 0; i < colors.length; i++) 
		{
			colors[i] = Color.getHSBColor(c, (float)1.0, (float)1.0);
			c += .02;
		}
		
		int i=0;
		while (true)
		{
			draw.setBackground(colors[i]);
			draw.repaint();
			i++;
			try {Thread.sleep(75);}
			catch (Exception e) {}
			if (i == colors.length) i = 0;
		}	
	}
	
	public static void main(String [] args) {
		ColorSwirl swirl = new ColorSwirl();
		
		swirl.run();
	}
}

class DrawSwirl extends JPanel{
	public void paint (Graphics g) {
		super.paintComponent(g);
		Font f = new Font("TimesRoman", Font.BOLD, 48);
		g.setFont(f);
		g.drawString("All the swirly colors", 35, 50);
	}
}