package swing02chp04;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	BufferedImage textureImage;
	
	public MyPanel()
	{
		
		URL imagePath = getClass().getResource("/images/im_texture.jpg");
		try {
			textureImage = ImageIO.read(imagePath);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		Graphics2D g2d = (Graphics2D)g;
		
		/*if(true) {
			Color color = new Color(255,0,0);
			g2d.setPaint(color);
			g2d.fillRect(0, 0, width, height);
		}
		*/
		//linear
		/*if(true) {
			Rectangle r = new Rectangle(0,0,width/2,height/2);
			
			Point2D start = new Point2D.Float(r.x, r.y);
			Point2D end = new Point2D.Float(r.x+r.width, r.y+r.height);
			float[] dist = {0.1f,0.5f,0.6f,0.7f};
			Color[] colors = {Color.BLUE,Color.GREEN,Color.YELLOW,Color.GREEN};
			Paint paint = new LinearGradientPaint(start,end,dist,colors);
			
			g2d.setPaint(paint);
			g2d.fill(r);
		}
		//radi fill
		if(true) {
			
			Rectangle r = new Rectangle(0,0,width/2,height/2);
			
			Point2D center = new Point2D.Double(r.getCenterX(),r.getCenterY());
			float radius= width/2;
			float[] dist = {0.0f,0.2f,1.0f };
			Color[] colors = { Color.RED, Color.WHITE, Color.BLUE };
			
			Paint paint = new RadialGradientPaint(center,radius,dist,colors);
			
			g2d.setPaint(paint);
			g2d.fill(r);
			
			
			
			
		}*/
		
		if(true) {
			Rectangle r = new Rectangle(0, 0, width, height);
			
			Rectangle anchor = new Rectangle(0,0,textureImage.getWidth(),textureImage.getHeight());
			Paint paint = new TexturePaint(textureImage,anchor);
			
			g2d.setPaint(paint);
			g2d.fill(r);
			
			
		}
		
		
		
	}
}
