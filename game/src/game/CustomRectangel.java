package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class CustomRectangel {

	int x;
	int y;
	int width;
	int height;
	private Color color;

	
	public CustomRectangel(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		
	}
	
	public void moveRight() {
		this.x=x+150;
	}
	
	public void moveLeft() {
		this.x=x-150;
	}
	
	public void moveUp() {
		this.y = y-10;
	}
	
	public void moveDown() {
		this.y = y + 10;
	}
	
	
	public void paint(Graphics graphics) {
		graphics.setColor(this.color);
		graphics.drawRect(this.x, this.y, this.width, this.height);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public boolean checkColision1(RectangleObstacleOppositePath rect) {
		Rectangle rect1 = new Rectangle(this.x,this.y,this.width,this.height);
		Rectangle rect2 = new Rectangle(rect.getX(),rect.getY(),rect.getWidth(),rect.getHeight());
		if(rect1.intersects(rect2)) {
			return true;
		}
		return false;
		
	}public boolean checkColision2(RectangelObstacle rect) {
		Rectangle rect1 = new Rectangle(this.x,this.y,this.width,this.height);
		Rectangle rect2 = new Rectangle(rect.getX(),rect.getY(),rect.getWidth(),rect.getHeight());
		if(rect1.intersects(rect2)) {
			return true;
		}
		return false;
		
	}
	
}
