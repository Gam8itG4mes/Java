import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import  java.util.ArrayList;

public class SpotsPanel extends JPanel{
	private final int SIZE = 6; // size of dot
	private ArrayList<Point> pointList;
	
	public SpotsPanel() 
	{
		pointList = new ArrayList<Point>();
		
		addMouseListener(new SpotsListener());
		
		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(300, 500));
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.setColor(Color.GREEN);
		
		for (Point spot : pointList)
			page.fillOval(spot.x-SIZE, spot.y-SIZE, SIZE*2, SIZE*2);
		
		page.drawString("Count: " + pointList.size(), 5, 15);
	}
	
	private class SpotsListener implements MouseListener
	{
		public void mousePressed(MouseEvent event)
		{
			pointList.add(event.getPoint());
			repaint();
		}
		
		public void mouseClicked (MouseEvent event) {}
		public void mouseReleased (MouseEvent event) {}
		public void mouseEntered (MouseEvent event) {}
		public void mouseExited (MouseEvent event) {}
		
	}

}
