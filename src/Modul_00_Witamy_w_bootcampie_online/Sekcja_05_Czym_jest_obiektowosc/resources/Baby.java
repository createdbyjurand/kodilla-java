package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources;

import java.util.*;
import java.lang.*;

public class Baby {

  private int day;
  private int month;
  private int year;
  private String name;
  private String surname;

  public Baby(String name, String surname, int day, int month, int year) {
    System.out.println("Baby object created");

    this.day = day;
    this.month = month;
    this.year = year;
    this.name = name;
    this.surname = surname;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return Calendar.getInstance().get(Calendar.YEAR) - this.year;
  }
}
