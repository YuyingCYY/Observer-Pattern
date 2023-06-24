import javax.swing.*;
import java.awt.*;

public class RedPanda implements Animail {
    private Point point;
    private ImageIcon redPadnda = new ImageIcon("redpanda.png");

    public RedPanda(int x, int y) {
        point = new Point(x, y);
    }

    @Override
    public void dance() {
        int newX = (int) (Math.random() * 10 - 5);
        int newY = (int) (Math.random() * 10 - 5);
        point.x += newX;
        point.y += newY;
    }

    @Override
    public void draw(Graphics g) {
        redPadnda.paintIcon(null, g, point.x, point.y);
    }
}
