package chess;

import javafx.scene.image.ImageView;

public class Pawn extends Figure {

    public Pawn(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean move = validateMove(fromX, fromY, toX, toY, currentBoardStatus);
        boolean strike = validateStrike(fromX, fromY, toX, toY, currentBoardStatus);

        if (move) {
            return true;
        }
        return strike;
    }

    private boolean validateMove(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean valid = false;
        int player = getPlayer();

        if (player == 1) {
            valid = ((toX == (fromX + 1) && toY.equals(fromY)) && currentBoardStatus[toX][toY].getPlayer() != 2);
        } if (player == 2) {
            valid = ((toX == (fromX - 1) && toY.equals(fromY)) && currentBoardStatus[toX][toY].getPlayer() != 1);
        }
        return valid;
    }

    private boolean validateStrike(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean valid = false;
        if ((currentBoardStatus[fromX][fromY].getPlayer() == 1) && (currentBoardStatus[toX][toY].getPlayer() == 2) && ((fromX + 1) == toX)) {
            valid = true;
        } else if ((currentBoardStatus[fromX][fromY].getPlayer() == 2) && (currentBoardStatus[toX][toY].getPlayer() == 1) && ((fromX - 1) == toX)) {
            valid = true;
        }
        return valid;
    }
}

