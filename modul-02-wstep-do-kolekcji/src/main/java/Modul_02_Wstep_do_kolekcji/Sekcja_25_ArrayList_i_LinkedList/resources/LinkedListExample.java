package Modul_02_Wstep_do_kolekcji.Sekcja_25_ArrayList_i_LinkedList.resources;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class LinkedListExample {

  public static void main(String[] args) throws java.lang.Exception {

    //Create the list and fill it with 1000 sequent numbers
    //multiplied by 2
    LinkedList<Integer> theList = new LinkedList<Integer>();
    for (int n = 0; n < 1000; n++) {
      theList.add(n * 2);
    }

    /////////////////////////// Indeksy w LinkedList ///////////////////////////

    //Retrieve and display the element of list from position 760
    System.out.println("List element at index 760 equals: " + theList.get(760));

    /////////////////////////// LinkedList - dodawanie elementów ///////////////////////////

    //Retrieve and display element at index 760
    System.out.println("List element at index 760 equals: " + theList.get(760));

    //insert new element with value 500 at index 760
    theList.add(760, 500);

    //Checking out the value of element at index 760:
    System.out.println("List element at index 760 equals: " + theList.get(760));

    //Checking size of the list after addition of one element
    System.out.println("List size (after addition of 1 element) equals: " + theList.size());

    /////////////////////////// Usuwanie elementów LinkedList ///////////////////////////

    //Retrieve and display element at index 760
    System.out.println("List element at index 760 equals: " + theList.get(760));

    //Deleting element at index 760
    theList.remove(760);

    //Checking the value of element at index 760:
    System.out.println("List element at index 760 equals: " + theList.get(760));

    //Checking length ot the list after deletion
    System.out.println("List size (after deletion of 1 element) equals: " + theList.size());

  }
}
