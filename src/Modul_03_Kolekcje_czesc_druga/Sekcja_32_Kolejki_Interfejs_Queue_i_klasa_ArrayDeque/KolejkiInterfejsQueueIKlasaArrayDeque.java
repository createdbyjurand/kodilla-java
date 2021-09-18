package Modul_03_Kolekcje_czesc_druga.Sekcja_32_Kolejki_Interfejs_Queue_i_klasa_ArrayDeque;

import Modul_03_Kolekcje_czesc_druga.Sekcja_32_Kolejki_Interfejs_Queue_i_klasa_ArrayDeque.resources.Book;
import Modul_03_Kolekcje_czesc_druga.Sekcja_32_Kolejki_Interfejs_Queue_i_klasa_ArrayDeque.resources.Order;
import java.io.*;
import java.lang.*;
import java.net.*;
import java.time.LocalDate;
import java.util.*;
import Shared.Display.AnsiColor;

import static Shared.Display.display;
import static Shared.Display.displaySubtitle;
import static Shared.Display.displayTitle;

public class KolejkiInterfejsQueueIKlasaArrayDeque {

  public static void main(String[] args) throws java.lang.Exception {

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("3.2. Kolejki - Interfejs Queue i klasa ArrayDeque");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Kolejka typu FIFO");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Kolejka typu LIFO");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Kolejka LIFO typu STOS");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("O kolejkach graficznie");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zastosowanie kolejek");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Interfejs Queue");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Interfejs Deque");

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Klasa ArrayDeque");

    // Create sample book
    Book theBook = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
    // Create sample order
    Order theOrder = new Order(theBook, 2017, 6, 30);
    // Check what is inside the order
    System.out.println(theOrder);

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Tworzenie kolejki i wstawianie elementów");

    // Create 3 sample books
    Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
    Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
    Book theBook3 = new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);

    // Create 5 sample orders
    Order theOrder1 = new Order(theBook1, 2017, 6, 28);
    Order theOrder2 = new Order(theBook2, 2017, 6, 28);
    Order theOrder3 = new Order(theBook1, 2017, 6, 29);
    Order theOrder4 = new Order(theBook2, 2017, 6, 30);
    Order theOrder5 = new Order(theBook3, 2017, 6, 30);

    // Create the FIFO queue
    ArrayDeque<Order> theOrders = new ArrayDeque<Order>();

    // Check size of the queue
    System.out.println("Queue is created. It's size: " + theOrders.size());

    // Put the orders into the queue
    theOrders.offer(theOrder1);
    theOrders.offer(theOrder2);
    theOrders.offer(theOrder3);
    theOrders.offer(theOrder4);
    theOrders.offer(theOrder5);

    // Check size of the queue
    System.out.println("Queue is filled. It's size: " + theOrders.size());
    System.out.println();

    // Examine the order at beginning of the queue
    System.out.println("First order in the queue is: \n" + theOrders.peek());
    System.out.println();

    // Get objects from queue
    Order temporaryOrder;
    temporaryOrder = theOrders.poll();

    // here you can do something with order taken from the queue
    temporaryOrder = theOrders.poll();
    temporaryOrder = theOrders.poll();
    temporaryOrder = theOrders.poll();
    temporaryOrder = theOrders.poll();

    // Check size of the queue
    System.out.println("Queue is emptied. It's size: " + theOrders.size());
    System.out.println();

    // Check what was taken as last
    System.out.println("Last order taken from queue was:\n" + temporaryOrder);
    System.out.println();

    /////////////////////////////////////////////////////////////////////////////////
    displayTitle("Zadanie: Książki na stos!");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("Przy użyciu wewnętrzengo edytora Kodilli napisz program, który:");

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("1. tworzy stos i umieszcza w nim pięć obiektów typu Book (możesz użyć klasy Book z przykładu),");

    Book bookOne = new Book("Game of Thrones", "George R.R. Martin", 1996);
    Book bookTwo = new Book("The Broken Earth", "N.K. Jemisin", 2001);
    Book bookThree = new Book("The Chronicles of Narnia", "C.S. Lewis", 1956);
    Book bookFour = new Book("The Poppy War", "R.F. Kuang", 2017);
    Book bookFive = new Book("The Dark Tower", "Stephen King", 1998);
    Book bookSix = new Book("Binti", "Nnedi Okorafor", 2007);
    Book bookSeven = new Book("A Court of Thorns and Roses", "Sarah J. Maas", 2010);
    Book bookEight = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1979);
    Book bookNine = new Book("An Ember in the Ashes", "Sabaa Tahir", 2020);
    Book bookTen = new Book("Song of Blood & Stone", "L. Penelope", 2015);

    ArrayDeque<Order> orders = new ArrayDeque<Order>();

    orders.push(new Order(bookOne, 2017, 6, 28));
    orders.push(new Order(bookTwo, 2017, 6, 28));
    orders.push(new Order(bookThree, 2017, 6, 28));
    orders.push(new Order(bookFour, 2017, 6, 28));
    orders.push(new Order(bookFive, 2017, 6, 28));
    orders.push(new Order(bookSix, 2017, 6, 28));
    orders.push(new Order(bookSeven, 2017, 6, 28));
    orders.push(new Order(bookEight, 2017, 6, 28));
    orders.push(new Order(bookNine, 2017, 6, 28));
    orders.push(new Order(bookTen, 2017, 6, 28));

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("2. sprawdza rozmiar stosu,");

    display(orders.size());

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("3. następnie usuwa wszystkie książki,");

    Order lastOrder = new Order();

    for (int i = orders.size(); i > 0; i--) {
      lastOrder = orders.pop();
      display("pop: " + lastOrder);
    }

    // orders.clear();

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("4. i ponownie sprawdza rozmiar stosu.");

    display(orders.size());

    /////////////////////////////////////////////////////////////////////////////////
    displaySubtitle("5. Program powinien wyświetlić również, która książka została usunięta ze stosu jako ostatnia.");

    display("Book that was deleted last: \n" + lastOrder);
  }
}
