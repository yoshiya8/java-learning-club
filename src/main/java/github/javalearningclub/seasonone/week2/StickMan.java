package github.javalearningclub.seasonone.week2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import github.javalearningclub.drawing.Shape;

public class StickMan implements Shape{
	private Point location = null;
	private Dimension size = null;
	private Color color = null;

	
	private void drawHead(Graphics g){
		g.drawOval(location.x, location.y, size.width, (int) (size.height / 2.75));
	}
	
	private void drawBody(Graphics g){
		Point endPoint1 = new Point(location.x + size.width / 2, (int) (location.y + (size.height / 2.75)));
		Point endPoint2 = new Point(location.x + size.width / 2, (int) (location.y + ((size.height / 2.75) * 9) / 4));
		g.drawLine(endPoint1.x, endPoint1.y, endPoint2.x, endPoint2.y);
	}
	
	private void drawArms(Graphics g){
		Point endPoint1 = new Point(location.x, (int) (location.y + ((size.height / 2.75) * 14) / 10));
		Point endPoint2 = new Point(location.x + size.width, (int) (location.y + ((size.height / 2.75) * 14) / 10));
		g.drawLine(endPoint1.x, endPoint1.y, endPoint2.x, endPoint2.y);
	}
	
	private void drawLeftLeg(Graphics g) {
		Point endPoint1 = new Point(location.x + size.width / 2, (int) (location.y + ((size.height / 2.75) * 9) / 4));
		Point endPoint2 = new Point(location.x + size.width / 10, (int) (location.y + ((size.height / 2.75) * 275) / 100));
		g.drawLine(endPoint1.x, endPoint1.y, endPoint2.x, endPoint2.y);
	}
	
	private void drawRightLeg(Graphics g) {
		Point endPoint1 = new Point(location.x + size.width / 2, (int) (location.y + ((size.height / 2.75) * 9) / 4));
		Point endPoint2 = new Point(location.x + (size.width / 10) * 9, (int) (location.y + ((size.height / 2.75) * 275) / 100));
		g.drawLine(endPoint1.x, endPoint1.y, endPoint2.x, endPoint2.y);
	}
	
	public StickMan setColor(Color color){
		this.color = color;
		return this;
	}
	
	public StickMan setSize(Dimension size){
		this.size = size;
		return this;
	}
	
	public StickMan setLocation(Point location){
		this.location = location;
		return this;
	}

	public void draw(Graphics g) {
		if (color == null){
			g.setColor(Color.BLACK);
		}else{
			g.setColor(color);
		}
		drawHead(g);
		drawBody(g);
		drawArms(g);
		drawLeftLeg(g);
		drawRightLeg(g);
	}

	
}
