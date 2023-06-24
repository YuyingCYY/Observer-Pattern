import java.util.ArrayList;
import java.util.TimerTask;

class TimerMission extends TimerTask {
    private ArrayList<TickListener> listeners = new ArrayList<>();

    public void register(TickListener t) {
        listeners.add(t);
    }

    public void ungister(TickListener t) {
        listeners.remove(t);
    }

    @Override
    public void run() {
        for (TickListener tickListener : listeners) {
            tickListener.tick();
        }
    }
}