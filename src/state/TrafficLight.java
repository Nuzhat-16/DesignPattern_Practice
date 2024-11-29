package state;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new GreenLight(); // Initial state
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.next(this);
    }

    public void show() {
        state.display();
    }
}
