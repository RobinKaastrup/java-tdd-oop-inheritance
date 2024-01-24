package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    private Library library;
    @BeforeEach
    public void dummyData() {
        library = new Library();
        library.addToStock(new Book("The Way of Kings"));
        library.addToStock(new Article("You won't believe it!!!"));
        library.addToStock(new Newspaper("Murdoch owned tabloid issue #1582394"));
    }

    @Test
    public void addToStockTest() {
        Assertions.assertEquals("item has been checked out", library.checkOutLiterature("The Way of Kings"));
        Assertions.assertEquals("newspapers are not available for loan", library.checkOutLiterature("Murdoch owned tabloid issue #1582394"));
    }

    @Test
    public void checkOutLiteratureTest() {
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutLiterature("The Eye of The World"));
        Assertions.assertEquals("item has been checked out", library.checkOutLiterature("The Way of Kings"));

    }

    @Test
    public void checkInLiteratureTest() {
        Assertions.assertEquals("item is not part of the library's collection", library.checkInLiterature("Assassins Apprentice"));
        Assertions.assertEquals("item has been checked out", library.checkInLiterature("The Way of Kings"));

    }
}
