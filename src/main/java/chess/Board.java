package chess;

import javax.swing.*;
import java.awt.*;

class Board {
    private JPanel square[][] = new JPanel[8][8];

    public void display() {
        JFrame frame = new JFrame("Chess");
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(8, 8));

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                square[i][j] = new JPanel();
                if((i + j) % 2 == 0) {
                    square[i][j].setBackground(Color.LIGHT_GRAY);
                } else {
                    square[i][j].setBackground(Color.DARK_GRAY);
                }
                frame.add(square[i][j]);
            }
        }
        square[0][0].add(new JLabel(new ImageIcon("file/Rook White.png")));
        square[7][7].add(new JLabel(new ImageIcon("file/Rook Black.png")));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}