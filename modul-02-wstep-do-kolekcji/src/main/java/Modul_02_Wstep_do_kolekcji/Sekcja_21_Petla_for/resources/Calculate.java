package Modul_02_Wstep_do_kolekcji.Sekcja_21_Petla_for.resources;

import static Shared.Display.display;

import Shared.Display.AnsiColor;

public class Calculate {

  public double meanValueOfTheArrayElements(int[] arr) {
    double result = 0;
    for (int i = 0; i < arr.length; i++) {
      result += arr[i];
      display("arr[" + i + "] = " + arr[i], AnsiColor.PURPLE);
    }
    display("result = " + result);
    result = result / arr.length;
    display("result / arr.length = " + result);
    return result;
  }
}
