package chess;

import javafx.scene.image.ImageView;

public class Queen extends Figure {

    public Queen(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {

        // Poruszanie się po prostych.
        // (fromX.equals(toX) && !fromY.equals(toY)) || (!fromX.equals(toX) && fromY.equals(toY));







        return false;
    }
}
