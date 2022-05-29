package Modul_03_Kolekcje_czesc_druga.Sekcja_33_Interfejs_Iterator_oraz_petla_while;

import static com.createdbyjurand.shared.display.Display.display;
import static com.createdbyjurand.shared.display.Display.displayComment;
import static com.createdbyjurand.shared.display.Display.displaySubtitle;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import Modul_03_Kolekcje_czesc_druga.Sekcja_33_Interfejs_Iterator_oraz_petla_while.resources.Employee;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class InterfejsIteratorOrazPetlaWhile {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("3.3. Interfejs Iterator oraz pętla while");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Interfejs Iterator");

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Czym jest iterator?");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Pętla while");

        displayComment("class HashSetExample");

        displayComment("Creating 5 example Employee objects");
        Employee worker1 = new Employee("Steven", "Newmack", 1987, 6, 30);
        Employee worker2 = new Employee("Jennifer", "Nowak", 1988, 2, 28);
        Employee worker3 = new Employee("Robert", "Greenfield", 1987, 6, 15);
        Employee worker4 = new Employee("Monica", "Smith", 1984, 10, 18);
        Employee worker5 = new Employee("Stephanie", "Jackson", 1985, 4, 3);

        displayComment("Creating a HashSet and filling it with objects");
        HashSet<Employee> workersSet = new HashSet<Employee>();
        workersSet.add(worker1);
        workersSet.add(worker2);
        workersSet.add(worker3);
        workersSet.add(worker4);
        workersSet.add(worker5);

        displayComment("Print out every worker from the set using while loop");
        Iterator<Employee> iteratorWorkersSet = workersSet.iterator();
        while (iteratorWorkersSet.hasNext()) {
            Employee currentWorker = iteratorWorkersSet.next();
            System.out.println(currentWorker);
        }
        System.out.println("Loop has finished her work");

        displayComment("Operatory logiczne ! && ||");

        int a = 0;
        int b = 0;
        boolean result = ((a > 5) && (b < 10)) || (a > 100);

        displayComment("class WhileLoopTest");

        boolean loggedIn = false;
        int tryCounter = 0;
        Random randomGenerator = new Random();
        while (!loggedIn) {
            tryCounter++;
            System.out.println("Waiting for the User to sign in : [attempt # " + tryCounter + "]");
            if (randomGenerator.nextInt(100) > 90) {
                loggedIn = true;
            }
        }
        System.out.println("User logged in!");

        displayComment("Liczby pseudolosowe");
        Random randomGeneratorTwo = new Random();
        int n = randomGeneratorTwo.nextInt(100);
        displayComment("W przykładzie tym generowana liczba jest z zakresu 0 - 99");
        displayComment("nie większa niż wartość 100 podana w argumencie metody nextInt(int range).");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie: Wyścigi sum");

        /*
      Napisz program, który:
      1.  będzie posiadał zmienną int sumaA (zainicjowana z wartością 1000)
      2.  oraz drugą zmienną int SumaB (zainicjowana z wartością 0).
      3.  Pętle while, wewnątrz której losujemy:
      4.  liczbę typu int z zakresu 0-9 i dodawaj ją do zmiennej sumaA oraz
      5.  liczbę typu int z zakresu 0-49 i dodawaj ją do zmiennej sumaB.
      6.  Pętlę wykonuj tak długo, jak długo spełniony jest warunek sumaA > sumaB.
      7.  W każdej iteracji wyświetl numer przebiegu pętli oraz aktualne wartości obu zmiennych.
    */

        int sumaA = 1000;
        int sumaB = 0;
        int i = 1;

        Random random = new Random();

        while (sumaA > sumaB) {
            sumaA += random.nextInt(10);
            sumaB += random.nextInt(50);
            display(i++ + ": sumaA=" + sumaA + ", sumaB=" + sumaB);
        }
    }
}
