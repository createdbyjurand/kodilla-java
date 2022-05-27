package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources;

import java.lang.*;

public class Cat {

  public Cat() {
    System.out.println("Cat object created");
  }

  private String name;
  private String color;
  private double weight;

  public void jumpOnTable() {
    System.out.println("jumpOnTable");
  }

  public void runOnSand() {
    System.out.println("runOnSand");
  }
}
