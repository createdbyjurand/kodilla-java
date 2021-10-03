package Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ArrayTester {

  //method prints out only the even elements of an ArrayList
  public void printEven(ArrayList<Integer> theList) {
    int temporaryValue = 0;
    for (int n = 0; n < theList.size(); n++) {
      temporaryValue = theList.get(n);
      //checking if an element is even or odd
      if (temporaryValue % 2 == 0) {
        //if reminder of dividing the element by two equals 0,
        //the element is even, so we can print out it.
        System.out.println(temporaryValue);
      }
    }
  }
}
