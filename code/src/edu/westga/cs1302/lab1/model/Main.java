package edu.westga.cs1302.lab1.model;

import edu.westga.cs1302.lab1.model.BillItem;
import view.BillView;

public class Main {
	
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new BillItem("Burger", 8.99));
        bill.addItem(new BillItem("Fries", 3.49));
        bill.addItem(new BillItem("Soda", 1.50));

        System.out.println(BillView.getText(bill));
    }
}
