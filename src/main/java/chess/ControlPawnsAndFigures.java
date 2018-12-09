package chess;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ControlPawnsAndFigures {
    private Board board = new Board();
    private GridPane moveGrid = board.getChessBoardPane();


    public Figure[][] move(Figure[][] boardStatus, Integer fromX, Integer fromY, Integer toX, Integer toY) {
        Figure movedFigure = boardStatus[fromX][fromY];
        boardStatus[fromX][fromY] = new Figure("null", new ImageView("file/Blank_square.svg.png"));
        boardStatus[toX][toY] = movedFigure;

        return  boardStatus;
    }

    public GridPane getMoveGrid() {
        return moveGrid;
    }
}