package github.javalearningclub.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle implements Shape{
	
    private Point location = null;
    private Color color = null;
    private int diameter = 0;
    
	public Circle setLocation(Point location) {
		this.location = location;
		return this;
	}

	public Circle setColor(Color color) {
		this.color = color;
		return this;
	}

	public Circle setDiameter(int diameter) {
		this.diameter = diameter;
		return this;
	}

	@Override
	public void draw(Graphics g) {
		if (location != null && diameter != 0) {
			if (color == null) {
				g.setColor(Color.BLACK);
			}else{
				g.setColor(color);
			}
			g.drawOval(location.x, location.y, diameter, diameter);
		}
	}
}

