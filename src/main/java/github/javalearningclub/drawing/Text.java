package github.javalearningclub.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/** Used to display text on the {@link DrawingBoard} */
public class Text implements Shape {
	private Point location = null;
	private Color color = null;
	private String text = null;

	@Override
	public void draw(Graphics g) {
		if ((text != null) && (location != null)) {
			g.setColor((color != null) ? color : Color.BLACK);
			g.drawString(text, location.x, location.y);
		}
	}

	/**
	 * Set the color of the text
	 * 
	 * @param color
	 *            the color of the text
	 * @return This object for the fluent pattern
	 */
	public Text setColor(Color color) {
		this.color = color;
		return this;
	}

	/**
	 * Set the location of the text
	 * 
	 * @param location
	 *            the location of the text
	 * @return This object for the fluent pattern
	 */
	public Text setLocation(Point location) {
		this.location = location;
		return this;
	}

	/**
	 * Set the text content
	 * 
	 * @param text
	 *            the text content
	 * @return This object for the fluent pattern
	 */
	public Text setText(String text) {
		this.text = text;
		return this;
	}

}
