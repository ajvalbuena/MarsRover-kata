package main;

import java.util.ArrayList;

public class MarsRover {
    private int x;
    private int y;
    private DirectionsEnum direction;

    private StrategiesFactory commandStrategy = new StrategiesFactory();

    public MarsRover(int x, int y, DirectionsEnum direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public MarsRover move(ArrayList<String> commands, MarsRover marsRover) {
        MarsRover rover = marsRover;
        for (int i = 0; i < commands.size(); i++) {
            Command command = commandStrategy.getCommandStrategy(commands.get(i));
            rover = command.applyCommand(rover);
        }
        return rover;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public DirectionsEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionsEnum direction) {
        this.direction = direction;
    }

}

