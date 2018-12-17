package chess;

import javafx.scene.image.ImageView;

public class PawnsAndFigure {
    private Figure[][] boardStatus = new Figure[8][8];

    public PawnsAndFigure() {
        pawnsAndFiguresDisplay();
    }

    public void pawnsAndFiguresDisplay() {

        boardStatus[0][0] = new Figure("Black Rook", new ImageView("file/RookBlack.png"));
        boardStatus[0][1] = new Figure("Black Knight", new ImageView("file/KnightBlack.png"));
        boardStatus[0][2] = new Figure("Black Bishop", new ImageView("file/BishopBlack.png"));
        boardStatus[0][3] = new Figure("Black Queen", new ImageView("file/QueenBlack.png"));
        boardStatus[0][4] = new Figure("Black King", new ImageView("file/KingBlack.png"));
        boardStatus[0][5] = new Figure("Black Bishop", new ImageView("file/BishopBlack.png"));
        boardStatus[0][6] = new Figure("Black Knight", new ImageView("file/KnightBlack.png"));
        boardStatus[0][7] = new Figure("Black Rook", new ImageView("file/RookBlack.png"));

        for (int x = 0; x < 8; x++) {
            boardStatus[1][x] = new Figure("Black Pawn", new ImageView("file/PawnBlack.png"));
        }
        for (int x = 0; x < 8; x++) {
            for (int y = 2; y < 6; y++) {
                boardStatus[y][x] = new Figure("Null", new ImageView("file/Blank_square.svg.png"));
            }
        }
        for (int x = 0; x < 8; x++) {
            boardStatus[6][x] = new Figure("White Pawn", new ImageView("file/PawnWhite.png"));
        }

        boardStatus[7][0] = new Figure("White Rook", new ImageView("file/RookWhite.png"));
        boardStatus[7][1] = new Figure("White Knight", new ImageView("file/KnightWhite.png"));
        boardStatus[7][2] = new Figure("White Bishop", new ImageView("file/BishopWhite.png"));
        boardStatus[7][3] = new Figure("White Queen" , new ImageView("file/QueenWhite.png"));
        boardStatus[7][4] = new Figure("White King", new ImageView("file/KingWhite.png"));
        boardStatus[7][5] = new Figure("White Bishop", new ImageView("file/BishopWhite.png"));
        boardStatus[7][6] = new Figure("White Knight", new ImageView("file/KnightWhite.png"));
        boardStatus[7][7] = new Figure("White Rook", new ImageView("file/RookWhite.png"));
    }

    public Figure[][] getBoardStatus() {
        return boardStatus;
    }

    public void setBoardStatus(Figure[][] boardStatus) {
        this.boardStatus = boardStatus;
    }
}