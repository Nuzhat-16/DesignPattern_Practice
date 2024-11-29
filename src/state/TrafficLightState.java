package state;

public interface TrafficLightState {
    void next(TrafficLight trafficLight);
    void display();
}