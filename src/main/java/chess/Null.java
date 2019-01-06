package chess;

import javafx.scene.image.ImageView;

public class Null extends Figure {

    public Null(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {
        return false;
    }
}
