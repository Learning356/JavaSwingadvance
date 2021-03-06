package swing02chp02;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Stroke;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		
		int width = getWidth();
		int height = getHeight();
		Graphics2D g2d = (Graphics2D)g;
		
		
		g2d.setColor(Color.GREEN);
		
		g2d.setColor(Color.RED);
		//g2d.drawOval(width/2, height/2, width/4, height/4);
		
		//set it as flat
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		//dash
		Stroke stroke = new BasicStroke(2, BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,1, new float[] {3,5,15,5},0);
		
		g2d.setStroke(stroke);
		
		Paint color = Color.BLUE;
		g2d.setPaint(color);
		g2d.drawLine(0, height, width, height);
		g2d.drawLine(width, 0, width, height);
		g2d.drawLine(0, height/2, width, height/2);
		g2d.drawLine(width/2, 0, width/2, height);
		g2d.drawLine(0, 0, width, height);
		g2d.drawLine(0, height, width, 0);
		
		
	}

}
