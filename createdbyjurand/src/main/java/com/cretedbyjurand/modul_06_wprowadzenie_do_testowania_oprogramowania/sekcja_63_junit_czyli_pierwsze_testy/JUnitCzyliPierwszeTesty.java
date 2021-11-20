package com.cretedbyjurand.modul_06_wprowadzenie_do_testowania_oprogramowania.sekcja_63_junit_czyli_pierwsze_testy;

import static com.createdbyjurand.shared.Display.displayComment;
import static com.createdbyjurand.shared.Display.displaySubSubtitle;
import static com.createdbyjurand.shared.Display.displaySubtitle;
import static com.createdbyjurand.shared.Display.displayTitle;

import com.createdbyjurand.shared.AnsiColor;

public class JUnitCzyliPierwszeTesty {

    public static void main(String[] args) throws Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("6.3. JUnit, czyli pierwsze testy!");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Organizacja testów według ISTQB (International Software Testing Qualifications Board)");

        /////////////////////////////////////////////////////////////////////////////////
        displayComment("SUT (System Under Test)");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Tworzenie testu przy pomocy JUnit");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Krok 1: Tworzenie zestawu testów - Test Suite");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Krok 2: tworzenie przypadku testowego — Test Case");

        /////////////////////////////////////////////////////////////////////////////////
        displayComment("Given-When-Then", AnsiColor.BLUE);

        /////////////////////////////////////////////////////////////////////////////////
        displayComment(
            "Given (pol. zakładając, że...) oznacza stan zastany, czyli jakąś sytuację \"wejściową\" przed rozpoczęciem wykonywania testu. W naszym poprzednim przykładzie będzie to stan, w którym dysponujemy obiektem klasy SimpleUser z zainicjowaną nazwą użytkownika."
        );

        /////////////////////////////////////////////////////////////////////////////////
        displayComment(
            "When (pol. kiedy...) oznacza operację lub zdarzenie, które chcemy przetestować. W naszym przykładzie będzie to odczytanie nazwy użytkownika przy pomocy gettera getUsername()."
        );

        /////////////////////////////////////////////////////////////////////////////////
        displayComment(
            "Then (pol. wtedy...) oznacza sekcję warunków, które są sprawdzane, aby móc stwierdzić czy test wykonał się poprawnie, czy też z błędem. W naszym przykładzie będzie to porównanie wartości zwróconej przez getter getUsername() z tekstem, który był użyty w konstruktorze obiektu klasu SimpleUser do zainicjowania nazwy użytkownika."
        );

        /////////////////////////////////////////////////////////////////////////////////
        displayComment("AAA", AnsiColor.BLUE);

        /////////////////////////////////////////////////////////////////////////////////
        displayComment("Arrange (pol. przygotuj, zaaranżuj) to po prostu stan zastany.");

        /////////////////////////////////////////////////////////////////////////////////
        displayComment("Act (pol. działaj), czyli wykonanie testowanej metody.");

        /////////////////////////////////////////////////////////////////////////////////
        displayComment(
            "Assert (pol. zapewnij) — tutaj wykonujemy asercje, czyli sprawdzamy warunki zapewniające nas, że testowana metoda działa poprawnie."
        );

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Klasa Assert");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Inne adnotacje JUnit");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Przykład użycia adnotacji");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Modyfikacja klasy SimpleUser");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Modyfikacja ForumTestSuite");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Wykonanie testów z adnotacjami");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Zadanie: Test klasy wybierającej parzyste liczby z kolekcji");
    }
}
