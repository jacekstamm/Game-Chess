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
                PawnsAndFigure pawnsAndFigure = new PawnsAndFigure();
                pawnsAndFigure.getBoardStatus();
                GridPane.setConstraints(boardStatus[8][8], x, y);
                chessBoardPane.getChildren().add(boardStatus[x][y]);
            }
        }
        return chessBoardPane;
    }

    public GridPane getChessBoardPane() {
        return chessBoardPane;
    }
}