package Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources;

import static Shared.Display.display;

public class Mobile implements Telephone {

  public Mobile() {
    display("Object Mobile created");
  }

  public void sendMessageTo(String name) {
    System.out.println("Sending message to " + name);
  }

  public void callTo(String name) {
    System.out.println("Calling to " + name);
  }
}
