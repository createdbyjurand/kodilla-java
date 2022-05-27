package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources;

import java.lang.*;

public class SimpleCalculator {

  public SimpleCalculator() {
    System.out.println("SimpleCalculator object created");
  }

  public int addAToB(int a, int b) {
    System.out.println(a + b);
    return a + b;
  }

  public int substractBFromA(int a, int b) {
    System.out.println(a - b);
    return a - b;
  }
}
