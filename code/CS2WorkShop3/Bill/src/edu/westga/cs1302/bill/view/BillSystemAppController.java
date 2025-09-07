package edu.westga.cs1302.bill.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillItem;

public class BillSystemAppController {

	@FXML
	private TextField itemNameField;

	@FXML
	private TextField itemAmountField;

	@FXML
	private Button addItemButton;

	@FXML
	private TextArea billDisplayArea;

	private Bill bill;

	@FXML
	public void initialize() {
		bill = new Bill();
		addItemButton.setOnAction(event -> handleAddItem());
	}

	private void handleAddItem() {
		String name = itemNameField.getText();
		String amountText = itemAmountField.getText();

		double amount;
		try {
			amount = Double.parseDouble(amountText);
		} catch (NumberFormatException e) {
			billDisplayArea.setText("Please enter a valid number for amount.");
			return;
		}
		BillItem item = new BillItem(name, amount);
		bill.addItem(item);
		billDisplayArea.setText(bill.toString()); // Or use BillView.getText(bill) if you have it
	}
}