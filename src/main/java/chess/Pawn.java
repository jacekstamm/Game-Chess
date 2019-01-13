package chess;

import javafx.scene.image.ImageView;

public class Pawn extends Figure {


    public Pawn(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {

        PawnsAndFigure pawnsAndFigure = new PawnsAndFigure();
        final Figure[][] boardStatus = pawnsAndFigure.getBoardStatus();

        boolean valid = false;
        int player = boardStatus[fromX][fromY].getPlayer();

        if (player == 1) {
            valid = (toX == (fromX + 1) && toY.equals(fromY)) || (toX == (fromX + 2) && toY.equals(fromY));
        } if (player == 2) {
            valid = (toX == (fromX - 1) && toY.equals(fromY)) || (toX == (fromX - 2) && toY.equals(fromY));
        }

        return valid;
    }
}