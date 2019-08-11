import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InputFormPanel extends JPanel{
	private JLabel nameL, phoneL, passL, submitL;
	private TextField name, phone, pass;
	private JButton submit, cancel, exit;
	
	
	
	public InputFormPanel() {
		//this.setLayout(new FlowLayout());
		add(nameL = new JLabel("Enter your name"));
		add(name = new TextField("Name", 40));
		
		add(phoneL = new JLabel("Enter phone number"));
		add(phone = new TextField("Phone", 40));
		
		add(passL = new JLabel("Enter your password"));
		add(pass = new TextField(40));
		pass.setEchoChar('*');
		
		add(submit = new JButton("Submit"));
		add(submitL = new JLabel());
		submit.addActionListener(new ButtonListener());
		
		add(cancel = new JButton("Cancel"));
		cancel.addActionListener(new ButtonListener());
		
		add(exit = new JButton("Exit"));
		exit.addActionListener(new ButtonListener());
		//submit.setBounds(200, 200, 25, 25);
		
		setPreferredSize(new Dimension(800, 400));
		setFocusable(true);
		
	}
	
	public class ButtonListener implements ActionListener{

		
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if(event.getSource() == submit) {
				submitL.setText("Your information has been submitted.");
				JOptionPane.showMessageDialog(null, 
						"Your information has been submitted.", 
						"Submission Confirmation", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(event.getSource() == cancel) {
				int confirmDeny = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to cancel?", "Confirm Cancel", 
						JOptionPane.YES_NO_OPTION);
				if(confirmDeny == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			else if (event.getSource() == exit) {
				System.exit(0);
			}
		}
	}
}
