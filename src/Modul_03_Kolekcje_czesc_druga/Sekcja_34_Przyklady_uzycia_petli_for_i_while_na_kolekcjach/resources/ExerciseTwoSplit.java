package Modul_03_Kolekcje_czesc_druga.Sekcja_34_Przyklady_uzycia_petli_for_i_while_na_kolekcjach.resources;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseTwoSplit {

  private List<String> odd = new ArrayList<String>();
  private List<String> even = new ArrayList<String>();

  public ExerciseTwoSplit(ArrayDeque<String> arrayDeque) {
    while (arrayDeque.size() > 0) {
      String string = arrayDeque.poll();
      if (string.length() % 2 == 0) {
        this.odd.add(string);
      } else {
        this.even.add(string);
      }
    }
  }

  private String listToString(List<String> list){
    return Arrays.toString(list.toArray());
  }

  public String getOdd() {
    return listToString(this.odd);
  }

  public void setOdd(List<String> list) {
    this.odd = list;
  }

  public String getEven() {
    return listToString(this.even);
  }

  public void setEven(List<String> list) {
    this.even = list;
  }
}
