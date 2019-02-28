package chess;

import javafx.scene.image.ImageView;

public class Rook extends Figure {

    public Rook(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean move = validateMove(fromX, fromY, toX, toY);
        boolean collision = validateCollision(fromX, fromY, toX, toY, currentBoardStatus);

        return move && collision;
    }

    private boolean validateCollision(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean valid = false;
        int differenceX = Math.abs(fromX - toX);
        int differenceY = Math.abs(fromY - toY);

        for (int x = 0; x < differenceX; x++) {
            for (int y = 0; y < differenceY; y++) {

            }
        }
        return valid;
    }

    private boolean validateMove(Integer fromX, Integer fromY, Integer toX, Integer toY) {

        return (fromX.equals(toX) && !fromY.equals(toY)) || (!fromX.equals(toX) && fromY.equals(toY));
    }
}
