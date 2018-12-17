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
        PawnsAndFigure pawnsAndFigure = new PawnsAndFigure();

        Figure[][] boardStatus = pawnsAndFigure.getBoardStatus();

        ControlPawnsAndFigures controlPawnsAndFigures = new ControlPawnsAndFigures();
        Figure[][] modifiedBoardStatus = controlPawnsAndFigures.move(boardStatus, 0,0,2,2);
        GridPane chessBoard2 = board.chessBoardDisplay(modifiedBoardStatus);

        grid.getChildren().setAll(chessBoard2.getChildren());

        Scene scene = new Scene(grid, 1300, 800, Color.BLACK);

        primaryStage.setTitle("Chess");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}