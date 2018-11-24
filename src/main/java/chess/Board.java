package chess;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;



class Board {

    Image brownLight = new Image("file/BrownLight.png");
    Image brownDark = new Image("file/BrownDark.png");

    public GridPane chessBoardDisplay() {

        ImageView a1 = new ImageView();
        a1.setImage(brownDark);

        ImageView a2 = new ImageView();
        a2.setImage(brownLight);

        ImageView a3 = new ImageView();
        a3.setImage(brownDark);

        ImageView a4 = new ImageView();
        a4.setImage(brownLight);

        ImageView a5 = new ImageView();
        a5.setImage(brownDark);

        ImageView a6 = new ImageView();
        a6.setImage(brownLight);

        ImageView a7 = new ImageView();
        a7.setImage(brownDark);

        GridPane grid = new GridPane();

        GridPane.setConstraints(a1, 0, 0);
        GridPane.setConstraints(a2, 1, 0);
        GridPane.setConstraints(a3, 2, 0);
        GridPane.setConstraints(a4, 0, 1);
        GridPane.setConstraints(a5, 1, 1);
        GridPane.setConstraints(a6, 2, 1);

        grid.getChildren().setAll(a1, a2, a3, a4, a5, a6);

        return grid;
    }
}

