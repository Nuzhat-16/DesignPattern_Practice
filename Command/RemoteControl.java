package Command;

class RemoteControl {
    private Command command;

    // Set the command dynamically
    public void setCommand(Command command) {
        this.command = command;
    }

    // Execute the command
    public void pressButton() {
        command.execute();
    }
}