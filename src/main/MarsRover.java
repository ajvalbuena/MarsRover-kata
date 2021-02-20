package main;

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
            rover = command.move(rover);
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

