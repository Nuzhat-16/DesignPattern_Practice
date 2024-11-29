package state;

public class GreenLight implements TrafficLightState {
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowLight());
    }

    public void display() {
        System.out.println("Green Light - Cars can go");
    }
}






