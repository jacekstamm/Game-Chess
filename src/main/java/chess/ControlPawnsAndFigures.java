package chess;

import javafx.scene.image.ImageView;

public class ControlPawnsAndFigures {

    ChessGame chessGame = new ChessGame();
    ComputerAI computerAI = new ComputerAI();


    public Figure[][] move(Figure[][] boardStatus, Integer fromX, Integer fromY, Integer toX, Integer toY) {

        if (chessGame.isPlayerWhiteMove()) {
            if (boardStatus[fromX][fromY].getPlayer() == 2) {
                //    ???
            } else {
                PopUpCoordinates.display("User Error", "No possibility of moving black pieces");
            }
        } else {
            computerAI.computerMove();
        }



        if ("Null" == boardStatus[toX][toY].getName()) {
            Figure movedFigure = boardStatus[fromX][fromY];
            boardStatus[fromX][fromY] = boardStatus[toX][toY];
            boardStatus[toX][toY] = movedFigure;
        } else if (boardStatus[fromX][fromY].getPlayer() != boardStatus[toX][toY].getPlayer() && boardStatus[fromX][fromY].getPlayer() != 0){
            Figure clashedFigure = boardStatus[fromX][fromY];
            boardStatus[fromX][fromY] = new Null("Null", new ImageView("file/Blank_square.svg.png"), 0);
            boardStatus[toX][toY] = clashedFigure;
        }
        return  boardStatus;
    }
}