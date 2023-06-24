import javax.swing.*;
import java.awt.*;

public class RedPanda implements TickListener {
    private Point point;
    private ImageIcon redPadnda = new ImageIcon("redpanda.png");

    public RedPanda(int x, int y) {
        point = new Point(x, y);
    }

    public void dance() {
        int newX = (int) (Math.random() * 10 - 5);
        int newY = (int) (Math.random() * 10 - 5);
        point.x += newX;
        point.y += newY;
    }

    public void draw(Graphics g) {
        redPadnda.paintIcon(null, g, point.x, point.y);
    }

    @Override
    public void tick() {
        dance();
    }
}
