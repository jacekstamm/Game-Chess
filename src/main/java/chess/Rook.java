package chess;

import javafx.scene.image.ImageView;

public class Rook extends Figure {

    public Rook(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {

        return (fromX.equals(toX) && !fromY.equals(toY)) || (!fromX.equals(toX) && fromY.equals(toY));
    }

    public boolean validateCollision() {

        return false;
    }
}
