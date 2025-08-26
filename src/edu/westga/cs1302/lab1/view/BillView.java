package edu.westga.cs1302.lab1.view;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/** returns string containing list of bill tems and total
 * @precondition none
 * @postcondition none
 * 
 * @return string containing the list of bill items and total for the bill
 * 
 */
public class BillView {
    public String getText(Bill bill) {
        String text = "ITEMS" + System.lineSeparator();
        double subTotal = 0.0;
        ArrayList<BillItem> items = bill.getItems();
        
        for (BillItem item : items) {
            text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
            subTotal += item.getAmount();
        }
        
        text += System.lineSeparator();
        text += "SUBTOTAL - $" + subTotal + System.lineSeparator();
        double tax = subTotal * Bill.TAX_RATE;
        double tip = subTotal * Bill.TAX_RATE;
        text += "TAX - $" + tax + System.lineSeparator();
        text += "TIP - $" + tip + System.lineSeparator();
        text += "TOTAL - $" + (subTotal + tip + tax);
        
        return text;
    }
}

