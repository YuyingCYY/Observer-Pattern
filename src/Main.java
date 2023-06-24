import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;

public class Main extends JPanel {

    class TimerMission extends TimerTask {
        private ArrayList<Animail> animails = null;
        public TimerMission(ArrayList<Animail> animails) {
            this.animails = animails;
        }

        @Override
        public void run() {
            for (Animail animail : animails) {
                animail.dance();
            }
            repaint();
        }
    }

    private ArrayList<Animail> redPandas = new ArrayList<>();
    private ArrayList<Animail> dogs = new ArrayList<>();
    private Timer timer;
    private int speed = 100;

    public Main() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerMission(redPandas), 0, speed);
        timer.scheduleAtFixedRate(new TimerMission(dogs), 150, speed + 500);

        redPandas.add(new RedPanda(30, 30));
        redPandas.add(new RedPanda(230, 230));
        redPandas.add(new RedPanda(90, 100));
        dogs.add(new Dog(200, 100));
        dogs.add(new Dog(300, 50));
        dogs.add(new Dog(400, 400));
    }

    @Override
    public void paintComponents(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        for (Animail rp : redPandas) {
            rp.draw(g);
        }
        for (Animail dog : dogs) {
            dog.draw(g);
        }
    }


    public static void main(String[] args) {
        JFrame window = new JFrame("RedPanda");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setContentPane(new Main());
        window.setVisible(true);
    }

}





