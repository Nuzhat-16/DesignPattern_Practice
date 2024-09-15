package Command;

class StopFanCommand implements Command {
    private Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stop();
    }
}
