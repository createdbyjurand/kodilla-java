package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        BDDMockito.given(libraryDatabaseMock.listBooksWithCondition("Secret")).willReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        Assertions.assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        while (booksQuantity > 0) {
            Book theBook = new Book("Title " + booksQuantity, "Author " + booksQuantity, 1970 + booksQuantity);
            resultList.add(theBook);
            booksQuantity--;
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        BDDMockito
            .given(libraryDatabaseMock.listBooksWithCondition(ArgumentMatchers.anyString()))
            .willReturn(resultListOf15Books);
        BDDMockito.given(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).willReturn(resultListOf0Books);
        BDDMockito.given(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).willReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        Assertions.assertEquals(0, theListOfBooks0.size());
        Assertions.assertEquals(15, theListOfBooks15.size());
        Assertions.assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        BDDMockito
            .given(libraryDatabaseMock.listBooksWithCondition(ArgumentMatchers.anyString()))
            .willReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        Assertions.assertEquals(0, theListOfBooks10.size());
        Mockito.verify(libraryDatabaseMock, Mockito.times(0)).listBooksWithCondition(ArgumentMatchers.anyString());
    }
}
