package chess;

import javafx.scene.image.ImageView;

public class Knight extends Figure {

    public Knight(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {

        return (toX == fromX + 2 && toY == fromY - 1) || (toX == fromX + 2 && toY == fromY + 1) || (toX == fromX - 2 && toY == fromY + 1) || (toX == fromX - 2 && toY == fromY - 1) || (toX == fromX + 1 && toY == fromY + 2) || (toX == fromX + 1 && toY == fromY - 2) || (toX == fromX - 1 && toY == fromY + 2) || (toX == fromX - 1 && toY == fromY - 2);
    }
}
