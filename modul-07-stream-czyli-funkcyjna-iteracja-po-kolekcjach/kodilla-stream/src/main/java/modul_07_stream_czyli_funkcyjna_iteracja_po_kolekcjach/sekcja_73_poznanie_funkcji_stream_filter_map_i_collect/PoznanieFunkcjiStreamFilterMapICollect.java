package modul_07_stream_czyli_funkcyjna_iteracja_po_kolekcjach.sekcja_73_poznanie_funkcji_stream_filter_map_i_collect;

import static com.createdbyjurand.shared.display.Display.displayComment;
import static com.createdbyjurand.shared.display.Display.displayCommentWithLead;
import static com.createdbyjurand.shared.display.Display.displaySubtitle;
import static com.createdbyjurand.shared.display.Display.displayTitle;

public class PoznanieFunkcjiStreamFilterMapICollect {

    public static void main(String[] args) throws Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("7.3. Poznanie funkcji stream(), filter(), map() i collect()");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Stream w kolekcjach");

        displayComment("Przydatne skróty klawiaturowe");
        displayComment(
            "IntelliJ ma wiele przydatnych funkcji. Jedną z nich jest przypisanie często wykonywanych operacji do skrótów klawiaturowych. Poniżej kilka z nich:"
        );
        displayCommentWithLead(
            "Esc",
            " - przenosi kursor do okna z kodem z dowolnego innego okna IntelliJ (z wyjątkiem okna terminala)"
        );
        displayCommentWithLead("F12", " - przenosi kursor do ostatnio używanego okna narzędziowego");
        displayCommentWithLead(
            "Ctrl+/",
            " (dla macOS: cmd+/) - komentuje/odkomentowuje zaznaczony kod komentarzem //"
        );
        displayCommentWithLead(
            "Ctrl+Shift+/",
            " (dla macOS: cmd+Shift+/) - komentuje/odkomentowuje zaznaczony kod komentarzem /*...*/"
        );
        displayCommentWithLead(
            "Ctrl+w",
            " (dla macOS: cmd+w) - zaznacza cały wyraz, na którym stoi kursor w oknie z kodem. Ponowne naciśnięcia Ctrl+w rozszerzają zaznaczenie na otaczający tekst"
        );
        displayCommentWithLead(
            "Ctrl+Alt+i",
            " (dla macOS: cmd+Alt+i) - poprawia formatowanie zaznaczonego kodu"
        );
        displayCommentWithLead(
            "Shift+F6",
            " - pozwala na zmianę nazwy zmiennej, metody, klasy czy interfejsu w taki sposób, że zmieniane są również nazwy we wszystkich miejscach w kodzie, gdzie dana zmienna czy klasa była używana (tzw. name refactor)"
        );
        displayCommentWithLead(
            "Ctrl+n",
            " (dla macOS: cmd+n) - wyszukiwanie klas w plikach z kodem źródłowym na podstawie nazwy"
        );
        displayCommentWithLead(
            "Shift+Shift",
            " (dwa razy Shift) - otwiera wyszukiwarkę pozwalającą odszukiwać klasy, zmienne i obiekty na aktualnym projekcie"
        );
        displayCommentWithLead(
            "Ctrl+Shift+F10",
            " (dla macOS: cmd+Shift+F10) - kompilacja i uruchomienie programu - działa w oknie z kodem podczas przeglądania metod możliwych do uruchomienia (np. metody main(String[] args) lub metod oznaczonych adnotacją @Test)"
        );
        displayCommentWithLead("Alt+Insert", " - generowanie stałych części kodu (konstruktory, gettery itd.)");
        displayCommentWithLead(
            "Alt+Enter",
            " - automatyczne uzupełnianie importów oraz generowanie niektórych stałych fragmentów kodu (jak. na przykład kod testu dla klasy)"
        );
        displayCommentWithLead(
            "Ctrl+Space",
            " (dla macOS: cmd+Space) - podpowiada możliwe do wstawienia w danym miejscu kodu zmienne, obiekty, klasy i metody"
        );
        displayCommentWithLead(
            "Napisz sout i naciśnij Tab",
            " - spowoduje to wstawienie tekstu \"System.out.println()\" - przydatne, gdy często wyświetlasz coś na ekranie konsoli."
        );
    }
}
