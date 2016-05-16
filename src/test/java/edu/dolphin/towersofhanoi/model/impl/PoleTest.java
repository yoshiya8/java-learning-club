package edu.dolphin.towersofhanoi.model.impl;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.dolphin.towersofhanoi.model.Disk;
import edu.dolphin.towersofhanoi.model.Pole;
import edu.dolphin.towersofhanoi.model.TowerOfHanoiException;
import edu.dolphin.towersofhanoi.model.impl.PoleImpl;

public class PoleTest {

	@Test
	public void testConstructor() {
		Pole pole = new PoleImpl(3, Color.RED);
		assertEquals(3, pole.getHeight());
		assertEquals(0, pole.getDisks().size());
		assertEquals(Color.RED, pole.getColor());
	}

	@Test
	void testAddDiskNormal() {
		int height = 10;
		List<Disk> diskList = new ArrayList<>();
		Pole pole = new PoleImpl(height, Color.RED);
		for (int i = height; i > 0; i--) {
			Disk disk = new DiskImpl(i, Color.GREEN);
			diskList.add(disk);
			pole.addDisk(disk);
			assertEquals(diskList, pole.getDisks());
		}
	}

	@Test(expected = TowerOfHanoiException.class)
	void testAddTooMany() {
		int height = 10;
		Pole pole = new PoleImpl(height, Color.RED);
		for (int i = height + 2; i > 0; i--) {
			Disk disk = new DiskImpl(i, Color.GREEN);
			pole.addDisk(disk);
		}
	}

	@Test(expected = TowerOfHanoiException.class)
	void testAddOutOfOrder() {
		int height = 10;
		Pole pole = new PoleImpl(height, Color.RED);
		for (int i = 1; i <= height; i++) {
			Disk disk = new DiskImpl(i, Color.GREEN);
			pole.addDisk(disk);
		}
	}

}
