package edu.westga.cs1302.bill.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Main application class for the Bill System GUI.
 *
 * <p>Launches the JavaFX application and loads the BillSystemApp.fxml
 * to display the GUI for managing bills.
 * </p>
 *
 * @author CS1302
 * @version Fall 2025
 */

public class BillSystemApp extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("BillSystemApp.fxml"));
    primaryStage.setTitle("Bill System");
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }
  /**
   * The main entry point for the Bill System application.
   *
   * <p>Launches the JavaFX application.
   * </p>
   *
   * @param args command-line arguments (not used)
   */

  public static void main(String[] args) {
    launch(args);
  }
}