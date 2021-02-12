package main;

public interface Command {

    boolean appliesThisCommand(String command);
    MarsRover applyCommand(MarsRover rover);
}

