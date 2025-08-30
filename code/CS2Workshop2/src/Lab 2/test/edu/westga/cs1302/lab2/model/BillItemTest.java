package edu.westga.cs1302.lab2.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BillItemTest {

	@Test
    void testConstructorAndGetters() {
        BillItem item = new BillItem("Coke", 3.50);
        
        assertEquals("Coke", item.getName(), "getName should return the correct name");
        
        assertEquals(3.50, item.getAmount(), 0.0001, "getAmount should return the correct amount");
    }
}