module Lab3 {
	requires javafx.controls;
	requires javafx.fxml;
	exports edu.westga.cs1302.bill.view;
	opens edu.westga.cs1302.bill.view to javafx.fxml;
	}