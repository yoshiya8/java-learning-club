package edu.dolphin.towersofhanoi.model.impl;

import java.awt.Color;
import java.util.List;

import edu.dolphin.towersofhanoi.model.Disk;
import edu.dolphin.towersofhanoi.model.Pole;
import edu.dolphin.towersofhanoi.model.TowerOfHanoiException;

public class PoleImpl implements Pole {
	private final int height;
	private final Color color;
	public PoleImpl(int height, Color color) {
	this.height = height;
	this.color = color;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		
		return height;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void addDisk(Disk disk) throws TowerOfHanoiException {
		// TODO Auto-generated method stub

	}

	@Override
	public Disk removeDisk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Disk> getDisks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + height;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoleImpl other = (PoleImpl) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (height != other.height)
			return false;
		return true;
	}

}