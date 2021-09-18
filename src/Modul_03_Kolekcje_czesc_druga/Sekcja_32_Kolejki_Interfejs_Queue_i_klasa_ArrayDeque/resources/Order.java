package Modul_03_Kolekcje_czesc_druga.Sekcja_32_Kolejki_Interfejs_Queue_i_klasa_ArrayDeque.resources;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

public class Order {

  private final Book book;
  private final LocalDate dateOfOrder;

  // constructor with arguments
  public Order(
    Book book,
    int year,
    int month,
    int day
  ) {
    this.book = book;
    this.dateOfOrder = LocalDate.of(year, month, day);
  }

  public Order() {
    this.book = new Book("", "", 1);
    this.dateOfOrder = LocalDate.of(1, 1, 1);
  }

  // method used to printout the order
  public String toString() {
    return "Order created: " + dateOfOrder + "\nordered book: " + book;
  }

  // getters
  public Book getBook() {
    return book;
  }

  public LocalDate getDateOfOrder() {
    return dateOfOrder;
  }
}
