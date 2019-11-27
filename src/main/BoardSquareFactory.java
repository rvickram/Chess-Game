package main;

import javafx.scene.image.Image;

import java.util.HashMap;

class BoardSquareFactory {
    enum BoardColour { BLACK, WHITE }

    private static HashMap<BoardColour, Image> rectangleHashMap = new HashMap<>(5);

    static Image getBoardSquare(final BoardColour colour) {
        if (!rectangleHashMap.containsKey(BoardColour.WHITE))
            rectangleHashMap.put(BoardColour.WHITE, new Image(Main.class.getClassLoader().getResourceAsStream("images/WhiteBlock.png")));
        if (!rectangleHashMap.containsKey(BoardColour.BLACK))
            rectangleHashMap.put(BoardColour.BLACK, new Image(Main.class.getClassLoader().getResourceAsStream("images/BlackBlock.png")));

        return rectangleHashMap.get(colour);
    }
}
