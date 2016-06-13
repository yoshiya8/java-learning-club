package edu.dolphin.towersofhanoi.model.impl;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import edu.dolphin.towersofhanoi.model.Board;
import edu.dolphin.towersofhanoi.model.Disk;
import edu.dolphin.towersofhanoi.model.Pole;

public class BoardImpl implements Board {

	private final Color color;

	private final List<Pole> poles = new ArrayList<>();

	public BoardImpl(int numberOfDisks, Color color, int numberOfPoles) {
		this.color = color;
		for (int poleIx = 0; poleIx < numberOfPoles; poleIx++) {
			Pole pole = new PoleImpl(numberOfDisks, color);
			poles.add(pole);
			if (poleIx == 0) {
				for (int diskSize = numberOfDisks; diskSize > 0; diskSize--){
				Disk disk = new DiskImpl(diskSize, Color.RED);
				pole.addDisk(disk);
				}
			}
		}
	}

	@Override
	public int getNumberOfPoles() {
		// TODO Auto-generated method stub
		numberOf
		return numberOfPoles;

	}

	@Override
	public Pole getPole(int poleIndex) {
		return poles.get(poleIndex);

	}

	@Override
	public void moveDisk(int fromPoleIndex, int toPoleIndex) {
		// TODO Auto-generated method stub

	}
}
