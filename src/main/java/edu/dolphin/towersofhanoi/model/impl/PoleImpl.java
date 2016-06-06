package edu.dolphin.towersofhanoi.model.impl;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.dolphin.towersofhanoi.model.Disk;
import edu.dolphin.towersofhanoi.model.Pole;
import edu.dolphin.towersofhanoi.model.TowerOfHanoiException;

public class PoleImpl implements Pole {
	private final int height;
	private final List<Disk> disks;
	private final Color color;

	public PoleImpl(int height, Color color) {
		this.height = height;
		this.color = color;
		this.disks = new ArrayList<>();
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
		if (disks.size() >= height) {
			throw new TowerOfHanoiException("This pole is already full");
		}
		// Get the top disk
		if (!disks.isEmpty()) {
			Disk topDisk = disks.get(disks.size() - 1);
			if (disk.getSize() >= topDisk.getSize()) {
				// If there is a top disk and the disk we are adding is the same
				// size or bigger, then throw and exception
				throw new TowerOfHanoiException("You may not put a bigger disk on top of a smaller pole");
			}
		}
		disks.add(disk);
	}

	@Override
	public Disk removeDisk() {
		// TODO Auto-generated method stub
		if (disks.size() > 0) {
			return disks.remove(disks.size() - 1);
		} else {
			return null;
		}
	}

	@Override
	public List<Disk> getDisks() {

		return Collections.unmodifiableList(disks);
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