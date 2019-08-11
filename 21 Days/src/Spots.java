import javax.swing.JFrame;

public class Spots {
	public static void main (String [] args)
	{
		JFrame frame = new JFrame("Spots");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new SpotsPanel());
		
		frame.pack();
		frame.setVisible(true);
	}

}
