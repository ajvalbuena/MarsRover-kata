package main;

public interface Command {
    StrategiesFactory directionStrategy = new StrategiesFactory();

    boolean appliesThisCommand(String command);
    void applyCommand(MarsRover rover);
}

