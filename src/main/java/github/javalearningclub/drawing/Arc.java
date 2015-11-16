package github.javalearningclub.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/** Used to draw an arc on the {@link DrawingBoard} */
public class Arc implements Shape {
	private Color color = null;
	private Point location = null;
	private int width = 0;
	private int height = 0;
	private int startAngle = 0;
	private int arcAngle = 0;

	@Override
	public void draw(Graphics g) {
		if ((location != null) && ((height > 0) || (width > 0)) && (arcAngle > 0)) {
			g.setColor((color != null) ? color : Color.BLACK);
			g.drawArc(location.x, location.y, width, height, startAngle, arcAngle);
		}
	}

	/**
	 * Set the color of the arc
	 * 
	 * @param color
	 *            The color of the arc
	 * @return This arc for the fluent pattern
	 */
	public Arc setColor(Color color) {
		this.color = color;
		return this;
	}

	/**
	 * Set the top-left corner of the rectangle containing the arc.
	 * 
	 * @param location
	 *            the top-left corner
	 * @return This arc for the fluent pattern
	 */
	public Arc setLocation(Point location) {
		this.location = location;
		return this;
	}

	/**
	 * Set the width of the rectangle containing the arc.
	 * 
	 * @param width
	 *            The width
	 * @return This arc for the fluent pattern
	 */
	public Arc setWidth(int width) {
		this.width = width;
		return this;
	}

	/**
	 * Set the height of the rectangle containing the arc.
	 * 
	 * @param height
	 *            The height
	 * @return This arc for the fluent pattern
	 */
	public Arc setHeight(int height) {
		this.height = height;
		return this;
	}

	/**
	 * Set the starting point of the arc
	 * 
	 * @param startAngle
	 *            indicates the starting point in degrees:
	 *            <ul>
	 *            <li>0 degrees - the three o'clock location.</li>
	 *            <li>90 degrees - the twelve o'clock location.</li>
	 *            <li>180 degrees - the nine o'clock location.</li>
	 *            <li>270 degrees - the six o'clock location.</li>
	 *            </ul>
	 * @return This arc for the fluent pattern
	 */
	public Arc setStartAngle(int startAngle) {
		this.startAngle = startAngle;
		return this;
	}

	/**
	 * Set the length of the arc
	 * 
	 * @param arcAngle
	 *            the length of the arc in degrees - this extends in the
	 *            clockwise direction.
	 * @return This arc for the fluent pattern
	 */
	public Arc setArcAngle(int arcAngle) {
		this.arcAngle = arcAngle;
		return this;
	}

}
