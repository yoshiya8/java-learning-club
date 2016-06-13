package edu.dolphin.towersofhanoi.model.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import edu.dolphin.towersofhanoi.model.Board;
import edu.dolphin.towersofhanoi.model.Disk;
import edu.dolphin.towersofhanoi.model.Pole;

public class BoardTest {

	@Test
	public void testStandardBoard() {
		// TODO: Create a board with 3 poles and height of 5.
		Board board = new BoardImpl();
		assertEquals(3, board.getNumberOfPoles());
		assertEquals(5, board.getPole(0).getHeight());
		assertEquals(5, board.getPole(1).getHeight());
		assertEquals(5, board.getPole(2).getHeight());
		assertEquals(5, board.getPole(0).getDisks().size());
		assertEquals(0, board.getPole(1).getDisks().size());
		assertEquals(0, board.getPole(2).getDisks().size());
	}

	private Disk getTopDisk(Pole pole) {
		List<Disk> disks = pole.getDisks();
		Disk topDisk = null;
		if (!disks.isEmpty()) {
			topDisk = disks.get(disks.size() - 1);
		}
		return topDisk;
	}

	private void testMove(Board board, int poleIx1, int poleIx2) {
		Pole pole1 = board.getPole(poleIx1);
		Pole pole2 = board.getPole(poleIx2);

		int pole1StartSize = pole1.getDisks().size();
		Disk topDisk = getTopDisk(pole2);
		board.moveDisk(poleIx1, poleIx2);
		assertEquals(topDisk, getTopDisk(pole2));
	}

	@Test
	public void testMovingDisks() {
		// TODO: Create a board with 3 poles and height of 5.
		Board board = new BoardImpl();
		board.moveDisk(0, 1);
		assertEquals(4, board.getPole(0).getDisks().size());
		assertEquals(1, board.getPole(1).getDisks().size());
		assertEquals(0, board.getPole(2).getDisks().size());
		board.moveDisk(0, 2);
		assertEquals(3, board.getPole(0).getDisks().size());
		assertEquals(1, board.getPole(1).getDisks().size());
		assertEquals(1, board.getPole(2).getDisks().size());
		board.moveDisk(1, 3);
		assertEquals(3, board.getPole(0).getDisks().size());
		assertEquals(0, board.getPole(1).getDisks().size());
		assertEquals(2, board.getPole(2).getDisks().size());

		// DO the move
		// Get top disk for pole1
		Disk topDisk; // write this
		assertEquals(topDisk, topDisk1);

	}
}
