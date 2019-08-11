import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class DirectionPanel extends JPanel { 
	private final int WIDTH = 800, HEIGHT = 600; 
	private final int JUMP = 10; // increment for image movement 
	private int x, y; 
	//----------------------------------------------------------------- 
	// Constructor: Sets up this panel and loads the images. 
	//-----------------------------------------------------------------
	public DirectionPanel() { 
		addKeyListener(new DirectionListener()); 
		x = WIDTH / 2; 
		y = HEIGHT / 2; 
		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(WIDTH, HEIGHT)); 
		setFocusable(true); 
	} 
	//Modify the Direction program from this chapter so that the image is not allowed to move out of the visible area of the panel. 
	//Ignore any key event that would cause that to happen. in java
	
	public void paintComponent (Graphics page) {
		super.paintComponent(page);
		page.setColor(Color.RED);
		page.fillRect(x, y, 30, 30);;
	}
	
	private class DirectionListener implements KeyListener {
		
		public void keyPressed(KeyEvent event) {
			switch (event.getKeyCode()) {
			case KeyEvent.VK_UP:
				 y -= JUMP;
				 break;
			case KeyEvent.VK_DOWN:
				y += JUMP;
				break;
			case KeyEvent.VK_LEFT:
				x -= JUMP;
				break;
			case KeyEvent.VK_RIGHT:
				x += JUMP;
				break;
			}
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}