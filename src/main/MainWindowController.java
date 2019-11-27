package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {

    private Stage stage;

    //region fxml objects
    @FXML
    private Pane boardPane;

    @FXML
    private Button buttonDrawBoard;

    @FXML
    private Button buttonAddWhite;

    @FXML
    private Button buttonAddBlack;

    @FXML
    private Button buttonReset;
    //endregion


    MainWindowController() {
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
            this.stage.setTitle("SE3352 - Lab 5");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    void showStage() {
        this.stage.showAndWait();
    }


    //region fxml actions
    @FXML
    void actionAddBlack(ActionEvent event) {

    }


    @FXML
    void actionAddWhite(ActionEvent event) {

    }


    @FXML
    void actionDrawBoard(ActionEvent event) {
        Canvas canvas = new Canvas();
        canvas.setHeight(this.boardPane.getHeight());
        canvas.setWidth(this.boardPane.getWidth());
        this.boardPane.getChildren().add(canvas);
        BoardSquare boardSquare = new BoardSquare();

        //draw the board line by line
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i%2 == 0) {
                    if (j%2 == 0)
                        boardSquare.drawSquare(canvas.getGraphicsContext2D(), BoardSquareFactory.BoardColour.WHITE, j*50, i*50);
                    else
                        boardSquare.drawSquare(canvas.getGraphicsContext2D(), BoardSquareFactory.BoardColour.BLACK, j*50, i*50);
                }
                else {
                    if (j%2 > 0)
                        boardSquare.drawSquare(canvas.getGraphicsContext2D(), BoardSquareFactory.BoardColour.WHITE, j*50, i*50);
                    else
                        boardSquare.drawSquare(canvas.getGraphicsContext2D(), BoardSquareFactory.BoardColour.BLACK, j*50, i*50);
                }
                //0 0,0; 1 50,0; 2 100,0
            }
        }

        this.buttonDrawBoard.setDisable(true);
    }


    @FXML
    void actionReset(ActionEvent event) {
        this.boardPane.getChildren().clear();
        this.buttonDrawBoard.setDisable(false);
    }
    //endregion
}
