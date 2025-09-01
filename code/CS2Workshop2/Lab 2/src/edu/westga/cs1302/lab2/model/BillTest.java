package edu.westga.cs1302.lab2.model;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
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
	 @Test
	    void testAddItem() {
	        bill.addItem(item1);
	        assertEquals(1, bill.getItems().size(), "Bill should have atleast 1 item");
	        assertEquals(item1, bill.getItems().get(0), "Added item should be named item1");
	    }
	 @Test
	 void testAddMultipleItems() {
	        bill.addItem(item1);
	        bill.addItem(item2);
	        ArrayList<BillItem> items = bill.getItems();
	        assertEquals(2, items.size(), "Bill should have 2 items after adding two");
	        assertTrue(items.contains(item1), "Bill should contain item1");
	        assertTrue(items.contains(item2), "Bill should contain item2");
	    }
	 @Test
	    void testAddItemNullThrowsException() {
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            bill.addItem(null);
	        });
	        assertEquals("item must not be null.", exception.getMessage());
	    }
}
