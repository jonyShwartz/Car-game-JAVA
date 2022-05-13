package game;

import java.awt.Color;
import java.awt.Graphics;

public class RectangelObstacle {
	private double x;
	private double y;
	private int width;
	private int height;
	private Color color;

	
	public RectangelObstacle(double x, double y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;	
//	 Thread t = new Thread(() -> {
//     	while(true) {
//     	try {
//     		this.y+=0.5;
//				Thread.sleep(1) ;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
//     	}
//     });t.start();
	}
	
	public void paint(Graphics graphics) {
		graphics.setColor(this.color.BLUE);
		graphics.drawRect((int)this.x, (int)this.y, this.width, this.height);
	}

	public void moveDown(double x) {
		this.y = y + x;
	}
	
	public int getX() {
		return (int)x;
	}

	public int getY() {
		return (int)y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
