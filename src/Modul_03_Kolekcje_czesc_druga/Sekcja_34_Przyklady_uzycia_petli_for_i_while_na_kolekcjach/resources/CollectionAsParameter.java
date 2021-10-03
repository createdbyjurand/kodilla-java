package Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CollectionAsParameter {

  public static void main(String[] args) throws java.lang.Exception {

    //initialising the collection
    ArrayList<Integer> theBigList = new ArrayList<Integer>();
    Random theGenerator = new Random();
    for (int n = 0; n < 200; n++) {
      //inserting a random number of range 0-99 into the list
      theBigList.add(theGenerator.nextInt(100));
    }

    ArrayTester tester = new ArrayTester();
    tester.printEven(theBigList);
  }
}
