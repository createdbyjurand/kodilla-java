package Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MyObject {

  int value = 0;

  //constructor
  public MyObject(int value) {
    this.value = value;
  }

  public boolean equals(Object o) {
    MyObject myObj = (MyObject) o;
    if (myObj.getValue() == value) {
      return true;
    } else {
      return false;
    }
  }

  //getters
  public int getValue() {
    return value;
  }
}
