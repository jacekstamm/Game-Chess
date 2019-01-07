package chess;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        Figure[][] modifiedBoardStatus = controlPawnsAndFigures.move(boardStatus, 0, 0, 0, 0);
        GridPane chessBoard2 = board.chessBoardDisplay(modifiedBoardStatus);

        grid.getChildren().setAll(chessBoard2.getChildren());

        Button moveButton = new Button("Move");
        moveButton.setPrefWidth(70);
        GridPane.setConstraints(moveButton, 8, 7);
        grid.getChildren().add(moveButton);

        Scene scene = new Scene(grid, 1300, 800, Color.BLACK);

        primaryStage.setTitle("Chess");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        moveButton.setOnAction(e -> {
            try {
                int fromXInt = Integer.parseInt(board.getFromX().getText());
                int fromYInt = Integer.parseInt(board.getFromY().getText());
                int toXInt = Integer.parseInt(board.getToX().getText());
                int toYInt = Integer.parseInt(board.getToY().getText());

                String fromFigureName = boardStatus[fromXInt][fromYInt].getName();
                int fromPlayer = boardStatus[fromXInt][fromYInt].getPlayer();
                System.out.println(fromFigureName + " : " + fromPlayer);

                




                Figure[][] modifiedBoardStatus2 = controlPawnsAndFigures.move(boardStatus, fromXInt, fromYInt, toXInt, toYInt);
                GridPane chessBoard3 = board.chessBoardDisplay(modifiedBoardStatus2);
                grid.getChildren().setAll(chessBoard3.getChildren());

            } catch (ArrayIndexOutOfBoundsException a) {
                PopUpCoordinates.display("User Error", "Use ONLY one number 0 - 7");
            } catch (NumberFormatException n) {
                PopUpCoordinates.display("User Error", "Don't input letters and symbols");
            }
            grid.getChildren().add(moveButton);
        });
    }
}