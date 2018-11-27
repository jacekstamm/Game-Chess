package chess;

import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Pawns {

    private Board board = new Board();



    public GridPane pawnsDisplay() {
        GridPane pawnPane;
        pawnPane = board.getChessBoardPane();

        for (int x = 1; x < 8; x++) {
            ImageView blackPawn = new ImageView("file/Pawn Black.png");
            GridPane.setConstraints(blackPawn, x, 1);
            pawnPane.getChildren().add(blackPawn);
        }
        return pawnPane;
    }
}
