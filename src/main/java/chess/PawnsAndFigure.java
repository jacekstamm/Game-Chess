package chess;

import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PawnsAndFigure {

    private Board board = new Board();

    public GridPane pawnsAndFigureDisplay() {
        GridPane pawnsAndFigurePane;
        pawnsAndFigurePane = board.getChessBoardPane();

        for (int x = 0; x < 8; x++) {
            //Pawns
            ImageView blackPawn = new ImageView("file/Pawn Black.png");
            ImageView whitePawn = new ImageView("file/Pawn White.png");
            GridPane.setConstraints(blackPawn, x, 1);
            GridPane.setConstraints(whitePawn, x, 6);
            pawnsAndFigurePane.getChildren().addAll(blackPawn, whitePawn);
            //Empty Spots
            for (int y = 2; y < 7; y++) {
                Text text = new Text();
                text.setText(" ");
                text.setFont(Font.font(55.0));
                GridPane.setConstraints(text, x, y);
                pawnsAndFigurePane.getChildren().addAll(text);
            }
            //Rooks
            if (x == 0 || x == 7) {
                ImageView blackRook = new ImageView("file/Rook Black.png");
                ImageView whiteRook = new ImageView("file/Rook White.png");
                GridPane.setConstraints(blackRook, x, 0);
                GridPane.setConstraints(whiteRook, x, 7);
                pawnsAndFigurePane.getChildren().addAll(blackRook, whiteRook);
            }
            //Knights
            if (x == 1 || x == 6) {
                ImageView blackKnight = new ImageView("file/Knight Black.png");
                ImageView whiteKnight = new ImageView("file/Knight White.png");
                GridPane.setConstraints(blackKnight, x, 0);
                GridPane.setConstraints(whiteKnight, x, 7);
                pawnsAndFigurePane.getChildren().addAll(blackKnight, whiteKnight);
            }
            //Bishops
            if (x == 2 || x == 5) {
                ImageView blackBishop = new ImageView("file/Bishop Black.png");
                ImageView whiteBishop = new ImageView("file/Bishop White.png");
                GridPane.setConstraints(blackBishop, x, 0);
                GridPane.setConstraints(whiteBishop, x, 7);
                pawnsAndFigurePane.getChildren().addAll(blackBishop, whiteBishop);
            }
            //Queens
            if (x == 3) {
                ImageView blackQueen = new ImageView("file/Queen Black.png");
                ImageView whiteQueen = new ImageView("file/Queen White.png");
                GridPane.setConstraints(blackQueen, x, 0);
                GridPane.setConstraints(whiteQueen, x, 7);
                pawnsAndFigurePane.getChildren().addAll(blackQueen, whiteQueen);
            }
            //Kings
            if (x == 4) {
                ImageView blackKing = new ImageView("file/King Black.png");
                ImageView whiteKing = new ImageView("file/King White.png");
                GridPane.setConstraints(blackKing, x, 0);
                GridPane.setConstraints(whiteKing, x, 7);
                pawnsAndFigurePane.getChildren().addAll(blackKing, whiteKing);
            }
        }
        pawnsAndFigurePane.setPadding(new Insets(5, 5, 5, 5));
        pawnsAndFigurePane.setGridLinesVisible(true);
        pawnsAndFigurePane.setHgap(10);
        pawnsAndFigurePane.setVgap(10);

        return pawnsAndFigurePane;
    }
}
