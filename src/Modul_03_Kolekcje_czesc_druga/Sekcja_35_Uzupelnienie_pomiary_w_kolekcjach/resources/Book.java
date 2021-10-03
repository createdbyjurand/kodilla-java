package Modul_03_Kolekcje_czesc_druga.Sekcja_35_Uzupelnienie_pomiary_w_kolekcjach.resources;

public class Book {

  private String author;
  private String title;

  public Book(String title, String author) {
    this.author = author;
    this.title = title;
  }

  /////////////////////////// getters ///////////////////////////

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getAuthorHashCode() {
    return author.hashCode();
  }

  public int getTitleHashCode() {
    return title.hashCode();
  }

  /////////////////////////// setters ///////////////////////////

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /////////////////////////// methods ///////////////////////////

  @Override
  public boolean equals(Object o) {
    final Book book = (Book) o;
    return this.author.equals(book.author) && this.title.equals(book.title);
  }

  @Override
  public int hashCode() {
    // -2 147 483 648
    // +2 147 483 647
    return author.hashCode() + title.hashCode();
  }
}
