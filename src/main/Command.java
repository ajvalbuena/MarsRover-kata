package main;

public enum Command {
    F("F", "moveForward"),
    B("B", "moveBackward"),
    L("L", "turnLeft"),
    R("R", "turnRight");

    private final String command;
    private final String commandMovement;

    Command(String command, String commandMovement) {
        this.command = command;
        this.commandMovement = commandMovement;
    }

    public String getCommandMovement() {
        return commandMovement;
    }


}



