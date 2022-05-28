package Modul_02_Wstep_do_kolekcji.Sekcja_25_ArrayList_i_LinkedList;

import static com.createdbyjurand.shared.display.Display.display;
import static com.createdbyjurand.shared.display.Display.displaySubtitle;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import Modul_02_Wstep_do_kolekcji.Sekcja_25_ArrayList_i_LinkedList.resources.BookImpl;
import com.createdbyjurand.shared.ansi_color.AnsiColor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

/* Name of the class has to be "Main" only if the class is public. */
public class ArrayListILinkedList {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("2.5. ArrayList i LinkedList");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("ArrayList");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Tworzenie ArrayList");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Przeglądanie danych zapisanych w kolekcji typu ArrayList");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Usuwanie danych z kolekcji ArrayList");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Reorganizacja kolekcji po usunięciu elementu");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Dodawanie danych do kolekcji");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Podsumowanie ArrayList");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("LinkedList");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Odczytywanie danych z listy");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Indeksy w LinkedList");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("LinkedList - dodawanie elementów");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Usuwanie elementów LinkedList");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Podsumowanie LinkedList");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Pętla for i poznane listy");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie: średnia bez skrajnych ocen oraz lista obiektów Book");

        display("Część 1");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int length = (int) Math.round(Math.random() * 8) + 11;
        for (int i = 0; i < length; i++) {
            arrayList.add((int) Math.round(Math.random() * 5) + 1);
        }
        arrayList.sort(Comparator.naturalOrder());
        double arrayListResult = 0;
        for (int i = 1; i < arrayList.size() - 1; i++) {
            arrayListResult += arrayList.get(i);
            display("arrayList[" + i + "] = " + arrayList.get(i), AnsiColor.RED);
        }
        display("arrayListResult = " + arrayListResult / (arrayList.size() - 2));

        display("Część 2");

        LinkedList<BookImpl> linkedList = new LinkedList<BookImpl>();
        linkedList.add(new BookImpl("Dupa1", 1999));
        linkedList.add(new BookImpl("Dupa2", 2000));
        linkedList.add(new BookImpl("Dupa3", 2001));
        linkedList.add(new BookImpl("Dupa4", 2002));
        for (BookImpl book : linkedList) {
            if (book.year() > 2000) {
                display(book.title() + " z " + book.year());
            }
        }
    }
}
