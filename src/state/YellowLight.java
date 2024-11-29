package state;

public class YellowLight implements TrafficLightState {
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RedLight());
    }

    public void display() {
        System.out.println("Yellow Light - Cars should slow down");
    }
}