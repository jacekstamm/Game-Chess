package chess;

import javafx.scene.image.ImageView;

public class ControlPawnsAndFigures {

    ChessGame chessGame = new ChessGame();

    public Figure[][] move(Figure[][] boardStatus, Integer fromX, Integer fromY, Integer toX, Integer toY) {

        if (chessGame.isPlayerWhiteMove()) {
            if (boardStatus[fromX][fromY].getPlayer() == 2) {
                movingFigures(boardStatus, fromX, fromY, toX, toY);
            } else {
                PopUpCoordinates.display("User Error", "It's WHITE Player move. Please move white pieces only.");
            }
        } else if (boardStatus[fromX][fromY].getPlayer() == 1) {
            movingFigures(boardStatus, fromX, fromY, toX, toY);
            chessGame.setPlayerWhiteMove(true);
        } else {
            PopUpCoordinates.display("User Error!", "It's BLACK Player move. Please move black pieces only.");
        }
        return  boardStatus;
    }

    private void movingFigures(Figure[][] boardStatus, Integer fromX, Integer fromY, Integer toX, Integer toY) {
        if ("Null" == boardStatus[toX][toY].getName()) {
            Figure movedFigure = boardStatus[fromX][fromY];
            boardStatus[fromX][fromY] = boardStatus[toX][toY];
            boardStatus[toX][toY] = movedFigure;
            chessGame.setPlayerWhiteMove(false);
        } else if (boardStatus[fromX][fromY].getPlayer() != boardStatus[toX][toY].getPlayer() && boardStatus[fromX][fromY].getPlayer() != 0) {
            Figure clashedFigure = boardStatus[fromX][fromY];
            boardStatus[fromX][fromY] = new Null("Null", new ImageView("file/Blank_square.svg.png"), 0);
            boardStatus[toX][toY] = clashedFigure;
            chessGame.setPlayerWhiteMove(false);
        }
    }
}