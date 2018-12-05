package chess;

import javafx.scene.image.ImageView;

public class PawnsAndFigure {
    private ImageView[][] boardStatus = new ImageView[8][8];

    public PawnsAndFigure() {
        pawnsAndFiguresDisplay();
    }

    public void pawnsAndFiguresDisplay() {

        boardStatus[0][0] = new ImageView("file/Rook Black.png");
        boardStatus[0][1] = new ImageView("file/Knight Black.png");
        boardStatus[0][2] = new ImageView("file/Bishop Black.png");
        boardStatus[0][3] = new ImageView("file/Queen Black.png");
        boardStatus[0][4] = new ImageView("file/King Black.png");
        boardStatus[0][5] = new ImageView("file/Bishop Black.png");
        boardStatus[0][6] = new ImageView("file/Knight Black.png");
        boardStatus[0][7] = new ImageView("file/Rook Black.png");
        for (int x = 0; x < 8; x++) {
            boardStatus[1][x] = new ImageView("file/Pawn Black.png");
        }
        for (int x = 2; x < 6; x++) {
            for (int y = 0; y < 8; y++) {
                boardStatus[x][y] = null;
            }
        }
        for (int x = 0; x < 8; x++) {
            boardStatus[6][x] = new ImageView("file/Pawn White.png");
        }
        boardStatus[7][0] = new ImageView("file/Rook White.png");
        boardStatus[7][1] = new ImageView("file/Knight White.png");
        boardStatus[7][2] = new ImageView("file/Bishop White.png");
        boardStatus[7][3] = new ImageView("file/Queen White.png");
        boardStatus[7][4] = new ImageView("file/King White.png");
        boardStatus[7][5] = new ImageView("file/Bishop White.png");
        boardStatus[7][6] = new ImageView("file/Knight White.png");
        boardStatus[7][7] = new ImageView("file/Rook White.png");
    }

    public ImageView[][] getBoardStatus() {
        return boardStatus;
    }
}