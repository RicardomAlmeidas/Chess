package gui;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("/icon.png");
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        Square square = new Square();
        frame.getContentPane().add(square);
        for (int i = 0; i < 8; i++) {
            for (int x = 0; x < 8; x++) {
                Square.addSquare(i*100, x*100, 100, 100);
            }
        }
    }
}
