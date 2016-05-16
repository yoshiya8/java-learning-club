package edu.dolphin.towersofhanoi.model.impl;

import java.awt.Color;

import edu.dolphin.towersofhanoi.model.Disk;

public class DiskImpl implements Disk{
	
	private final int size;
	private final Color color;
	
	public DiskImpl(int size, Color color) {
		this.size = size;
		this.color = color;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + size;
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
		DiskImpl other = (DiskImpl) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
	
}
