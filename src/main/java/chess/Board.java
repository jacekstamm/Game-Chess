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
                System.out.println("X spot: " + x + " Y spot: " + y);
                GridPane.setConstraints(boardStatus[x][y].getImage(), y, x);
                chessBoardPane.getChildren().addAll(boardStatus[x][y].getImage());
                System.out.println(boardStatus[x][y].getName());
            }
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
}