package main;

import javafx.scene.canvas.GraphicsContext;

class BoardSquare {

    void drawSquare(GraphicsContext graphicsContext, BoardSquareFactory.BoardColour colour, int x, int y) {
        int height = 50;
        int width = 50;

        graphicsContext.drawImage(
                BoardSquareFactory.getBoardSquare(colour),
                x,
                y,
                width,
                height
        );
    }
}
