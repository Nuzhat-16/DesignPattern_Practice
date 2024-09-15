package Command;

public class CommandPatternDemo {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        Command turnOnLight = new TurnOnLightCommand(livingRoomLight);
        Command turnOffLight = new TurnOffLightCommand(livingRoomLight);
        Command startFan = new StartFanCommand(ceilingFan);
        Command stopFan = new StopFanCommand(ceilingFan);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(turnOnLight);
        remote.pressButton();
        remote.setCommand(turnOffLight);
        remote.pressButton();
        remote.setCommand(startFan);
        remote.pressButton();
        remote.setCommand(stopFan);
        remote.pressButton();
    }
}
