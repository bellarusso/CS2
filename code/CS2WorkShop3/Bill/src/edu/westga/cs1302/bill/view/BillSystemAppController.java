package edu.westga.cs1302.bill.view;

import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillItem;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * Controller for the Bill System GUI.
 *
 *<p>Handles user input for adding items to the bill and displays
 * the updated bill in the GUI.
 * </p>
 *
 * @author YourName
 * @version Fall 2025
 */

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
  /**
   * Initializes the BillSystemAppController.
   *
   * <p>Creates a new Bill object and sets up the action listener for
   * the Add Item button to handle adding items to the bill.
   * </p>
   */
  
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
    BillView view = new BillView();
    billDisplayArea.setText(view.getText(bill)); // Or use BillView.getText(bill) if you have it
  }
}