package main;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public MarsRover move(List<Command> commands, MarsRover marsRover) {
        MarsRover rover = marsRover;
        for (Command command: commands) {
            switch (command) {
                case F:
                case B:
                    rover = rover.getDirection().move(rover, command);
                    break;

                case R:
                    rover = rover.getDirection().turnRight(rover);
                    break;
                case L:
                    rover = rover.getDirection().turnLeft(rover);
                    break;
                default:
                    break;
            }
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

