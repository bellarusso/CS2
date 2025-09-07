module Lab3 {
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;

	exports edu.westga.cs1302.bill.view;
	exports edu.westga.cs1302.bill.model;

	opens edu.westga.cs1302.bill.view to javafx.fxml;
}