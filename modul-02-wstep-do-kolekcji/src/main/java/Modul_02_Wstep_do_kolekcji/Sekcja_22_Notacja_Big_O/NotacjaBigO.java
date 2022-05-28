package Modul_02_Wstep_do_kolekcji.Sekcja_22_Notacja_Big_O;

import static com.createdbyjurand.shared.display.Display.display;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import com.createdbyjurand.shared.ansi_color.AnsiColor;

public class NotacjaBigO {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("2.2. Notacja Big-O");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Co to jest notacja Big-O?");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Do czego służy?");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Jak się ją wylicza?");

        display(
            "Spotykane w praktyce złożoności obliczeniowe algorytmów, ułożone w kolejności od najlepszej (najszybszy algorytm) do najsłabszej (najwolniejszy algorytm) przedstawiono poniżej:"
        );
        display(
            "O(c) " + AnsiColor.RESET + "- złożoność stała, niezależna od ilości danych wejściowych",
            AnsiColor.GREEN
        );
        display(
            "O(log n) " +
            AnsiColor.RESET +
            "- złożoność logarytmiczna, spotykana na przykład przy przeszukiwaniu uporządkowanych drzew binarnych",
            AnsiColor.GREEN
        );
        display("O(n) " + AnsiColor.RESET + "- złożoność liniowa", AnsiColor.GREEN);
        display("O(n ^ 2) " + AnsiColor.RESET + "- złożoność kwadratowa", AnsiColor.GREEN);
        display("O(c ^ n) " + AnsiColor.RESET + "- złożoność wykładnicza", AnsiColor.GREEN);
    }
}
