package state;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Simulate traffic light changes
        for (int i = 0; i < 6; i++) {
            trafficLight.show();   // Display current light
            trafficLight.change(); // Change to next light
        }
    }
}