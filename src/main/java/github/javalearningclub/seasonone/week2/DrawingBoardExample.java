package github.javalearningclub.seasonone.week2;

import java.awt.Color;
import java.awt.Point;

import github.javalearningclub.drawing.Arc;
import github.javalearningclub.drawing.DrawingBoard;
import github.javalearningclub.drawing.Line;
import github.javalearningclub.drawing.Polygon;
import github.javalearningclub.drawing.Text;

public class DrawingBoardExample {

	private final DrawingBoard drawingBoard;

	public DrawingBoardExample() {
		drawingBoard = new DrawingBoard("Example", 640, 480);
	}

	public void start() {
		drawingBoard.start();
	}

	public void stop() {
		drawingBoard.stop();
	}

	public void doTextExample() {
		Point location = new Point(100, 350);
		Text text = new Text().setText("Joel is a Watermelon head").setColor(Color.GREEN).setLocation(location);
		drawingBoard.draw(text);
		for (int i = 0; i < 250; i++) {
			drawingBoard.sleep(15);
			location.x += 1;
			location.y -= 1;
		}
		drawingBoard.sleep(2000);
		drawingBoard.erase(text);
	}

	public void doOvalShape() {
		Arc arc = new Arc().setLocation(new Point(0, 0)).setColor(Color.GREEN).setWidth(325).setHeight(150)
				.setStartAngle(0).setArcAngle(360);

		drawingBoard.draw(arc);
		drawingBoard.sleep(5000);

	}

	public void doArcExample() {
		Point location = new Point(50, 250);
		Arc arc = new Arc().setLocation(location).setColor(Color.BLUE).setWidth(100).setHeight(200).setStartAngle(0)
				.setArcAngle(0);

		drawingBoard.draw(arc);
		for (int i = 1; i < 361; i++) {
			drawingBoard.sleep(30);
			location.x += 1;
			arc.setArcAngle(i);
		}
		drawingBoard.sleep(2000);
		drawingBoard.erase(arc);
	}

	public void doLineExample() {
		Point endPoint1 = new Point(10, 58);
		Point endPoint2 = new Point(10, 100);
		Line line = new Line().setColor(Color.RED).setEndPoint1(endPoint1).setEndPoint2(endPoint2);
		drawingBoard.draw(line);
		for (int i = 0; i < 250; i++) {
			drawingBoard.sleep(30);
			endPoint1.x += 1;
			endPoint1.y += 1;
			endPoint2.x += 2;
			endPoint2.y += 1;
		}
		drawingBoard.sleep(2000);
		drawingBoard.erase(line);
	}

	public void doPolygonExample() {
		Polygon polygon = new Polygon().setColor(Color.ORANGE).addVertex(new Point(100, 10))
				.addVertex(new Point(100, 110)).addVertex(new Point(110, 110)).addVertex(new Point(110, 120))
				.addVertex(new Point(395, 100)).addVertex(new Point(105, 55));
		drawingBoard.draw(polygon);
		for (int r = 0; r < 256; r++) {
			polygon.setColor(new Color(r, 100, 255 - r));
			drawingBoard.sleep(30);
		}
		drawingBoard.erase(polygon);
	}

	public static void main(String[] args) {
		DrawingBoardExample example = new DrawingBoardExample();
		example.start();
		example.doOvalShape();
		example.stop();
	}
}
