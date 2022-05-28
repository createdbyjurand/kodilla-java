package Modul_02_Wstep_do_kolekcji.Sekcja_26_Map_i_HashMap.resources;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class EntryTest {

  public static void main(String[] args) throws java.lang.Exception {

    // Creating and filling the map
    HashMap<Integer, String> theMap = new HashMap<Integer, String>();
    theMap.put(1, "One");
    theMap.put(2, "Two");
    theMap.put(7, "Seven");

    // Using entrySet() to retrieve and display content of the map
    for (Map.Entry<Integer, String> entry : theMap.entrySet()) {
      System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");
    }
  }
}
