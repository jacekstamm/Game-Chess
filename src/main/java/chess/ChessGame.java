package chess;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChessGame extends Application {


    private Image imageBack = new Image("file/background.png");
    private Image brownLightSquare = new Image("file/BrownLight.png");
    private Image brownDarkSquare = new Image("file/BrownDark.png");

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
        grid.setPadding(new Insets(10, 10, 10, 10));

        ImageView lightBrown = new ImageView();
        lightBrown.setImage(brownLightSquare);
        lightBrown.resize(75, 75);

        ImageView darkBrown = new ImageView();
        darkBrown.setImage(brownDarkSquare);
        darkBrown.resize(75, 75);

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if((x + y) % 2 == 0) {
                    GridPane.setConstraints(lightBrown, x, y);
                } else {
                    GridPane.setConstraints(darkBrown, x, y);
                }
            }
        }
        grid.getChildren().addAll(darkBrown, lightBrown);




        Scene scene = new Scene(grid, 1300, 800, Color.BLACK);

        primaryStage.setTitle("Chess");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}