package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources;

import java.lang.*;

public class Calculator {

  public Calculator() {
    System.out.println("Calculator object created");
  }

  public double subtractDoubleAfromB(double a, double b) {
    System.out.println(a - b);
    return a - b;
  }
}
