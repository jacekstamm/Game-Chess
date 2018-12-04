package chess;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

class Board {
    public GridPane chessBoardPane = new GridPane();

    public GridPane chessBoardDisplay(ImageView[][] boardStatus) {

        for(int x = 0; x < 8; x++) {
            for(int y = 0; y < 8; y++) {
                if ((x + y) % 2 != 0) {
                    ImageView darkSquare = new ImageView("file/BrownDark.png");
                    GridPane.setConstraints(darkSquare, x, y);
                    chessBoardPane.getChildren().add(darkSquare);
                } else {
                    ImageView lightSquare = new ImageView("file/BrownLight.png");
                    GridPane.setConstraints(lightSquare, x, y);
                    chessBoardPane.getChildren().add(lightSquare);
                }
            }
            //Black Figures
            GridPane.setConstraints(boardStatus[0][x], x, 0);
            chessBoardPane.getChildren().add(boardStatus[0][x]);
            //Black Pawns
            GridPane.setConstraints(boardStatus[1][x], x, 1);
            chessBoardPane.getChildren().add(boardStatus[1][x]);
            //White Pawns
            GridPane.setConstraints(boardStatus[6][x], x, 6);
            chessBoardPane.getChildren().add(boardStatus[6][x]);
            //White Figures
            GridPane.setConstraints(boardStatus[7][x], x, 7);
            chessBoardPane.getChildren().add(boardStatus[7][x]);
        }
        return chessBoardPane;
    }

    public GridPane getChessBoardPane() {
        return chessBoardPane;
    }
}