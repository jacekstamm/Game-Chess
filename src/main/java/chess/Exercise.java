package chess;

import javafx.scene.effect.Light;
import javafx.scene.paint.Color;

public class Exercise {

    private Light.Spot[][] spots = new Light.Spot[8][8];

    public Exercise() {
        super();
        for (int i = 0; i < spots.length; i++) {
            for (int j = 0; j < spots.length; j++) {
                this.spots[i][j] = new Light.Spot();
                if((i + j) % 2 == 0) {
                    spots[i][j].setColor(Color.LIGHTGRAY);
                } else {
                    spots[i][j].setColor(Color.DARKGREY);
                }
            }

        }
    }

    public Light.Spot getSpot(int x, int y) {
        return spots[x][y];
    }
}
