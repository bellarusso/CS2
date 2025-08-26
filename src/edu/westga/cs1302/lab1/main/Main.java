package edu.westga.cs1302.lab1.main;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;
import edu.westga.cs1302.lab1.view.BillView;

public class Main {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new BillItem("Coffee", 3.50));
        bill.addItem(new BillItem("Sandwich", 5.75));

        BillView view = new BillView();
        String displayText = view.getText(bill);

        System.out.println(displayText);
    }
}

