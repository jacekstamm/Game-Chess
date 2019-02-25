package chess;

import javafx.scene.image.ImageView;

public class Bishop extends Figure {

    public Bishop(String name, ImageView image, int player) {
        super(name, image, player);
    }

    public boolean validate(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean move = validateMove(fromX, fromY, toX, toY);
        boolean collision = validateCollision(fromX, fromY, toX, toY, currentBoardStatus);

        return move && collision;
    }

    private boolean validateMove(Integer fromX, Integer fromY, Integer toX, Integer toY) {
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

    private boolean validateCollision(Integer fromX, Integer fromY, Integer toX, Integer toY, Figure[][] currentBoardStatus) {
        boolean valid = false;
        int differenceX = Math.abs(fromX - toX);
        int differenceY = Math.abs(fromY - toY);

        for (int x = 1; x < differenceX; x++) {
            for (int y = 1; y < differenceY; y++) {
                if (fromX < toX && fromY < toY) {
                    if (!currentBoardStatus[fromX - x][fromY - y].getName().equals("Null")) {
                        PopUpCoordinates.display("User Error", "Wrong move. Please try again");
                        break;
                    }
                }
                if (fromX < toX && fromY > toY) {
                    if (!currentBoardStatus[fromX - x][fromY + y].getName().equals("Null")) {
                        PopUpCoordinates.display("User Error", "Wrong move. Please try again");
                        break;
                    }
                }
                if (fromX > toX && fromY < toY) {
                    if (!currentBoardStatus[fromX + x][fromY - y].getName().equals("Null")) {
                        PopUpCoordinates.display("User Error", "Wrong move. Please try again");
                        break;
                    }
                }
                if (fromX > toX && fromY > toY) {
                    if (!currentBoardStatus[fromX + x][fromY + y].getName().equals("Null")) {
                        PopUpCoordinates.display("User Error", "Wrong move. Please try again");
                        break;
                    }
                } else valid = true;
            }
        }
        return valid;
    }
}