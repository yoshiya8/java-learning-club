package github.javalearningclub.drawing;

import java.awt.Color;
import java.awt.Point;

/**
 * An example, because Joel and Nathan cannot understand the obvious.
 * 
 * @author Joshua A. Haftel
 */
public class DrawingBoardExample {
	public static void main(String[] args) throws InterruptedException {
		DrawingBoard drawingBoard = new DrawingBoard("Example", 640, 480);
		drawingBoard.start();
		Circle circle = new Circle();
		Point circleCenter = new Point(0, 240);
		circle.setLocation(circleCenter);
		circle.setColor(Color.PINK);
		circle.setDiameter(100);
		
		drawingBoard.draw(circle);
		for (int i = 0; i< 640; i++) {
			circleCenter.x += 1;
			Thread.sleep(25);
		}
		Thread.sleep(3000);
		drawingBoard.stop();

	}
}
