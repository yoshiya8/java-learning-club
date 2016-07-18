package edu.dolphin.towersofhanoi.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import edu.dolphin.towersofhanoi.model.Pole;
import github.javalearningclub.drawing.Shape;

public class PoleShape implements Shape {

	private final Pole pole;
	private final Rectangle boundingBox;
	private final Color color;
	private final List<DiskShape> diskShapes = new ArrayList<>();

	public PoleShape(Pole pole, Rectangle boundingBox, Color color) {
		this.pole = pole;
		this.boundingBox = boundingBox;
		this.color = color;
		// Create each diskShape and add to diskShapes
	}

	@Override
	public void draw(Graphics g) {
		// Draw the pole
		// Draw the disks
	}

}
