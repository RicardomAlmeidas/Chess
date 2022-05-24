package gui;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Square extends JPanel {
    private static final int PREF_W = 500;
    private static final int PREF_H = PREF_W;
    private static ArrayList<Rectangle> squares = new ArrayList<>();

    public static void addSquare(int x, int y, int width, int height) {
        Rectangle rect = new Rectangle(x, y, width, height);
        squares.add(rect);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(PREF_W, PREF_H);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Rectangle rect : squares) {
            g2.draw(rect);
        }
    }
}
