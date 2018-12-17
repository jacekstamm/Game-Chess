package chess;

public class ControlPawnsAndFigures {

    public Figure[][] move(Figure[][] boardStatus, Integer fromX, Integer fromY, Integer toX, Integer toY) {
        Figure movedFigure = boardStatus[fromX][fromY];
        //System.out.println("Move " + boardStatus[fromX][fromY].getName() + " from: " + fromX + " " + fromY);
        boardStatus[fromX][fromY] = boardStatus[toX][toY];
        boardStatus[toX][toY] = movedFigure;
        //System.out.println("After move on " + fromX + " " + fromY + " is figure: " + boardStatus[fromX][fromY].getName());
        //System.out.println(boardStatus[toX][toY].getName() + " goes to:  " + toX + " " + toY);
        return  boardStatus;
    }
}