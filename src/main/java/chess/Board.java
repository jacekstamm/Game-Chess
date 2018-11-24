package chess;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

class Board {

    GridPane gridpane = new GridPane();

    public GridPane chessBoardDisplay() {

        // Column A
        ImageView a1 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(a1, 0, 7);
        ImageView a2 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(a2, 0, 6);
        ImageView a3 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(a3, 0, 5);
        ImageView a4 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(a4, 0, 4);
        ImageView a5 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(a5, 0, 3);
        ImageView a6 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(a6, 0, 2);
        ImageView a7 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(a7, 0, 1);
        ImageView a8 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(a8, 0, 0);

        //Column B
        ImageView b1 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(b1, 1, 7);
        ImageView b2 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(b2, 1, 6);
        ImageView b3 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(b3, 1, 5);
        ImageView b4 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(b4, 1, 4);
        ImageView b5 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(b5, 1, 3);
        ImageView b6 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(b6, 1, 2);
        ImageView b7 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(b7, 1, 1);
        ImageView b8 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(b8, 1, 0);

        //Column C
        ImageView c1 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(c1, 2, 7);
        ImageView c2 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(c2, 2, 6);
        ImageView c3 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(c3, 2, 5);
        ImageView c4 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(c4, 2, 4);
        ImageView c5 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(c5, 2, 3);
        ImageView c6 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(c6, 2, 2);
        ImageView c7 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(c7, 2, 1);
        ImageView c8 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(c8, 2, 0);

        //Column D
        ImageView d1 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(d1, 3, 7);
        ImageView d2 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(d2, 3, 6);
        ImageView d3 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(d3, 3, 5);
        ImageView d4 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(d4, 3, 4);
        ImageView d5 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(d5, 3, 3);
        ImageView d6 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(d6, 3, 2);
        ImageView d7 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(d7, 3, 1);
        ImageView d8 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(d8, 3, 0);

        //Column E
        ImageView e1 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(e1, 4, 7);
        ImageView e2 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(e2, 4, 6);
        ImageView e3 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(e3, 4, 5);
        ImageView e4 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(e4, 4, 4);
        ImageView e5 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(e5, 4, 3);
        ImageView e6 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(e6, 4, 2);
        ImageView e7 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(e7, 4, 1);
        ImageView e8 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(e8, 4, 0);

        //Column F
        ImageView f1 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(f1, 5, 7);
        ImageView f2 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(f2, 5, 6);
        ImageView f3 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(f3, 5, 5);
        ImageView f4 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(f4, 5, 4);
        ImageView f5 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(f5, 5, 3);
        ImageView f6 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(f6, 5, 2);
        ImageView f7 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(f7, 5, 1);
        ImageView f8 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(f8, 5, 0);

        //Column G
        ImageView g1 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(g1, 6, 7);
        ImageView g2 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(g2, 6, 6);
        ImageView g3 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(g3, 6, 5);
        ImageView g4 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(g4, 6, 4);
        ImageView g5 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(g5, 6, 3);
        ImageView g6 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(g6, 6, 2);
        ImageView g7 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(g7, 6, 1);
        ImageView g8 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(g8, 6, 0);

        //Column H
        ImageView h1 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(h1, 7, 7);
        ImageView h2 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(h2, 7, 6);
        ImageView h3 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(h3, 7, 5);
        ImageView h4 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(h4, 7, 4);
        ImageView h5 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(h5, 7, 3);
        ImageView h6 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(h6, 7, 2);
        ImageView h7 = new ImageView("file/BrownLight.png");
        GridPane.setConstraints(h7, 7, 1);
        ImageView h8 = new ImageView("file/BrownDark.png");
        GridPane.setConstraints(h8, 7, 0);

        gridpane.getChildren().setAll(a1, a2, a3, a4, a5, a6, a7, a8, b1, b2, b3, b4, b5, b6, b7, b8, c1, c2, c3, c4, c5, c6, c7, c8, d1, d2, d3, d4, d5, d6,
                d7, d8, e1, e2, e3, e4, e5, e6, e7, e8, f1, f2, f3, f4, f5, f6, f7, f8, g1, g2, g3, g4, g5, g6, g7, g8, h1, h2, h3, h4, h5, h6, h7, h8);

        return gridpane;
    }
}