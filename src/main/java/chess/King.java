package chess;

import javafx.scene.image.ImageView;

public class King extends Figure {

    public King(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {

        return (toX == fromX + 1 && toY.equals(fromY)) || (toX == fromX - 1 && toY.equals(fromY)) || (toX.equals(fromX) && toY == fromY + 1) || (toX.equals(fromX) && toY == fromY - 1) || (toX == fromX + 1 && toY == fromY + 1) || (toX == fromX + 1 && toY == fromY - 1) || (toX == fromX - 1 && toY == fromY + 1) || (toX == fromX - 1 && toY == fromY - 1);

    }
}
