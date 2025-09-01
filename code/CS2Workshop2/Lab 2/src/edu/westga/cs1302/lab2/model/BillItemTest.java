package edu.westga.cs1302.lab2.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BillItemTest {

	@Test
    void testConstructorRejectsNullName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new BillItem(null, 5.0);
        });
        assertEquals("name must not be null.", exception.getMessage());
    }
}
