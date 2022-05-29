package Modul_03_Kolekcje_czesc_druga.Sekcja_35_Uzupelnienie_pomiary_w_kolekcjach;

import static com.createdbyjurand.shared.display.Display.display;
import static com.createdbyjurand.shared.display.Display.displayComment;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import Modul_03_Kolekcje_czesc_druga.Sekcja_35_Uzupelnienie_pomiary_w_kolekcjach.resources.Book;
import com.createdbyjurand.shared.ansi_color.AnsiColor;
import com.createdbyjurand.shared.generate.Generate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class UzupelnieniePomiaryWKolekcjach {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("3.5. Uzupełnienie - pomiary w kolekcjach", AnsiColor.RED);

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Podsumowanie pomiarów w kolekcjach");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie: Pomiar szybkości LinkedList oraz HashMap");

        displayTitle("Część 1", AnsiColor.BLUE);
        displayComment(
            "Stwórz klasę reprezentującą książkę o nazwie Book. Klasa powinna mieć dwa pola: author oraz title. Pamiętaj o implementacji metod hashCode() oraz equals(Object o). Będziemy jej używali jako obiektów kolekcji LinkedList w tej części zadania, oraz jako obiektów kolekcji HashMap w drugiej części zadania."
        );
        displayComment(
            "Stwórz program, który zmierzy czas operacji wyszukiwania i usunięcia obiektu na początku (z użyciem metody remove(Object o)), wyszukiwania i usunięcia obiektu na końcu (z użyciem metody remove(Object o)), wstawiania na początku oraz wstawiania na końcu listy LinkedList liczącej kilka milionów obiektów."
        );

        List<Book> linkedList = new LinkedList<Book>();

        Book book = new Book(Generate.sequence(4, 16, 3), Generate.sequence(4, 8, 2));
        display("book.getAuthor() = " + AnsiColor.BLUE + book.getAuthor(), AnsiColor.RESET);
        display("book.getTitle() = " + AnsiColor.BLUE + book.getTitle(), AnsiColor.RESET);
        display("book.getAuthorHashCode() = " + AnsiColor.BLUE + book.getAuthorHashCode(), AnsiColor.RESET);
        display("book.getTitleHashCode() = " + AnsiColor.BLUE + book.getTitleHashCode(), AnsiColor.RESET);
        display("book.hashCode() = " + AnsiColor.BLUE + book.hashCode(), AnsiColor.RESET);

        long begin;
        long end;

        begin = System.currentTimeMillis();
        for (int i = 1000000; i > 0; i--) {
            linkedList.add(new Book(Generate.id(), Generate.id()));
        }
        end = System.currentTimeMillis();
        display("Generated " + linkedList.size() + " element LinkedList in " + (end - begin) + "ms", AnsiColor.RED);

        begin = System.currentTimeMillis();
        linkedList.add(0, new Book("Title First", "Author First"));
        end = System.currentTimeMillis();
        display(
            "Added 1 element at the beginning of an " +
            (linkedList.size() - 1) +
            " element LinkedList in " +
            (end - begin) +
            "ms",
            AnsiColor.RED
        );

        begin = System.currentTimeMillis();
        linkedList.add(linkedList.size() - 1, new Book("Title Last", "Author Last"));
        end = System.currentTimeMillis();
        display(
            "Added 1 element at the end of an " +
            (linkedList.size() - 1) +
            " element LinkedList in " +
            (end - begin) +
            "ms",
            AnsiColor.RED
        );

        begin = System.currentTimeMillis();
        linkedList.remove(new Book("Title First", "Author First"));
        end = System.currentTimeMillis();
        display(
            "Removed 1 element from the beginning of an " +
            (linkedList.size() + 1) +
            " element LinkedList in " +
            (end - begin) +
            "ms",
            AnsiColor.RED
        );

        begin = System.currentTimeMillis();
        linkedList.remove(new Book("Title Last", "Author Last"));
        end = System.currentTimeMillis();
        display(
            "Removed 1 element from the end of an " +
            (linkedList.size() + 1) +
            " element LinkedList in " +
            (end - begin) +
            "ms",
            AnsiColor.RED
        );

        displayComment("Część 2", AnsiColor.BLUE);
        displayComment(
            "Stwórz program, który zmierzy czas operacji wyszukiwania po kluczu, a także czas dodawania i usuwania obiektu z mapy HashMap liczącej kilka milionów obiektów."
        );

        HashMap<Integer, Book> hashMap = new HashMap<Integer, Book>();

        int duplicatedHashCode = 0;

        begin = System.currentTimeMillis();
        for (int i = 1000000; i > 0; i--) {
            book = new Book(Generate.sequence(4, 16, 3), Generate.sequence(4, 8, 2));
            while (hashMap.containsKey(book.hashCode())) {
                display("duplicated hashCode: " + book.hashCode());
                duplicatedHashCode = book.hashCode();
                book = new Book(Generate.sequence(), Generate.sequence());
            }
            hashMap.put(book.hashCode(), book);
        }
        end = System.currentTimeMillis();
        display("Generated " + hashMap.size() + " element HashMap in " + (end - begin) + "ms", AnsiColor.RED);

        begin = System.currentTimeMillis();
        Book foundBook = hashMap.get(duplicatedHashCode);
        end = System.currentTimeMillis();
        display("Found " + foundBook + " element in HashMap in " + (end - begin) + "ms", AnsiColor.RED);

        begin = System.currentTimeMillis();
        boolean isItThere = hashMap.containsKey(duplicatedHashCode);
        end = System.currentTimeMillis();
        display("HashCode " + duplicatedHashCode + " found in HashMap in " + (end - begin) + "ms", AnsiColor.RED);
    }
}
