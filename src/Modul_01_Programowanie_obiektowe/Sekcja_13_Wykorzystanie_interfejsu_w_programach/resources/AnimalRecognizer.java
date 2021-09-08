package Modul_01_Programowanie_obiektowe.Sekcja_13_Wykorzystanie_interfejsu_w_programach.resources;

public class AnimalRecognizer {

  public String recognize(Animal animal) {
    return "I am sure that this is: " + animal.name() + " and it sounds like: " + animal.voice();
  }
}
