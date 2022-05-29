package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

public class BorrowedBooksTestSuite {

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
    public void whenTheUserDoesNotHaveAnyBooksBorrowed() {
        // Given
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        LibraryUser libraryUserMock = Mockito.mock(LibraryUser.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        BDDMockito
            .given(libraryDatabaseMock.listBooksInHandsOf(Mockito.any(LibraryUser.class)))
            .willReturn(resultListOf0Books);

        // When
        List<Book> theListOfUserBooks = bookLibrary.listBooksInHandsOf(libraryUserMock);

        // Then
        Assertions.assertEquals(0, theListOfUserBooks.size());
    }

    @Test
    public void whenHeHasOneBookBorrowed() {
        // Given
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        LibraryUser libraryUserMock = Mockito.mock(LibraryUser.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf1Book = generateListOfNBooks(1);
        BDDMockito
            .given(libraryDatabaseMock.listBooksInHandsOf(Mockito.any(LibraryUser.class)))
            .willReturn(resultListOf1Book);

        // When
        List<Book> theListOfUserBooks = bookLibrary.listBooksInHandsOf(libraryUserMock);

        // Then
        Assertions.assertEquals(1, theListOfUserBooks.size());
    }

    @Test
    public void whenHeHas5BooksBorrowed() {
        // Given
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        LibraryUser libraryUserMock = Mockito.mock(LibraryUser.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        BDDMockito
            .given(libraryDatabaseMock.listBooksInHandsOf(Mockito.any(LibraryUser.class)))
            .willReturn(resultListOf5Books);

        // When
        List<Book> theListOfUserBooks = bookLibrary.listBooksInHandsOf(libraryUserMock);

        // Then
        Assertions.assertEquals(5, theListOfUserBooks.size());
    }
}
