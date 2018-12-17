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
                GridPane.setConstraints(boardStatus[y][x].getImage(), x, y);
                chessBoardPane.getChildren().addAll(boardStatus[y][x].getImage());
                System.out.println(boardStatus[y][x].getName());
            }
        }

        TextField fromX = new TextField();
        fromX.setPromptText("From X");
        fromX.setPrefWidth(70);
        GridPane.setConstraints(fromX, 8, 5);
        TextField fromY = new TextField();
        fromY.setPromptText("From Y");
        fromY.setPrefWidth(70);
        GridPane.setConstraints(fromY, 9, 5);

        TextField toX = new TextField();
        toX.setPromptText("To X");
        toX.setPrefWidth(70);
        GridPane.setConstraints(toX, 8, 6);
        TextField toY = new TextField();
        toY.setPromptText("To Y");
        toY.setPrefWidth(70);
        GridPane.setConstraints(toY, 9, 6);

        Button moveButton = new Button("Move");
        moveButton.setPrefWidth(70);
        moveButton.setOnAction(e -> {

        });
        GridPane.setConstraints(moveButton, 8, 7);

        chessBoardPane.getChildren().addAll(fromX, fromY, toX, toY, moveButton);

        return chessBoardPane;
    }
}