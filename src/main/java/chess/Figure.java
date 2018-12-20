package chess;

import javafx.scene.image.ImageView;

public class Figure {

    private String name;
    private ImageView image;
    private int player;
    // 0=null 1=black 2=white

    public Figure(String name, ImageView image, int player) {
        this.name = name;
        this.image = image;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public ImageView getImage() {
        return image;
    }

    public int getPlayer() {
        return player;
    }
}
