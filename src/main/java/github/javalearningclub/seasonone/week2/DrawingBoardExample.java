package github.javalearningclub.seasonone.week2;

import java.awt.Color;
import java.awt.Point;

import github.javalearningclub.drawing.Arc;
import github.javalearningclub.drawing.DrawingBoard;
import github.javalearningclub.drawing.Line;
import github.javalearningclub.drawing.Text;

public class DrawingBoardExample {
	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard("Test Drawing Board", 500, 300);
		board.start();
		Point point1 = new Point(10, 58);
		Point point2 = new Point(10, 100);
		Line line = new Line().setColor(Color.RED).setEndPoint1(point1).setEndPoint2(point2);
		board.draw(line);
		Point point3 = new Point(200, 250);
		board.draw(new Text().setColor(Color.GREEN).setLocation(point3).setText("JOEL is Awesome!"));
		Arc arc = new Arc().setColor(Color.BLUE).setLocation(new Point(250, 150)).setWidth(75).setHeight(100);
		board.draw(arc);
		for (int i = 0; i < 250; i++) {
			point1.x += 1;
			point1.y += 1;
			point2.x += 2;
			point2.y += 1;
			point3.x += 1;
			point3.y -= 1;
			arc.setArcAngle(i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		board.stop();
	}
}
