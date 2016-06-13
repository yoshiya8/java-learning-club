package edu.dolphin.towersofhanoi.model.impl;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.List;

import org.junit.Test;

import edu.dolphin.towersofhanoi.model.Board;
import edu.dolphin.towersofhanoi.model.Disk;
import edu.dolphin.towersofhanoi.model.Pole;
import edu.dolphin.towersofhanoi.model.TowerOfHanoiException;

public class BoardTest {

	@Test
	public void testStandardBoard() throws TowerOfHanoiException {
		Board board = new BoardImpl(5, Color.BLACK, 3);
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

	private void testMove(Board board, int fromPoleIx, int toPoleIx) throws TowerOfHanoiException {
		Pole fromPole = board.getPole(fromPoleIx);
		Pole toPole = board.getPole(toPoleIx);

		int numberOfDisksOnFromPole = fromPole.getDisks().size();
		int numberOfDisksOnToPole = toPole.getDisks().size();
		Disk diskOnTopOfFromPole = getTopDisk(fromPole);

		board.moveDisk(fromPoleIx, toPoleIx);
		assertEquals(numberOfDisksOnFromPole - 1, fromPole.getDisks().size());
		assertEquals(numberOfDisksOnToPole + 1, toPole.getDisks().size());

		List<Disk> disksOnToPole = toPole.getDisks();
		assertEquals(diskOnTopOfFromPole, disksOnToPole.get(disksOnToPole.size() - 1));
	}

	@Test
	public void testMovingDisks() throws TowerOfHanoiException {
		Board board = new BoardImpl(5, Color.BLUE, 3);
		testMove(board, 0, 1);
		testMove(board, 0, 2);
		testMove(board, 1, 2);
	}

	@Test(expected = TowerOfHanoiException.class)
	public void testMovingFromEmptyPeg() throws TowerOfHanoiException {
		Board board = new BoardImpl(5, Color.BLUE, 3);
		testMove(board, 1, 2);
	}
	
	@Test(expected = TowerOfHanoiException.class)
	public void testMovingOntoSmallerDisk() throws TowerOfHanoiException {
		Board board = new BoardImpl(5, Color.BLUE, 3);
		testMove(board, 0, 1);
		testMove(board, 0, 2);
		testMove(board, 0, 2);
	}

}
