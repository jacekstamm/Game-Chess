package chess;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChessGame extends Application {

    private Image imageBack = new Image("file/background.png");

    public static void main(String[] args) {
       launch(args);
   }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setBackground(background);

        //Board display on background
        Board board = new Board();
        GridPane chessBoard = board.chessBoardDisplay();

        //Pawns and Figures display on board
        PawnsAndFigure pawnsAndFigure = new PawnsAndFigure();
        GridPane pieces = pawnsAndFigure.pawnsAndFigureDisplay();

        grid.getChildren().setAll(chessBoard, pieces);

        Scene scene = new Scene(grid, 1300, 800, Color.BLACK);

        primaryStage.setTitle("Chess");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}