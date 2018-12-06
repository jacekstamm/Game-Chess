package chess;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ControlPawnsAndFigures {
    private Board board = new Board();
    private PawnsAndFigure pawnsAndFigure = new PawnsAndFigure();

    public GridPane move(int fromX, int fromY, int toX, int toY) {

        GridPane moveGrid = board.getChessBoardPane();
        ImageView[][] moveImage = pawnsAndFigure.getBoardStatus();
        ImageView newImage = moveImage[toX][toY];
        moveGrid.getChildren().remove(moveImage[fromX][fromY]);
        GridPane.setConstraints(newImage, toX, toY);
        moveGrid.getChildren().add(moveImage[toX][toY]);


        GridPane chessBoardMove = board.getChessBoardPane();

        return chessBoardMove;
    }
}