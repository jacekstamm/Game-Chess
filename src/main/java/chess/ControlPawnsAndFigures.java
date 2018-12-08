package chess;

import javafx.scene.layout.GridPane;

public class ControlPawnsAndFigures {
    private Board board = new Board();
    private GridPane moveGrid = board.getChessBoardPane();

    public Figure[][] move(Figure[][] boardStatus, Integer fromX, Integer fromY, Integer toX, Integer toY) {
        Figure movedFigure = boardStatus[fromX][fromY];
        boardStatus[fromX][fromY] = null;
        boardStatus[toX][toY] = movedFigure;

        return  boardStatus;
    }

    public GridPane getMoveGrid() {
        return moveGrid;
    }
}