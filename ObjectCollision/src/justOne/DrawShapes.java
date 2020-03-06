package justOne;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawShapes {
	private int radius;
	private int x;
	private int y;
	private double v;
	static int height;
	private int[] col = {(int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)};
	
	DrawShapes(int xx, int yy, int radiuss, int h){
		x = xx;
		y = yy;
		radius = radiuss;
		height = h;
	}
	
	public void drawCircles(Graphics g){
		g.setColor(new Color(col[0], col[1], col[2]));
		g.fillOval(x, y, radius, radius);
		g.setColor(Color.BLACK);
		g.drawOval(x, y, radius, radius);
	}
	
	public void grav(Graphics g){
		v += .2;
		y += v;
		if(y + radius > height)
			y = height-radius;
		
		if(y + radius >= height)		
			v = -0.8*v + 1;
		drawCircles(g);
	}
}


