package Modul_02_Wstep_do_kolekcji.Sekcja_21_Petla_for;

import static Shared.Display.display;
import static Shared.Display.displaySubtitle;
import static Shared.Display.displayTitle;

import Modul_02_Wstep_do_kolekcji.Sekcja_21_Petla_for.resources.Calculate;

public class PetlaFor {

  public static void main(String[] args) throws java.lang.Exception {

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("2. Wstęp do kolekcji");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Wyzwania:");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("2.1. Pętla for");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Co to jest pętla?");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Pętla for");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Wykorzystanie pętli for");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Ilość wykonań pętli a długość tablicy");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Nieskończona pętla");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Pętla w pętli");

    for (int i = 0; i < 10; i++) {
      for (int n = 0; n < 5; n++) {
        // loop_body
      }
    }

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie: Obliczamy średnią");

    int length = (int) Math.round(Math.random() * 10);
    display("length = " + length);

    int[] arr = new int[length];

    for (int i = 0; i < length; i++) {
      arr[i] = (int) Math.round(Math.random() * 100);
      display("arr[" + i + "] = " + arr[i]);
    }

    Calculate calculate = new Calculate();
    calculate.meanValueOfTheArrayElements(arr);

  }
}
