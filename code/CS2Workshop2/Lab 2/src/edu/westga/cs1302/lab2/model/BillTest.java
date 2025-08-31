package edu.westga.cs1302.lab2.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BillTest {
	private Bill bill;
    private BillItem item1;
    private BillItem item2;

	@Test
    void testBillStartsEmpty() {
        assertNotNull(bill.getItems(), "Bill items list should not be null");
        assertEquals(0, bill.getItems().size(), "Bill should start empty");
    }
}
