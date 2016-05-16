package edu.dolphin.towersofhanoi.model;

import java.awt.Color;
import java.util.List;

public interface Pole {
   public int getHeight();
   public Color getColor();
   public void addDisk(Disk disk) throws TowerOfHanoiException;
   public Disk removeDisk();
   public List<Disk> getDisks();
}
