package chess;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChessGame extends Application {

    private Image imageBack = new Image("file/background.png");
    private Image chessBoard = new Image("file/Board.png");
    FlowPane imageBoard = new FlowPane(Orientation.HORIZONTAL);

   public static void main(String[] args) {
       launch(args);
   }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img = new ImageView(chessBoard);
        imageBoard.getChildren().add(img);

        grid.add(imageBoard, 0, 0, 1, 1);

        Scene scene = new Scene(grid, 1300, 900, Color.BLACK);

        primaryStage.setTitle("Chess");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}