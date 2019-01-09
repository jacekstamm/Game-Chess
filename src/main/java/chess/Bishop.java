package chess;

import javafx.scene.image.ImageView;

public class Bishop extends Figure {

    public Bishop(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {
        boolean valid = false;

        for (int x = 1; x < 8; x++) {
            valid = (toX == (fromX + x) && toY == (fromY + x)) || (toX == (fromX - x) && toY == (fromY - x)) || (toX == (fromX + x) && toY == (fromY - x)) || (toX == (fromX - x) && toY == (fromY + x));
            if (valid) break;
        }
        return valid;
    }
}
