package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources;

import java.lang.*;

public class Car extends Vehicle {

  private String model;
  private String engine;
  private double engineCapacity;

  public Car() {
    System.out.println("Car object created");
  }

  public Car(double engineCapacity, String model, String year) {
    super(model, year);
    this.engineCapacity = engineCapacity;

    System.out.println("Car with parameters object created");
  }

  public void showGasolineLevel() {
    System.out.println("showGasolineLevel");
  }

  public void turnOnEngine() {
    System.out.println("turnOnEngine");
  }

  public void turnOffEngine() {
    System.out.println("turnOffEngine");
  }
}
