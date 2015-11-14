package github.javalearningclub.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/** Used to display a polygon on the {@link DrawingBoard} */
public class Polygon extends ArrayList<Point> implements Shape {

	private static final long serialVersionUID = -6760663821240789260L;
	private Color color = null;

	@Override
	public void draw(Graphics g) {
		if (size() > 1) {
			Point first = get(0);
			Point prev = null;
			g.setColor((color != null) ? color : Color.BLACK);
			for (int ix = 0; ix < size(); ix++) {
				Point current = get(ix);
				if (prev != null) {
					g.drawLine(prev.x, prev.y, current.x, current.y);
				}
				prev = current;
			}
			if (size() > 2) {
				g.drawLine(prev.x, prev.y, first.x, first.y);
			}
		}
	}

	/**
	 * Add a vertex to the polygon
	 * 
	 * @param point
	 *            the vertex to add.
	 * @return This polygon for the fluent pattern.
	 */
	public Polygon addVertex(Point point) {
		add(point);
		return this;
	}

	/**
	 * Set the color of the polygon
	 * 
	 * @param color
	 *            the color of the polygon
	 * @return This object for the fluent pattern
	 */
	public Polygon setColor(Color color) {
		this.color = color;
		return this;
	}

}
