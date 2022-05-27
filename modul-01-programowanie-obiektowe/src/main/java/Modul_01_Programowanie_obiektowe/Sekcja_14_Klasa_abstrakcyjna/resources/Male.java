package Modul_01_Programowanie_obiektowe.Sekcja_14_Klasa_abstrakcyjna.resources;

public class Male extends Person {

  public Male(String name) {
    super(name);
  }

  public void voice() {
    System.out.println("Hey there!");
  }
}
