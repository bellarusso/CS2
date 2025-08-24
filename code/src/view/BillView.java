package view;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;


public class BillView {

    /**
     * Generates the text representation of a Bill.
     * 
     * @param bill the bill to generate the text for
     * @return formatted string  of the bill
     */
    public static String getText(Bill bill) {
        String text = "ITEMS" + System.lineSeparator();
        double subTotal = 0.0;

        for (BillItem item : bill.getItems()) {
            text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
            subTotal += item.getAmount();
        }

        text += System.lineSeparator();
        text += "SUBTOTAL - $" + String.format("%.2f", subTotal) + System.lineSeparator();
        double tax = subTotal * Bill.TAX_RATE;
        double tip = subTotal * Bill.TIP_RATE;
        text += "TAX - $" + String.format("%.2f", tax) + System.lineSeparator();
        text += "TIP - $" + String.format("%.2f", tip) + System.lineSeparator();
        text += "TOTAL - $" + String.format("%.2f", (subTotal + tip + tax));

        return text;
    }
}
