import javax.swing.JFrame;

public class AWTOverview {
	public static void main (String [] args) {
		JFrame frame = new JFrame("Examples");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new AWTOverviewPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
