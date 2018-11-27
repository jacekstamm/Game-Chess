package chess;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

class Board {

    private GridPane chessBoardPane = new GridPane();

    public GridPane chessBoardDisplay() {

        for(int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if ((x + y) % 2 != 0) {
                    ImageView darkA = new ImageView("file/BrownDark.png");
                    GridPane.setConstraints(darkA, x, y);
                    chessBoardPane.getChildren().add(darkA);
                } else {
                    ImageView lightA = new ImageView("file/BrownLight.png");
                    GridPane.setConstraints(lightA, x, y);
                    chessBoardPane.getChildren().add(lightA);
                }
            }
        }
        return chessBoardPane;
    }
}