package modul_06_wprowadzenie_do_testowania_oprogramowania.sekcja_64_pisanie_testow_za_pomoca_junit;

import static com.createdbyjurand.shared.display.Display.display;
import static com.createdbyjurand.shared.display.Display.displayComment;
import static com.createdbyjurand.shared.display.Display.displaySubComment;
import static com.createdbyjurand.shared.display.Display.displaySubSubComment;
import static com.createdbyjurand.shared.display.Display.displaySubSubtitle;
import static com.createdbyjurand.shared.display.Display.displaySubtitle;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import com.createdbyjurand.shared.ansi_color.AnsiColor;
import com.kodilla.testing.forum.ForumUser;

public class PisanieTestowZaPomocaJUnit {

    public static void main(String[] args) throws Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("6.4. Pisanie testów za pomocą JUnit");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Zdefiniowanie zadania dla klasy");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Przygotowanie środowiska");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Rzutowanie typów w Javie");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Rzutowanie typów prymitywnych");

        displayComment("int zmiennaInt = 10;");
        displayComment("double zmiennaDouble;");
        displayComment("zmiennaDouble = (double) zmiennaInt;");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Rzutowanie typów obiektowych");

        displayComment("@Override");
        displayComment("public boolean equals (Object o){");
        displayComment("    ...");
        displayComment("    ForumPost forumPost = (ForumPost) o;");
        displayComment("    if (forumPost.getAuthor().equals(\"Jan Kowalski\")) {");
        displayComment("        ...");
        displayComment("    }");
        displayComment("    ...");
        displayComment("}");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Sprawdzenie typu obiektu");

        displayComment("boolean result = o instanceof ForumPost;");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Stworzenie klas ForumPost oraz ForumComment");

        displayComment(
                "Aby skorzystać z automatycznego generowania kodu przez IntelliJ, ustaw kursor w edytorze kodu w miejscu, w którym chcesz wstawić wygenerowany fragment kodu, a następnie naciśnij na klawiaturze kombinację przycisków Alt+Insert"
        );

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Klasa ForumPost");

        displayComment("Typ Class", AnsiColor.BLUE);

        ForumUser forumUser = new ForumUser("Name", "Real Name");

        System.out.println(forumUser.getClass());
        displayComment("System.out.println(forumUser.getClass());");
        displayComment("class com.kodilla.testing.forum.ForumUser");

        System.out.println(ForumUser.class);
        displayComment("System.out.println(ForumUser.class);");
        displayComment("class com.kodilla.testing.forum.ForumUser");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Klasa ForumComment");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Stworzenie szkieletu klasy ForumUser");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Piszemy testy z wykorzystaniem JUnit");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Szkielet testów");

        /////////////////////////////////////////////////////////////////////////////////
        display("ążśźęćółńĄŻŚŹĘĆÓŁŃ", AnsiColor.RED);

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Testy dla klasy ForumUser");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Uruchomienie testów");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Implementacja metod klasy ForumUser");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubSubtitle("Psucie testów :)");

        displayComment("Wskazówka praktyczna — statyczny import bibliotek", AnsiColor.BLUE);
        displayComment(
                "Klasa Assert stanowi część biblioteki JUnit. Dostęp do tej klasy w kodzie możliwy jest dzięki temu, że na początku kodu, w sekcji z importami, obecny jest wpis:"
        );
        displayComment("import org.junit.*;");
        displayComment(
                "Można jednak zaimportować bibliotekę JUnit nieco inaczej, przy pomocy tak zwanego importu statycznego:"
        );
        displayComment("import static org.junit.*;");
        displayComment(
                "Dzięki temu można odwoływać się do wszystkich statycznych metod klas dostępnych wewnątrz biblioteki JUnit bez podawania nazwy klasy"
        );

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Zadanie: kolekcjonujemy figury (i testujemy to!)");

        displayComment(
                "Celem zadania jest przetestowanie klasy, którą musisz napisać, o nazwie — powiedzmy — ShapeCollector, przy następujących założeniach:",
                AnsiColor.BLUE
        );

        displaySubComment(
                "Klasa ta przechowuje figury geometryczne w kolekcji ArrayList. Figury są następujące: kwadrat, koło, trójkąt (oczywiście użyj angielskich nazw klas).",
                '⚫'
        );
        displaySubComment(
                "Wszystkie figury implementują interfejs Shape, który musisz przygotować. Zawiera on dwie metody:",
                '⚫'
        );
        displaySubSubComment("jedna zwraca nazwę figury (\"square\", \"triangle\" oraz \"circle\"),", '○');
        displaySubSubComment("a druga zwraca obliczone pole powierzchni tej figury.", '○');
        displaySubComment("Klasy figur implementują interfejs Shape.", '⚫');
        displaySubComment("Klasa ShapeCollector ma trzy metody:", '⚫');
        displaySubSubComment("jedną dodającą figurę do kolekcji,", '○');
        displaySubSubComment("drugą usuwającą figurę z kolekcji,", '○');
        displaySubSubComment("trzecią pobierającą z kolekcji figurę z pozycji n listy.", '○');

        displayComment("Aby przygotować rozwiązanie zadania:", AnsiColor.BLUE);

        displayComment("1.  W katalogu src/main/java utwórz pakiet com.kodilla.testing.shape.");
        displayComment(
                "2.  W stworzonym pakiecie utwórz interfejs Shape, zawierający dwie metody: getShapeName() oraz getField()."
        );
        displayComment(
                "3.  Utwórz klasy reprezentujące poszczególne figury — posiadające już właściwe implementacje metod interfejsu."
        );
        displayComment(
                "4.  Utwórz klasę ShapeCollector z metodami: addFigure(Shape shape), removeFigure(Shape shape), getFigure(int n) oraz showFigures()."
        );
        displayComment("5.  W katalogu src/test/java utwórz pakiet com.kodilla.testing.shape.");
        displayComment("6.  Stwórz w tym pakiecie klasę testową (zbiór testów) ShapeCollectorTestSuite.");
        displayComment("7.  Napisz testy sprawdzające metody klasy ShapeCollector.");
    }
}
