package Command;

class StartFanCommand implements Command {
    private Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.start();
    }
}
