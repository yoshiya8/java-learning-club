package edu.dolphin.towersofhanoi.model;

import java.awt.Color;

public interface Board {
	public Color getColor();

	public int getNumberOfPoles();

	public Pole getPole(int poleIndex);

	public void moveDisk(int fromPoleIndex, int toPoleIndex) throws TowerOfHanoiException;

}
