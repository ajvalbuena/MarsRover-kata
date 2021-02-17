package main;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MarsRover {
    private Point point;
    private Direction direction;


    public MarsRover(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public MarsRover move(List<Command> commands, MarsRover marsRover) {
        MarsRover rover = marsRover;
        for (Command command : commands) {
            switch (command) {
                case F:
                case B:
                    rover = rover.getDirection().move(rover, command);
                    break;

                case R:
                case L:
                    rover = rover.getDirection().turn(rover, command);
                    break;

                default:
                    break;
            }
        }
        return rover;
    }

    public Direction getDirection() {
        return direction;
    }

    public Point getPoint() {
        return point;
    }

}

