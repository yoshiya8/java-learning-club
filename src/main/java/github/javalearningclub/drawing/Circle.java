package github.javalearningclub.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle implements Shape{
	
    private Point location = null;
    private Color color = null;
    private int diameter = 0;
    
	public void drawCircle() {
		
				
}

	public void setLocation(Point location) {
		this.location = location;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
	}
}

