import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import java.util.ArrayList;
public class RubberLinesPanel extends JPanel
{
	private Point point1 =null, point2 = null;
	
	public RubberLinesPanel()
	{
		LineListener listener = new LineListener();
		addMouseListener (listener);
		addMouseMotionListener(listener);
		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(300,500));
	}
	
	public void paintComponent(Graphics page) 
	{
		super.paintComponent(page);
		
		page.setColor(Color.YELLOW);
		if(point1 != null && point2 != null)
		{
			page.drawLine(point1.x, point1.y, point2.x, point2.y);
		}
	}
	
	private class LineListener implements MouseListener, 
	MouseMotionListener 
	{
		
		@Override
		public void mousePressed(MouseEvent event) 
		{
			// TODO Auto-generated method stub
			point1 = event.getPoint();
		}
		
		@Override
		public void mouseDragged(MouseEvent event) 
		{
			// TODO Auto-generated method stub
			point2 = event.getPoint();
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
