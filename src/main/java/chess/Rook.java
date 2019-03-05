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

    private boolean validateMove(Integer fromX, Integer fromY, Integer toX, Integer toY) {

        return (fromX.equals(toX) && !fromY.equals(toY)) || (!fromX.equals(toX) && fromY.equals(toY));
    }

    private boolean validateCollision(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean valid = false;
        int different;

        if (fromX.equals(toX)) {
            different = Math.abs(fromY - toY);
        } else {
            different = Math.abs(fromX - toX);
        }

        for (int x = 0; x < different; x++) {
            if (fromX.equals(toX) && fromY < toY) {
                if (!currentBoardStatus[toX][fromY + x].getName().equals("Null")) {
                    valid = true;
                    break;
                }
            }
            if (fromX.equals(toX) && fromY > toY) {
                if (!currentBoardStatus[toX][fromY - x].getName().equals("Null")) {
                    valid = true;
                    break;
                }
            }
            if (fromX > toX && fromY.equals(toY)) {
                if (!currentBoardStatus[fromX - x][toY].getName().equals("Null")) {
                    valid = true;
                    break;
                }
            }
            if (fromX < toX && fromY.equals(toY)) {
                if (!currentBoardStatus[fromX + x][toY].getName().equals("Null")) {
                    valid = true;
                    break;
                }
            }
        }
        return valid;
    }
}