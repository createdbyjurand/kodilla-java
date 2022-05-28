package Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap;

import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*;
import Modul_02_Wstep_do_kolekcji.Sekcja_25_ArrayList_i_LinkedList.resources.Book;
import Modul_02_Wstep_do_kolekcji.Sekcja_25_ArrayList_i_LinkedList.resources.BookImpl;
import Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources.Employee;
import Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources.Grade;
import Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources.Grades;
import Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources.SalaryParameters;
import Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources.Student;
import com.createdbyjurand.shared.Display.AnsiColor;

import static com.createdbyjurand.shared.Display.display;
import static com.createdbyjurand.shared.Display.displaySubtitle;
import static com.createdbyjurand.shared.Display.displayTitle;

public class MapIHashMap {

  public static void main(String[] args) throws java.lang.Exception {

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("2.6. Map i HashMap");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Interfejs Map");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Co to jest mapa?");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Mapa - przykład");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Interfejs Map");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("HashMap");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Jak działa HashMapa?");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Czym jest HashMapa?");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Porządkowanie elementów HashMapy, czyli kontrakt equals() i hashCode()");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Metoda hashCode() - podział na kubełki");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Nadpisywanie metody hashCode() w klasie reprezentującej obiekt klucz");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Unikalność elementów w kubełkach - equals()");

    Employee worker1 = new Employee("Zachary", "Taylor", "12345678901");
    Employee worker2 = new Employee("Elizabeth", "Kowalski", "10987654321");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Co tak naprawdę zawierają te zmienne?");

    if (worker1 != null) {
      worker1.doBankTransfer();
    }

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Przykład własnej wersji metody equals()");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("HashMap - podsumowanie");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Tworzenie HashMap");

    Employee worker3 = new Employee("Jennifer", "Nowak", "12345678901");
    Employee worker4 = new Employee("Sarah", "Taylor", "12345612345");
    Employee worker5 = new Employee("Laura", "Pinelli", "12345698765");
    Employee worker6 = new Employee("Laura", "Pinelli", "12345045678");

    SalaryParameters params1 = new SalaryParameters(5000.0, 3000.0, 0.0, 0.0);
    SalaryParameters params2 = new SalaryParameters(4000.0, 2000.0, 1000.0, 0.0);
    SalaryParameters params3 = new SalaryParameters(4500.0, 3500.0, 0.0, 0.0);
    SalaryParameters params4 = new SalaryParameters(11000.0, 0.0, 2000.0, 1000.0);

    HashMap<Employee, SalaryParameters> paymentParameters = new HashMap<Employee, SalaryParameters>();

    paymentParameters.put(worker3, params1);
    paymentParameters.put(worker4, params2);
    paymentParameters.put(worker5, params3);
    paymentParameters.put(worker6, params4);

    System.out.println("Salary of Jennifer Nowak equals: " + paymentParameters.get(worker3));

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Różnica między mapą, a listą");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Jakie jest najlepsze zastosowanie HashMap?");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Pętla for i poznane mapy");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Typ Entry");

    Map.Entry<Integer, String> entry = new Map.Entry<Integer, String>() {
      public Integer getKey() {
        return null;
      }

      public String getValue() {
        return null;
      }

      public String setValue(String value) {
        return null;
      }

      public boolean equals(Object o) {
        return false;
      }

      public int hashCode() {
        return 0;
      }
    };

    Integer key = entry.getKey();
    String value = entry.getValue();

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie: mapa uczniów i ocen");

    /*
    1. Przy użyciu wewnętrznego edytora Kodilli stwórz program z użyciem HashMap, który będzie przechowywał dane uczniów oraz ich ocen.
    2. Program ma wyświetlać średnią arytmetyczną ocen każdego ucznia.
    3. Rozwiązane zadanie wyślij do mentora.
    */

    Student student1 = new Student(
      "Jan",
      "Kowalski",
      "79112412234",
      "em@il1.com",
      "+48 234 543 234"
    );

    Student student2 = new Student(
      "Piotr",
      "Milewski",
      "981112234",
      "em@il2.com",
      "+48 765 543 234"
    );

    Student student3 = new Student(
      "Jan",
      "Kowalski",
      "73101512234",
      "em@il3.com",
      "+48 543 543 234"
    );

    Grades student1Grades = new Grades(
      new Grade[]{Grade.C, Grade.D, Grade.F},
      new Grade[]{Grade.C, Grade.A},
      new Grade[]{Grade.B, Grade.D},
      new Grade[]{Grade.F, Grade.E}
    );

    Grades student2Grades = new Grades(
      new Grade[]{Grade.F, Grade.F, Grade.F},
      new Grade[]{Grade.F},
      new Grade[]{Grade.F, Grade.F, Grade.F, Grade.F},
      new Grade[]{Grade.F, Grade.F}
    );

    Grades student3Grades = new Grades(
      new Grade[]{Grade.A, Grade.A, Grade.A, Grade.A, Grade.A, Grade.A, Grade.A},
      new Grade[]{Grade.A, Grade.A, Grade.A},
      new Grade[]{Grade.A, Grade.A, Grade.A, Grade.A},
      new Grade[]{Grade.A}
    );

    HashMap<Student, Grades> studentGrades = new HashMap<Student, Grades>();

    studentGrades.put(student1, student1Grades);
    studentGrades.put(student2, student2Grades);
    studentGrades.put(student3, student3Grades);

    System.out.println("student1: " + studentGrades.get(student1));
    System.out.println("student2: " + studentGrades.get(student2));
    System.out.println("student3: " + studentGrades.get(student3));

    System.out.println("student1: " + student1Grades);


  }
}
