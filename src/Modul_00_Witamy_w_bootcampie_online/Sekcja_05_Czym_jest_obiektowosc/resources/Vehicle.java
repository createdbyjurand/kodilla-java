package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources;

import java.lang.*;

public class Vehicle {

  private int doors;
  private int speed;
  private String color;
  private String model;
  private String year;

  public Vehicle() {
    System.out.println("Vehicle object created");
  }

  public Vehicle(String model, String year) {
    System.out.println("Vehicle with parameters object created");
    this.model = model;
    this.year = year;
  }

  public void run() {
    // Run method implementation.
  }

  public String getModel() {
    return this.model;
  }

  public String getYear() {
    return this.year;
  }
}
