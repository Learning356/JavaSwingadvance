package swing02chp05;

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
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import af.AfImageScaler;

public class MyPanel extends JPanel
{
	BufferedImage image;
	
	public MyPanel()
	{
		// 加载背景图片 125 x 125
		URL imagePath = getClass().getResource("/images/qingtan15.jpg");
		try
		{
			image = ImageIO.read(imagePath);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		int width = getWidth();
		int height = getHeight();
		Graphics2D gd2 = (Graphics2D)g;
		
		int imgH = image.getHeight();
		int imgW = image.getWidth();
		AfImageScaler scaler = new AfImageScaler(imgW,imgH,width,height);
		Rectangle fit = scaler.fitCenterInside();
		
		int size = 200;
		Shape region = new Ellipse2D.Double((width-size)/2,(height-size)/2,size,size);
		gd2.clip(region);
		
		gd2.drawImage(image, fit.x, fit.x, fit.width, fit.width,null);
	
	}
}

