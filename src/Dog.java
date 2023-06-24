import javax.swing.*;
import java.awt.*;

public class Dog implements Animail {
    private Point point;
    private ImageIcon dog = new ImageIcon("dog.png");

    public Dog(int x, int y) {
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
        dog.paintIcon(null, g, point.x, point.y);
    }
}
