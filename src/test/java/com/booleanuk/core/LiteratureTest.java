package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LiteratureTest {
    private Literature literature1;
    private Literature literature2;

    @BeforeEach
    public void makeDummyData() {
        literature1 = new Literature("The Colour of Magic");
        literature2 = new Literature("The Wizard of Earthsea");
    }

    @Test
    public void isOnLoanTest() {
        literature1.checkOut();
        Assertions.assertTrue(literature1.isOnLoan());
        Assertions.assertFalse(literature2.isOnLoan());
    }

    @Test
    public void checkOutTest() {
        Assertions.assertEquals("item has been checked out", literature1.checkOut());
        Assertions.assertEquals("item is currently on loan", literature1.checkOut());
    }

    @Test
    public void checkInTest() {
        literature2.checkOut();
        Assertions.assertEquals("item has been checked in", literature2.checkIn());
        Assertions.assertEquals("item is not currently on loan", literature2.checkIn());
    }

}
