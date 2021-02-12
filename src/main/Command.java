package main;

public interface Command {
    StrategiesFactory directionStrategy = new StrategiesFactory();

    boolean appliesThisCommand(String command);
    MarsRover applyCommand(MarsRover rover);
}

