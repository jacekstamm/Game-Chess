package chess;

import javafx.scene.image.ImageView;

public class PawnsAndFigure {
    private Figure[][] boardStatus = new Figure[8][8];

    public PawnsAndFigure() {
        pawnsAndFiguresDisplay();
    }

    public void pawnsAndFiguresDisplay() {

        boardStatus[0][0] = new Rook("Rook", new ImageView("file/RookBlack.png"), 1);
        boardStatus[0][1] = new Knight("Knight", new ImageView("file/KnightBlack.png"), 1);
        boardStatus[0][2] = new Bishop("Bishop", new ImageView("file/BishopBlack.png"), 1);
        boardStatus[0][3] = new Queen("Queen", new ImageView("file/QueenBlack.png"), 1);
        boardStatus[0][4] = new King("King", new ImageView("file/KingBlack.png"), 1);
        boardStatus[0][5] = new Bishop("Bishop", new ImageView("file/BishopBlack.png"), 1);
        boardStatus[0][6] = new Knight("Knight", new ImageView("file/KnightBlack.png"), 1);
        boardStatus[0][7] = new Rook("Rook", new ImageView("file/RookBlack.png"), 1);

        for (int x = 0; x < 8; x++) {
            boardStatus[1][x] = new Pawn("Pawn", new ImageView("file/PawnBlack.png"), 1);
        }
        for (int x = 0; x < 8; x++) {
            for (int y = 2; y < 6; y++) {
                boardStatus[y][x] = new Null("Null", new ImageView("file/Blank_square.svg.png"), 0);
            }
        }
        for (int x = 0; x < 8; x++) {
            boardStatus[6][x] = new Pawn("Pawn", new ImageView("file/PawnWhite.png"), 2);
        }

        boardStatus[7][0] = new Rook("Rook", new ImageView("file/RookWhite.png"), 2);
        boardStatus[7][1] = new Knight("Knight", new ImageView("file/KnightWhite.png"), 2);
        boardStatus[7][2] = new Bishop("Bishop", new ImageView("file/BishopWhite.png"), 2);
        boardStatus[7][3] = new Queen("Queen" , new ImageView("file/QueenWhite.png"), 2);
        boardStatus[7][4] = new King("King", new ImageView("file/KingWhite.png"), 2);
        boardStatus[7][5] = new Bishop("Bishop", new ImageView("file/BishopWhite.png"), 2);
        boardStatus[7][6] = new Knight("Knight", new ImageView("file/KnightWhite.png"), 2);
        boardStatus[7][7] = new Rook("Rook", new ImageView("file/RookWhite.png"),2);
    }

    public Figure[][] getBoardStatus() {
        return boardStatus;
    }

    public void setBoardStatus(Figure[][] boardStatus) {
        this.boardStatus = boardStatus;
    }
}