package chess;

import javafx.scene.image.ImageView;

public class Pawn extends Figure {

    public Pawn(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {

        boolean valid = false;
        int player = getPlayer();

        if (player == 1) {
            valid = (toX == (fromX + 1) && toY.equals(fromY));
        } if (player == 2) {
            valid = (toX == (fromX - 1) && toY.equals(fromY));
        }
        return valid;
    }

    public boolean validateCollision() {
        boolean valid = false;

        return valid;
    }
}