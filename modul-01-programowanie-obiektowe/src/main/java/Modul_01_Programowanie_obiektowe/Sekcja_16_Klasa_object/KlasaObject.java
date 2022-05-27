package Modul_01_Programowanie_obiektowe.Sekcja_16_Klasa_object;

import static Shared.Display.display;
import static Shared.Display.displaySubtitle;
import static Shared.Display.displayTitle;

import Modul_01_Programowanie_obiektowe.Sekcja_16_Klasa_object.resources.JClass;

public class KlasaObject {

  public static void main(String[] args) throws java.lang.Exception {

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("1.6. Klasa Object");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie: Użycie metody hashCode()");

    JClass jClass = new JClass();
    display("jClass.hashCode(): " + jClass.hashCode());
  }
}
