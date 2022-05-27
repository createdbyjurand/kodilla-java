package Modul_01_Programowanie_obiektowe.Sekcja_12_Interfejs.resources;

import static Shared.Display.display;

public interface ATM {

  public void deposit();

  public void payout();

  default void connection() {
    display("Method ATM.connection called");
  }

  static void end() {
    display("Method ATM.end called");
  }
}
