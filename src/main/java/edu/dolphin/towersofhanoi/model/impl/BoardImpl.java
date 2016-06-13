package edu.dolphin.towersofhanoi.model.impl;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import edu.dolphin.towersofhanoi.model.Board;
import edu.dolphin.towersofhanoi.model.Disk;
import edu.dolphin.towersofhanoi.model.Pole;
import edu.dolphin.towersofhanoi.model.TowerOfHanoiException;

public class BoardImpl implements Board {
	private static final Color[] DISK_COLORS = { Color.PINK, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.BLUE, new Color(255, 0, 255), Color.BLACK, Color.CYAN, Color.GRAY, Color.MAGENTA };

	private final Color color;

	private final List<Pole> poles = new ArrayList<>();

	public BoardImpl(int numberOfDisks, Color color, int numberOfPoles) throws TowerOfHanoiException {
		this.color = color;
		for (int poleIx = 0; poleIx < numberOfPoles; poleIx++) {
			Pole pole = new PoleImpl(numberOfDisks, color);
			poles.add(pole);
			if (poleIx == 0) {
				for (int diskSize = numberOfDisks; diskSize > 0; diskSize--) {
					Disk disk = new DiskImpl(diskSize, DISK_COLORS[diskSize % DISK_COLORS.length]);
					pole.addDisk(disk);
				}
			}
		}
	}

	@Override
	public int getNumberOfPoles() {
		return poles.size();

	}

	@Override
	public Pole getPole(int poleIndex) {
		return poles.get(poleIndex);

	}

	@Override
	public void moveDisk(int fromPoleIndex, int toPoleIndex) throws TowerOfHanoiException {
		Pole fromPole = getPole(fromPoleIndex);
		Pole toPole = getPole(toPoleIndex);
		Disk diskToMove = fromPole.removeDisk();
		if (diskToMove == null) {
			throw new TowerOfHanoiException("Pole[" + fromPoleIndex + "] is empty.");
		}
		try {
		    toPole.addDisk(diskToMove);
		} catch(TowerOfHanoiException e) {
			fromPole.addDisk(diskToMove);
			throw e;
		}

	}

	@Override
	public Color getColor() {
		return color;
	}
}
