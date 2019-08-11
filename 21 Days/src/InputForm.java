import javax.swing.JFrame;

public class InputForm {
	public static void main (String [] args) {
		JFrame frame = new JFrame("Input Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new InputFormPanel());
		
		//frame.setSize(400, 600);
		frame.pack();
		frame.setVisible(true);
	}

}
