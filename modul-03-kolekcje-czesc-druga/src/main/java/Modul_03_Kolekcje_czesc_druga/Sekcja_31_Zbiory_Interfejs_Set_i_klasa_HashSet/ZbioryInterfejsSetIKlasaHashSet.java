package Modul_03_Kolekcje_czesc_druga.Sekcja_31_Zbiory_Interfejs_Set_i_klasa_HashSet;

import static com.createdbyjurand.shared.display.Display.display;
import static com.createdbyjurand.shared.display.Display.displaySubtitle;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import Modul_03_Kolekcje_czesc_druga.Sekcja_31_Zbiory_Interfejs_Set_i_klasa_HashSet.resources.Book;
import Modul_03_Kolekcje_czesc_druga.Sekcja_31_Zbiory_Interfejs_Set_i_klasa_HashSet.resources.Employee;
import java.time.LocalDate;
import java.util.HashSet;

public class ZbioryInterfejsSetIKlasaHashSet {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("3.1. Zbiory - Interfejs Set i klasa HashSet");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Interfejs Set");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Do czego nam to potrzebne?");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Klasa HashSet");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Praktyczne wykorzystanie hashCode()");

        Employee worker1 = new Employee("Steven", "Newmack", 1987, 6, 30);
        System.out.println(worker1.hashCode());

        LocalDate storedDay = LocalDate.of(2017, 2, 28);
        display(storedDay.toString());

        int year = storedDay.getYear();
        int month = storedDay.getMonthValue();
        int day = storedDay.getDayOfMonth();
        display(year + " " + month + " " + day);

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Tworzenie kolekcji HashSet");

        // Creating 4 more example Employee objects
        Employee worker2 = new Employee("Jennifer", "Nowak", 1988, 2, 28);
        Employee worker3 = new Employee("Robert", "Greenfield", 1987, 6, 15);
        Employee worker4 = new Employee("Monica", "Smith", 1984, 10, 18);
        Employee worker5 = new Employee("Stephanie", "Jackson", 1985, 4, 3);

        // Creating a HashSet and filling it with objects
        HashSet<Employee> workersSet = new HashSet<Employee>();
        workersSet.add(worker1);
        workersSet.add(worker2);
        workersSet.add(worker3);
        workersSet.add(worker4);
        workersSet.add(worker5);

        // Testing if example object exists in the set
        System.out.println("worker3 exists in the set: " + workersSet.contains(worker3));

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Operacje na HashSet");

        // Print out every worker from the set
        for (Employee theWorker : workersSet) {
            System.out.println(theWorker);
        }

        display("---");

        // Print out every worker from the set
        for (Employee theWorker : workersSet) {
            if (theWorker.getBirthDate().getYear() >= 1986) {
                System.out.println(theWorker);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Korzyści wynikające z używania kolekcji typu HashSet");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie: Filtrowanie zbioru książek");

        /*
      1.  Przy użyciu wewnętrznego edytora Kodilla napisz program,
          który będzie przechowywał w zbiorze HashSet zestaw kilku obiektów
          reprezentujących książki.

      2.  Każda książka powinna mieć tytuł, autora i rok wydania.

      3.  Nie zapomnij również o zdefiniowaniu metod hashCode() oraz equals()
          dla swoich książek.

      4.  Następnie, przy pomocy poznanej w poprzednim module pętli for-each
          wyświetl w oknie konsoli tytuły wszystkich książek znajdujących się
          w zbiorze, które zostały wydane przed 2010 rokiem.
    */

        Book book1 = new Book("Ace of Spades", "Faridah Àbíké-Íyímídé", 1995);
        Book book2 = new Book("Rule of Wolves", "Leigh Bardugo", 2005);
        Book book3 = new Book("Firekeeper’s Daughter", "Angeline Boulley", 2020);
        Book book4 = new Book("The Venice Sketchbook", "Rhys Bowen", 2014);
        Book book5 = new Book("Chain of Iron", "Cassandra Clare", 1979);

        HashSet<Book> booksSet = new HashSet<Book>();
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);

        for (Book book : booksSet) {
            if (book.getYear() < 2010) {
                display(book.getTitle());
            }
        }
    }
}
