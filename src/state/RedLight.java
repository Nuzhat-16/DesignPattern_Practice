package state;

public class RedLight implements TrafficLightState {
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GreenLight());
    }

    public void display() {
        System.out.println("Red Light - Cars must stop");
    }}