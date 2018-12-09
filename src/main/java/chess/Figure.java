package chess;

import javafx.scene.image.ImageView;

public class Figure {

    private String name;
    private ImageView image;

    public Figure(String name, ImageView image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public ImageView getImage() {
        return image;
    }
}
