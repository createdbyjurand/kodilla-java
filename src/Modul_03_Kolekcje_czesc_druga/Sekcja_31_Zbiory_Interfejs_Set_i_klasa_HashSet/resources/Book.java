package Modul_03_Kolekcje_czesc_druga.Sekcja_31_Zbiory_Interfejs_Set_i_klasa_HashSet.resources;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

public class Book {

  private final String title;
  private final String author;
  private final int year;

  public Book(
    String title,
    String author,
    int year
  ) {
    this.title = title;
    this.author = author;
    this.year = year;
  }

  public int hashCode(){
    return year * title.length() * author.length();
  }

  public boolean equals(Object o) {
    Book book = (Book) o;
    return year == book.year && title.equals(book.title) && author.equals(book.author);
  }

  public String toString(){
    return title + " by " + author + ", from " + year;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getYear() {
    return year;
  }
}
