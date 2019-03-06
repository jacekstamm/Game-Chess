package chess;

import javafx.scene.image.ImageView;

public class Queen extends Figure {

    public Queen(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean move = validateMove(fromX, fromY, toX, toY);
        boolean collision = validateCollision(fromX, fromY, toX, toY, currentBoardStatus);

        return move && collision;
    }

    private boolean validateMove(Integer fromX, Integer fromY, Integer toX, Integer toY) {
        boolean valid = false;

        for (int x = 1; x < 8; x++) {
            valid = (toX == (fromX + x) && toY == (fromY + x)) || (toX == (fromX - x) && toY == (fromY - x)) || (toX == (fromX + x) && toY == (fromY - x)) || (toX == (fromX - x) && toY == (fromY + x));

            if (valid) break;
        }
        return valid || (fromX.equals(toX) && !fromY.equals(toY)) || (!fromX.equals(toX) && fromY.equals(toY));
    }

    private boolean validateCollision(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean valid = false;

        for (int x = 0; x < 8; x++) {
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
            if (fromX < toX && fromY < toY) {
                if (!currentBoardStatus[fromX + x][fromY + x].getName().equals("Null")) {
                    valid = true;
                    break;
                }
            }
            if (fromX < toX && fromY > toY) {
                if (!currentBoardStatus[fromX + x][fromY - x].getName().equals("Null")) {
                    valid = true;
                    break;
                }
            }
            if (fromX > toX && fromY < toY) {
                if (!currentBoardStatus[fromX - x][fromY + x].getName().equals("Null")) {
                    valid = true;
                    break;
                }
            }
            if (fromX > toX && fromY > toY) {
                if (!currentBoardStatus[fromX - x][fromY - x].getName().equals("Null")) {
                    valid = true;
                    break;
                }
            }
        }
        return valid;
    }
}
