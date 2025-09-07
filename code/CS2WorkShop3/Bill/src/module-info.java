module Lab3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires org.junit.jupiter.api;

    exports edu.westga.cs1302.bill.view;
    exports edu.westga.cs1302.bill.model;

    opens edu.westga.cs1302.bill.view to javafx.fxml;
    opens edu.westga.cs1302.bill.model to org.junit.platform.commons;
    opens edu.westga.cs1302.bill.test.model to org.junit.platform.commons;

}
