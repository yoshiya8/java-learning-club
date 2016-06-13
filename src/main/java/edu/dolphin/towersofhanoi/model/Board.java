package edu.dolphin.towersofhanoi.model;

public interface Board {
   public int getNumberOfPoles();
   public Pole getPole(int poleIndex);
   public void moveDisk(int fromPoleIndex, int toPoleIndex);
  
}
