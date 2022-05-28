package Modul_02_Wstep_do_kolekcji.Sekcja_25_ArrayList_i_LinkedList.resources;

public class BookImpl implements Book {

  private String title;
  private int year;

  public BookImpl(String title, int year) {
    this.title = title;
    this.year = year;
  }

  public String title() {
    return this.title;
  }

  public int year() {
    return this.year;
  }
}
