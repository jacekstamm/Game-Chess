package chess;

import javafx.scene.image.ImageView;

public class Pawn extends Figure {

    Figure figure;

    public Pawn(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {

        if (figure.getPlayer() == 1) {
            return (toX == (fromX + 1) || toX == (fromX + 2)) && toY.equals(fromY);
        } else if (figure.getPlayer() == 2) {
            return (toX == (fromX - 1) || toX == (fromX + 2)) && toY.equals(fromY);
        }
        return false;
    }
}
