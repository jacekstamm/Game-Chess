package chess;

import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Pawns {

    private ImageView whitePawn = new ImageView("file/Pawn White.png");
    private ImageView blackPawn = new ImageView("file/Pawn Black.png");
    private Board board = new Board();
    private GridPane pawnPane = new GridPane();


    public GridPane pawnsDisplay() {

        pawnPane.setAlignment(Pos.CENTER);
        pawnPane.add(whitePawn, 0, 6);
        pawnPane.add(blackPawn, 0, 1);


        pawnPane.getChildren().setAll(whitePawn, blackPawn);

        return pawnPane;
    }





}
