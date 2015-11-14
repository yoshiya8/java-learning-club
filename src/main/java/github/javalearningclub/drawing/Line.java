package github.javalearningclub.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/** Used to display a line on the {@link DrawingBoard} */
public class Line implements Shape {

	private Color color = null;
	private Point endPoint1 = null;
	private Point endPoint2 = null;

	/**
	 * Set the color of the line
	 * 
	 * @param color
	 *            the color of the line
	 * @return This line for the fluent pattern
	 */
	public Line setColor(Color color) {
		this.color = color;
		return this;
	}

	/**
	 * Set the first end point of the line
	 * 
	 * @param endPoint
	 *            The end point
	 * @return This line for the fluent pattern
	 */
	public Line setEndPoint1(Point endPoint) {
		this.endPoint1 = endPoint;
		return this;
	}

	/**
	 * Set the second end point of the line
	 * 
	 * @param endPoint
	 *            The end point
	 * @return This line for the fluent pattern
	 */
	public Line setEndPoint2(Point endPoint) {
		this.endPoint2 = endPoint;
		return this;
	}

	@Override
	public void draw(Graphics g) {
		if ((endPoint1 != null) && (endPoint2 != null)) {
			g.setColor((color != null) ? color : Color.BLACK);
			g.drawLine(endPoint1.x, endPoint1.y, endPoint2.x, endPoint2.y);
		}
	}
}
