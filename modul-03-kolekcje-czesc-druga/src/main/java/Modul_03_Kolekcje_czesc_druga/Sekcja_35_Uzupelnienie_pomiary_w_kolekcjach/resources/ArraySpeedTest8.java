package Modul_03_Kolekcje_czesc_druga.Sekcja_35_Uzupelnienie_pomiary_w_kolekcjach.resources;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ArraySpeedTest8 {

  public static void main(String[] args) throws java.lang.Exception {

    //Creating collection with 8000000 elements of type Integer
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int n = 0; n < 8000000; n++) {
      list.add(n);
    }

    //Displaying quantity of elements
    System.out.println("Quantity of elements in the collection: " + list.size());

    //Deleting last element in the collection
    long begin = System.currentTimeMillis();
    list.remove(list.size() - 1);
    long end = System.currentTimeMillis();

    //Displaying time of deletion
    System.out.println("Removing last element has taken: " + (end - begin) + "ms");

    //Deleting first element from collection
    begin = System.currentTimeMillis();
    list.remove(0);
    end = System.currentTimeMillis();

    //Displaying time of deletion
    System.out.println("Removing first element has taken: " + (end - begin) + "ms");
  }
}
