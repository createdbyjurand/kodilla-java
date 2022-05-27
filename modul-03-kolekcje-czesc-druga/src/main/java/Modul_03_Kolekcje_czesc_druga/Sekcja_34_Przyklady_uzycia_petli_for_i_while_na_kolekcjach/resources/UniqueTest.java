package Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class UniqueTest {

  public static void main(String[] args) throws java.lang.Exception {

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
            System.out.println("Duplicated: " +
              examinedObject.getValue());
          }
        }
      }
    }
  }
}
