package edu.dolphin.towersofhanoi.model.impl;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import edu.dolphin.towersofhanoi.model.Disk;

public class DiskTest {

	@Test
	public void testSmallRedDisk() {
		Disk disk = new DiskImpl(1, Color.red);
		assertEquals(1, disk.getSize());
		assertEquals(Color.red, disk.getColor());
	}
	
	@Test
	public void testLargeOrangeDisk() {
		Disk disk = new DiskImpl(10, Color.orange);
		assertEquals(10, disk.getSize());
		assertEquals(Color.orange, disk.getColor());
	}
	
	@Test
	public void testMediumPinkDisk() {
		Disk disk = new DiskImpl(5, Color.pink);
		assertEquals(5, disk.getSize());
		assertEquals(Color.pink, disk.getColor());
	}

}
