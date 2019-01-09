package chess;

import javafx.scene.image.ImageView;

public class Pawn extends Figure {

    Figure figure;

    public Pawn(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {

        boolean valid = false;

        if (figure.getPlayer() == 1) {
            valid = (toX == (fromX + 1) && toY.equals(fromY)) || (toX == (fromX + 2) && toY.equals(fromY));
        } if (figure.getPlayer() == 2) {
            valid = (toX == (fromX - 1) && toY.equals(fromY)) || (toX == (fromX - 2) && toY.equals(fromY));
        }
        return valid;
    }
}
