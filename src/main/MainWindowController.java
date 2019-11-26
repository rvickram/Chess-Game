package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {

    private Stage stage;

    @FXML
    private Button buttonDrawBoard;

    @FXML
    private Button buttonAddWhite;

    @FXML
    private Button buttonAddBlack;

    @FXML
    private Button buttonReset;


    public MainWindowController() {
        // Create the new stage
        this.stage = new Stage();

        // Load the FXML file
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/MainWindow.fxml"));

            // Set this class as the controller
            loader.setController(this);

            // Load the scene
            this.stage.setScene(new Scene(loader.load()));

            // Setup the window/stage
            this.stage.setTitle("SE3352 - Lab 3");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    void showStage() {
        this.stage.showAndWait();
    }


    @FXML
    void actionAddBlack(ActionEvent event) {

    }


    @FXML
    void actionAddWhite(ActionEvent event) {

    }


    @FXML
    void actionDrawBoard(ActionEvent event) {

    }


    @FXML
    void actionReset(ActionEvent event) {

    }
}
