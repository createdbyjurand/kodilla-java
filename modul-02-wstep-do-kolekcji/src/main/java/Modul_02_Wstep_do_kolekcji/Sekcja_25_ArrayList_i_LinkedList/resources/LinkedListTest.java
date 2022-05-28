package Modul_02_Wstep_do_kolekcji.Sekcja_25_ArrayList_i_LinkedList.resources;

import java.util.LinkedList;

/* Name of the class has to be "Main" only if the class is public. */
public class LinkedListTest {

    public static void main(String[] args) throws java.lang.Exception {
        // Create and fill the list
        LinkedList<String> list = new LinkedList<String>();
        list.add(0, "Zero");
        list.add(1, "One");
        list.add(2, "Two");
        list.add(3, "Three");
        list.add(4, "Four");
        list.add(5, "Five");
        list.add(6, "Six");
        list.add(7, "Seven");
        list.add(8, "Eight");
        list.add(9, "Nine");
        list.add(10, "Ten");

        // Retrieve and display an element at index 7
        System.out.println("Element list(7) = " + list.get(7));
    }
}
