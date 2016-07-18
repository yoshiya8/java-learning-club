package edu.dolphin.towersofhanoi.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import edu.dolphin.towersofhanoi.model.Disk;
import github.javalearningclub.drawing.Shape;

public class DiskShape implements Shape {

	private final Disk disk;
	private final Rectangle boundingBox;
	private final Color color;

	public DiskShape(Disk disk, Rectangle boundingBox, Color color) {
		this.disk = disk;
		this.boundingBox = boundingBox;
		this.color = color;
		// Create each diskShape and add to diskShapes
	}

	@Override
	public void draw(Graphics g) {
		// Draw the disk
		// Draw the disks
	}

}
