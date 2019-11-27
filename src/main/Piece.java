package main;

import javafx.scene.canvas.GraphicsContext;

public class Piece {

    private PieceFactory pieceFactory = new PieceFactory();

    void drawPiece(GraphicsContext graphicsContext, BoardSquareFactory.BoardColour colour, PieceFactory.PieceType pieceType, int x, int y) {
        graphicsContext.drawImage(pieceFactory.getPiece(colour, pieceType), x, y, 50, 50);
    }
}
