package main;

import java.util.List;

public class MarsRover {
    private Point point;
    private Direction direction;
    private Console console;


    public MarsRover(Point point, Direction direction, Console console) {
        this.point = point;
        this.direction = direction;
        this.console = console;
    }

    public MarsRover move(List<Command> commands, List<Point> obstacles)  {
        MarsRover rover = this;
        try {
            for (Command command : commands) {
                rover = command.move(rover, obstacles);
            }
        } catch (Exception e) {
           console.log(e.getMessage());
        } finally {
            return rover;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public Point getPoint() {
        return point;
    }

    public Console getConsole() {
        return console;
    }
}

