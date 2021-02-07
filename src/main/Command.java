package main;

public interface Command {
    StrategiesUtil directionStrategy = new StrategiesUtil();

    boolean appliesThisCommand(String command);
    void applyCommand(MarsRover rover);
}

