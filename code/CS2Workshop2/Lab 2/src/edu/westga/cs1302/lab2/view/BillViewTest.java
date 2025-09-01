package edu.westga.cs1302.lab2.view;

import static org.junit.jupiter.api.Assertions.*;
import edu.westga.cs1302.lab2.model.Bill;
import edu.westga.cs1302.lab2.model.BillItem;
import org.junit.jupiter.api.Test;

class BillViewTest {

	@Test
    void testGetTextWithEmptyBill() {
        Bill bill = new Bill();
        BillView view = new BillView();

        String expected = "Iems" + System.lineSeparator()
                        + System.lineSeparator()
                        + "SUBTOTAL - $0.0" + System.lineSeparator()
                        + "TAX - $0.0" + System.lineSeparator()
                        + "TIP - $0.0" + System.lineSeparator()
                        + "TOTAL - $0.0";

        assertEquals(expected, view.getText(bill));
	}
	@Test
    void testGetTextWithSingleItem() {
        Bill bill = new Bill();
        bill.addItem(new BillItem("Chips", 9.0));
        BillView view = new BillView();

        String expected = "ITEMS" + System.lineSeparator()
                        + "Chips - 9.0" + System.lineSeparator()
                        + System.lineSeparator()
                        + "SUBTOTAL - $9.0" + System.lineSeparator()
                        + "TAX - $1.0" + System.lineSeparator()
                        + "TIP - $2.0" + System.lineSeparator()
                        + "TOTAL - $13.0";

        assertEquals(expected, view.getText(bill));
    }
}
