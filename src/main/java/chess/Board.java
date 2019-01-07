package chess;

import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

class Board {
    private GridPane chessBoardPane = new GridPane();
    private TextField fromX = new TextField();
    private TextField fromY = new TextField();
    private TextField toX = new TextField();
    private TextField toY = new TextField();

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
                //System.out.println("X: " + x + ", Y: " + y + " " + boardStatus[x][y].getName());
                GridPane.setConstraints(boardStatus[y][x].getImage(), x, y);
                chessBoardPane.getChildren().addAll(boardStatus[y][x].getImage());
            }
        }

        fromX.setPromptText("From X");
        fromX.setPrefWidth(70);
        GridPane.setConstraints(fromX, 8, 5);

        fromY.setPromptText("From Y");
        fromY.setPrefWidth(70);
        GridPane.setConstraints(fromY, 9, 5);

        toX.setPromptText("To X");
        toX.setPrefWidth(70);
        GridPane.setConstraints(toX, 8, 6);

        toY.setPromptText("To Y");
        toY.setPrefWidth(70);
        GridPane.setConstraints(toY, 9, 6);
        chessBoardPane.getChildren().addAll(fromX, fromY, toX, toY);

        return chessBoardPane;
    }

    public TextField getFromX() {
        return fromX;
    }

    public TextField getFromY() {
        return fromY;
    }

    public TextField getToX() {
        return toX;
    }

    public TextField getToY() {
        return toY;
    }
}