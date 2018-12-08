package chess;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

class Board {
    public GridPane chessBoardPane = new GridPane();

    public GridPane chessBoardDisplay(Figure[][] boardStatus) {

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
            GridPane.setConstraints(boardStatus[0][x].getImage(), x, 0);
            chessBoardPane.getChildren().add(boardStatus[0][x].getImage());
            //Black Pawns
            GridPane.setConstraints(boardStatus[1][x].getImage(), x, 1);
            chessBoardPane.getChildren().add(boardStatus[1][x].getImage());
            //White Pawns
            GridPane.setConstraints(boardStatus[6][x].getImage(), x, 6);
            chessBoardPane.getChildren().add(boardStatus[6][x].getImage());
            //White Figures
            GridPane.setConstraints(boardStatus[7][x].getImage(), x, 7);
            chessBoardPane.getChildren().add(boardStatus[7][x].getImage());
        }

        TextField moveFromField = new TextField();
        moveFromField.setPromptText("Move from...");
        GridPane.setConstraints(moveFromField, 8, 5);

        TextField moveToField = new TextField();
        moveToField.setPromptText("Move to...");
        GridPane.setConstraints(moveToField, 8, 6);

        Button moveButton = new Button("Move");
        GridPane.setConstraints(moveButton, 8, 7);

        chessBoardPane.getChildren().addAll(moveFromField, moveToField, moveButton);



        return chessBoardPane;
    }

    public GridPane getChessBoardPane() {
        return chessBoardPane;
    }

}