package Modul_03_Kolekcje_czesc_druga.Sekcja_35_Uzupelnienie_pomiary_w_kolekcjach.resources;

import java.util.*;
import java.lang.*;
import java.io.*;

public class CollectionCreate {

  /* Name of the class has to be "Main" only if the class is public. */
  public static void main(String[] args) throws java.lang.Exception {

    //Creating collection with 30000 elements of type Integer
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int n = 0; n < 30000; n++) {
      list.add(n);
    }

    //Displaying quantity of elements in the collection
    System.out.println("Quantity of elements in the collections: " + list.size());
  }
}
