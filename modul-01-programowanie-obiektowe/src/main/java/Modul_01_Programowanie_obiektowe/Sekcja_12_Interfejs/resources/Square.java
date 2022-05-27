package Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources;

import static Shared.Display.display;

public class Square implements Shape {

  public Square() {
    display("Object Square created");
  }

  public void draw() {
    System.out.println("I am drawing a Square!");
  }
}
