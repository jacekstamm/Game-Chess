package chess;

import javafx.scene.image.ImageView;

public class Bishop extends Figure {

    PawnsAndFigure pawnsAndFigure;

    public Bishop(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY) {
        boolean valid = false;
        int player = getPlayer();

        for (int x = 1; x < 8; x++) {
            if (player == 1) {
                valid = (toX == (fromX + x) && toY == (fromY + x)) || (toX == (fromX - x) && toY == (fromY - x)) || (toX == (fromX + x) && toY == (fromY - x)) || (toX == (fromX - x) && toY == (fromY + x));
                if (valid) break;
            } else if (player == 2) {
                valid = (toX == (fromX + x) && toY == (fromY + x)) || (toX == (fromX - x) && toY == (fromY - x)) || (toX == (fromX + x) && toY == (fromY - x)) || (toX == (fromX - x) && toY == (fromY + x));
                if (valid) break;
            }
        }
        return valid;
    }

    public boolean validateCollision(Integer fromX, Integer fromY, Integer toX, Integer toY) {
        boolean valid = false;
        Figure[][] boardStatus = pawnsAndFigure.getBoardStatus();


        for (int x = 1; x < 8; x++) {
            Figure finish = boardStatus[fromX + x][fromY + x];

        }

        return valid;
    }
}
