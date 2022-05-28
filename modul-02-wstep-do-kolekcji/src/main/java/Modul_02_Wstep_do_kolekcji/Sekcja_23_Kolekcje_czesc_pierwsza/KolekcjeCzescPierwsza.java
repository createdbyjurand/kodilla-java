package Modul_02_Wstep_do_kolekcji.Sekcja_23_Kolekcje_czesc_pierwsza;

import static com.createdbyjurand.shared.display.Display.displaySubtitle;
import static com.createdbyjurand.shared.display.Display.displayTitle;

public class KolekcjeCzescPierwsza {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("2.3. Kolekcje część pierwsza");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Skąd biorą się biblioteki i do czego służą?");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("java.util");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Podpinanie biblioteki");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Popularne biblioteki");

        // java.io, biblioteka służąca do realizowania zadań związanych z wymianą danych między innymi poprzez odczyt i zapis do pliku (io – skrót oznaczający Input/Output, wejście/wyjście)
        // java.net, biblioteka służąca do komunikowania się przez internet.
        // java.lang, podstawowa biblioteka języka Java; biblioteka ta nie musi być importowana do pisanych klas – jest domyślnie dołączana przez kompilator Javy do każdej klasy.
        // java.util, biblioteka zawierająca zestaw narzędzi do operowania na kolekcjach, datach czy kalendarzach.

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Czym jest kolekcja?");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Przykłady kolekcji");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Rodzaje kolekcji");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("java.util a kolekcje");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Interface Collection");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Pętla for-each");

        String[] names = { "Jurand, Paweł" };

        for (String name : names) {
            System.out.println(name);
        }

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("interfejs Iterable");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Interfejs Collection");
    }
}
