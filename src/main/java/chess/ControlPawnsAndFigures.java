package chess;

import javafx.scene.image.ImageView;

public class ControlPawnsAndFigures {

    public Figure[][] move(Figure[][] boardStatus, Integer fromX, Integer fromY, Integer toX, Integer toY) {

        if ("Null" == boardStatus[toX][toX].getName()) {
            Figure movedFigure = boardStatus[fromX][fromY];
            boardStatus[fromX][fromY] = boardStatus[toX][toY];
            boardStatus[toX][toY] = movedFigure;
        } else if (boardStatus[fromX][fromY].getPlayer() != boardStatus[toX][toY].getPlayer()){
            Figure clashedFigure = boardStatus[fromX][fromY];
            boardStatus[fromX][fromY] = new Figure("Null", new ImageView("file/Blank_square.svg.png"), 0);
            boardStatus[toX][toY] = clashedFigure;
        }
        return  boardStatus;
    }
}