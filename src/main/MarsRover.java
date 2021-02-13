package main;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public MarsRover move(ArrayList<String> commands, MarsRover marsRover) throws Exception {
        MarsRover rover = marsRover;
        for (int i = 0; i < commands.size(); i++) {
            String command = Command.valueOf(commands.get(i)).getCommandMovement();
            Method movement = rover.getDirection().getClass().getDeclaredMethod(command, MarsRover.class);
            rover = (MarsRover) movement.invoke(rover.getDirection(), rover);
        }
        return rover;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }


}

