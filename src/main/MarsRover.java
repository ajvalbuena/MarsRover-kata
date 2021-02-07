package main;

import java.util.ArrayList;

public class MarsRover {
    public int x;
    public int y;
    public DirectionsEnum direction;
    private StrategiesUtil commandStrategy = new StrategiesUtil();

    public MarsRover(int x, int y, DirectionsEnum direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(ArrayList<String> commands) {
        for (int i = 0; i < commands.size(); i++) {

            Command movement = commandStrategy.getCommandStrategy(commands.get(i));
            MarsRover newRover = movement.applyCommand(this);
            this.setX(newRover.getX());
            this.setY(newRover.getY());
            this.setDirection(newRover.getDirection());
        }
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

