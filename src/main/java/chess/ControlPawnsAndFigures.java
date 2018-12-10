package chess;

public class ControlPawnsAndFigures {

    public Figure[][] move(Figure[][] boardStatus, Integer fromX, Integer fromY, Integer toX, Integer toY) {
        Figure movedFigure = boardStatus[fromX][fromY];
        boardStatus[fromX][fromY] = null;
        boardStatus[toX][toY] = movedFigure;

        return  boardStatus;
    }
}