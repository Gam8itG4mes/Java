import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AWTOverviewPanel extends JPanel{
	private final int HEIGHT = 500, WIDTH = 200;
	private JLabel label, enter, phoneL, passL;
	private Button b;
	private TextField tf, phone, pass;
	int count;
	
	public AWTOverviewPanel()
	{
		this.setLayout(new FlowLayout());
		b = new Button("PUSH");
		//add(b);
		
		enter = new JLabel("Enter your name");
		tf = new TextField("your name here", 45);
		
		phoneL = new JLabel("Enter Phone Number");
		phone = new TextField(12);
		
		passL = new JLabel("Enter Password");
		pass = new TextField(20);
		pass.setEchoChar('*');
		
		add(enter);
		add(tf);
		
		add(phoneL);
		add(phone);
		
		add(passL);
		add(pass);
		
		b.addActionListener(new ButtonListener());
		
		//label = new JLabel("Pushes: " + count);
		//add(label);
		
		setPreferredSize(new Dimension(HEIGHT, WIDTH));
		setFocusable(true);
	}
	

	public class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			count++;
			label.setText("Pushes: " + count);
		}
	 }
}
