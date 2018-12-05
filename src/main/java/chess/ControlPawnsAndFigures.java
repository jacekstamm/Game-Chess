package chess;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ControlPawnsAndFigures {
    private Board board = new Board();
    private PawnsAndFigure pawnsAndFigure = new PawnsAndFigure();

    public GridPane move(int fromX, int fromY, int toX, int toY) {

        GridPane moveGrid = board.getChessBoardPane();

        ImageView[][] moveImage = pawnsAndFigure.getBoardStatus();
        moveImage[0][0] = new ImageView();

        GridPane.setConstraints(moveImage[0][0], toX, toY);
        moveGrid.getChildren().add(moveImage[0][0]);

        return moveGrid;
    }
}