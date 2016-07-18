package edu.dolphin.towersofhanoi.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import edu.dolphin.towersofhanoi.model.Board;
import github.javalearningclub.drawing.Shape;

public class BoardShape implements Shape {

	private final Board board;
	private final Rectangle boundingBox;
	private final Color color;
	private final List<PoleShape> poleShapes = new ArrayList<>();
	
	public BoardShape(Board board, Rectangle boundingBox, Color color) {
		this.board = board;
		this.boundingBox = boundingBox;
		this.color = color;
		// Create and Save PoleShape for each pole.
	}

	@Override
	public void draw(Graphics g) {
		// Draw base
		// Tell each pole in poleShapes to draw itself.
	}

}
