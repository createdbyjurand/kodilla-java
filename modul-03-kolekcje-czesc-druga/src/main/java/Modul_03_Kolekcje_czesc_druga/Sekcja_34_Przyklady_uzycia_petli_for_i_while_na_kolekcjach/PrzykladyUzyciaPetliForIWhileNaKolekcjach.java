package Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach;

import static com.createdbyjurand.shared.display.Display.display;
import static com.createdbyjurand.shared.display.Display.displayComment;
import static com.createdbyjurand.shared.display.Display.displaySubtitle;
import static com.createdbyjurand.shared.display.Display.displayTitle;

import Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources.ArrayTester;
import Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources.ExerciseTwoSplit;
import Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources.MyObject;
import Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources.TaskManager;
import com.createdbyjurand.shared.ansi_color.AnsiColor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class PrzykladyUzyciaPetliForIWhileNaKolekcjach {

    public static void main(String[] args) throws java.lang.Exception {
        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("3.4. Przykłady użycia pętli for i while na kolekcjach", AnsiColor.RED);

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Generowanie danych testowych przy pomocy pętli for");

        displayComment("class BigTestData");
        ArrayList<Integer> theBigListOne = new ArrayList<Integer>();
        Random theGeneratorOne = new Random();

        for (int n = 0; n < 2000000; n++) {
            theBigListOne.add(theGeneratorOne.nextInt(50000));
        }

        displayComment("Check the list size");
        System.out.println("The Big List contains now " + theBigListOne.size() + " objects");

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Przekazywanie kolekcji jako argument do metody");

        displayComment("initialising the collection");
        displayComment("inserting a random number of range 0-99 into the list");
        ArrayList<Integer> theBigListTwo = new ArrayList<Integer>();
        Random theGeneratorTwo = new Random();
        for (int n = 0; n < 200; n++) {
            theBigListTwo.add(theGeneratorTwo.nextInt(100));
        }
        ArrayTester tester = new ArrayTester();
        tester.printEven(theBigListTwo);

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Przepisywanie obiektów z kolekcji do kolekcji");

        //the first task's list
        ArrayDeque<String> taskQueue1 = new ArrayDeque<String>();
        for (int n = 0; n < 5; n++) {
            taskQueue1.offer("The first task number " + (n + 1));
        }

        //the second task's list
        ArrayDeque<String> taskQueue2 = new ArrayDeque<String>();
        for (int n = 0; n < 5; n++) {
            taskQueue2.offer("The second task number " + (n + 1));
        }

        TaskManager taskExecutor = new TaskManager();
        taskExecutor.executeTasks(taskQueue1);
        taskExecutor.executeTasks(taskQueue2);

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Sprawdzenie LinkedList pod kątem występowania duplikatów");

        LinkedList<MyObject> listOfNumbers = new LinkedList<MyObject>();
        Random theGenerator = new Random();
        //filling the list with random values
        for (int n = 0; n < 100; n++) {
            listOfNumbers.add(new MyObject(theGenerator.nextInt(100)));
        }

        //checking for duplicates
        Iterator<MyObject> iterator = listOfNumbers.iterator();
        while (iterator.hasNext()) {
            MyObject examinedObject = iterator.next();

            //comparing with every element of list
            for (int k = 0; k < listOfNumbers.size(); k++) {
                //preventing to compare the object with himself
                if (listOfNumbers.get(k).hashCode() != examinedObject.hashCode()) {
                    //if duplicated...
                    if (listOfNumbers.get(k).equals(examinedObject)) {
                        System.out.println("Duplicated: " + examinedObject.getValue());
                    }
                }
            }
        }

        /////////////////////////////////////////////////////////////////////////////////
        displayTitle("Zadanie: Litery wężykiem!");

        displayComment(
                "Zadanie składa się z dwóch części. Należy je zrealizować przy pomocy wewnęrznego edytora Kodilla w ramach jednego projektu."
        );
        displayComment("Część 1", AnsiColor.BLUE);
        displayComment(
                "1.  Napisz program, który w kolejce ArrayDeque umieści 50 obiektów przechowujących napisy, składające się z litery 'a' powtórzonej losową ilość razy (zakres powtórzeń: 1 - 50)."
        );
        displayComment("2.  Wypełnienie obiektu powtórzeniami litery 'a' zrealizuj przy pomocy pętli for.");
        displayComment("Część 2", AnsiColor.BLUE);
        displayComment(
                "1.  Program z części pierwszej rozbuduj w taki sposób, że przekażesz utworzoną kolejkę do metody Twojej klasy, która dokona rozdzielenia obiektów z kolejki na dwie kolekcje ArrayList."
        );
        displayComment(
                "2.  Jedna z nich będzie przechowywała obiekty o parzystej ilości znaków 'a', a druga o nieparzystej."
        );

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Część 1");

        ArrayDeque<String> exerciseOneArrayDeque = new ArrayDeque<String>();
        Random exerciseOneGenerator = new Random();

        for (int i = 0; i < 50; i++) {
            String a = "";
            for (int r = exerciseOneGenerator.nextInt(50); r > 0; r--) {
                a += "a";
            }
            display("a: " + a);
            exerciseOneArrayDeque.offer(a);
        }

        /////////////////////////////////////////////////////////////////////////////////
        displaySubtitle("Część 2");

        ExerciseTwoSplit exerciseTwoSplit = new ExerciseTwoSplit(exerciseOneArrayDeque);

        display("odd: " + exerciseTwoSplit.getOdd());
        display("even: " + exerciseTwoSplit.getEven());
    }
}
