package chess;

import javafx.scene.image.ImageView;

public class PawnsAndFigure {
    private Figure[][] boardStatus = new Figure[8][8];

    public PawnsAndFigure() {
        pawnsAndFiguresDisplay();
    }

    public void pawnsAndFiguresDisplay() {

        boardStatus[0][0] = new Figure("Black Rook", new ImageView("file/Rook Black.png"));
        boardStatus[0][1] = new Figure("Black Knight", new ImageView("file/Knight Black.png"));
        boardStatus[0][2] = new Figure("Black Bishop", new ImageView("file/Bishop Black.png"));
        boardStatus[0][3] = new Figure("Black Queen", new ImageView("file/Queen Black.png"));
        boardStatus[0][4] = new Figure("Black King", new ImageView("file/King Black.png"));
        boardStatus[0][5] = new Figure("Black Bishop", new ImageView("file/Bishop Black.png"));
        boardStatus[0][6] = new Figure("Black Knight", new ImageView("file/Knight Black.png"));
        boardStatus[0][7] = new Figure("Black Rook", new ImageView("file/Rook Black.png"));
        for (int x = 0; x < 8; x++) {
            boardStatus[1][x] = new Figure("Black Pawn", new ImageView("file/Pawn Black.png"));
        }
        for (int x = 2; x < 6; x++) {
            for (int y = 0; y < 8; y++) {
                boardStatus[x][y] = new Figure("null", new ImageView("file/Blank_square.svg.png"));
            }
        }
        for (int x = 0; x < 8; x++) {
            boardStatus[6][x] = new Figure("White Pawn", new ImageView("file/Pawn White.png"));
        }
        boardStatus[7][0] = new Figure("White Rook", new ImageView("file/Rook White.png"));
        boardStatus[7][1] = new Figure("White Knight", new ImageView("file/Knight White.png"));
        boardStatus[7][2] = new Figure("White Bishop", new ImageView("file/Bishop White.png"));
        boardStatus[7][3] = new Figure("white Queen" , new ImageView("file/Queen White.png"));
        boardStatus[7][4] = new Figure("White King", new ImageView("file/King White.png"));
        boardStatus[7][5] = new Figure("White Bishop", new ImageView("file/Bishop White.png"));
        boardStatus[7][6] = new Figure("White Knight", new ImageView("file/Knight White.png"));
        boardStatus[7][7] = new Figure("White Rook", new ImageView("file/Rook White.png"));
    }

    public Figure[][] getBoardStatus() {
        return boardStatus;
    }

    public void setBoardStatus(Figure[][] boardStatus) {
        this.boardStatus = boardStatus;
    }
}