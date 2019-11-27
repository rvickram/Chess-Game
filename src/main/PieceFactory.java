package main;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {

    enum PieceType { BISHOP, KING, KNIGHT, PAWN, QUEEN, ROOK }

    private Map<PieceType, Map<BoardSquareFactory.BoardColour, Image>> pieceTypeMap = new HashMap<>();


    public PieceFactory() {
        pieceTypeMap.put(PieceType.BISHOP, new HashMap<>());
        pieceTypeMap.put(PieceType.KING, new HashMap<>());
        pieceTypeMap.put(PieceType.KNIGHT, new HashMap<>());
        pieceTypeMap.put(PieceType.PAWN, new HashMap<>());
        pieceTypeMap.put(PieceType.QUEEN, new HashMap<>());
        pieceTypeMap.put(PieceType.ROOK, new HashMap<>());
        
        pieceTypeMap.get(PieceType.BISHOP).put(
                BoardSquareFactory.BoardColour.WHITE,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/WhiteBishop.png"))
        );
        pieceTypeMap.get(PieceType.BISHOP).put(
                BoardSquareFactory.BoardColour.BLACK,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/BlackBishop.png"))
        );
        pieceTypeMap.get(PieceType.KING).put(
                BoardSquareFactory.BoardColour.WHITE,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/WhiteKing.png"))
        );
        pieceTypeMap.get(PieceType.KING).put(
                BoardSquareFactory.BoardColour.BLACK,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/BlackKing.png"))
        );
        pieceTypeMap.get(PieceType.KNIGHT).put(
                BoardSquareFactory.BoardColour.WHITE,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/WhiteKnight.png"))
        );
        pieceTypeMap.get(PieceType.KNIGHT).put(
                BoardSquareFactory.BoardColour.BLACK,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/BlackKnight.png"))
        );
        pieceTypeMap.get(PieceType.PAWN).put(
                BoardSquareFactory.BoardColour.WHITE,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/WhitePawn.png"))
        );
        pieceTypeMap.get(PieceType.PAWN).put(
                BoardSquareFactory.BoardColour.BLACK,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/BlackPawn.png"))
        );
        pieceTypeMap.get(PieceType.QUEEN).put(
                BoardSquareFactory.BoardColour.WHITE,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/WhiteQueen.png"))
        );
        pieceTypeMap.get(PieceType.QUEEN).put(
                BoardSquareFactory.BoardColour.BLACK,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/BlackQueen.png"))
        );
        pieceTypeMap.get(PieceType.ROOK).put(
                BoardSquareFactory.BoardColour.WHITE,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/WhiteRook.png"))
        );
        pieceTypeMap.get(PieceType.ROOK).put(
                BoardSquareFactory.BoardColour.BLACK,
                new Image(Main.class.getClassLoader().getResourceAsStream("images/BlackRook.png"))
        );
    }


    Image getPiece(BoardSquareFactory.BoardColour colour, PieceType pieceType) {
        return this.pieceTypeMap.get(pieceType).get(colour);
    }
}
