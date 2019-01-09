package chess;

import javafx.scene.image.ImageView;

public class Queen extends Figure {

    public Queen(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {

        boolean valid = false;

        for (int x = 1; x < 8; x++) {
            valid = (toX == (fromX + x) && toY == (fromY + x)) || (toX == (fromX - x) && toY == (fromY - x)) || (toX == (fromX + x) && toY == (fromY - x)) || (toX == (fromX - x) && toY == (fromY + x));
            if (valid) break;
        }
        return valid || (fromX.equals(toX) && !fromY.equals(toY)) || (!fromX.equals(toX) && fromY.equals(toY));
    }
}
