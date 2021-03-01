package main;

import java.util.HashMap;
import java.util.List;

public class Command {
    private HashMap<Direction, Movement> movementByDirection;

    public Command(HashMap<Direction, Movement> movementByDirection) {
        this.movementByDirection = movementByDirection;
    }

    MarsRover move(MarsRover initRover, List<Point> obstacles) throws Exception {
        Movement movement = movementByDirection.get(initRover.getDirection());
        MarsRover newRover = movement.applyVector(initRover);
        if (newRover.getPoint().thereIsAnObstacle(obstacles)) {
            throw new Exception("There is an obstacle in the route. Rover cannot continue");
        }
        return newRover;
    }


    public final static Command F = new Command(new HashMap<Direction, Movement>() {
        {
            super.put(Direction.N, new PositionMovement(0, 1));
            super.put(Direction.S, new PositionMovement(0, -1));
            super.put(Direction.E, new PositionMovement(1, 0));
            super.put(Direction.W, new PositionMovement(-1, 0));
        }
    });

    public final static Command B = new Command(new HashMap<Direction, Movement>() {
        {
            super.put(Direction.N, new PositionMovement(0, -1));
            super.put(Direction.S, new PositionMovement(0, 1));
            super.put(Direction.E, new PositionMovement(-1, 0));
            super.put(Direction.W, new PositionMovement(1, 0));
        }
    });

    public final static Command R = new Command(new HashMap<Direction, Movement>() {
        {
            super.put(Direction.N, new DirectionMovement(Direction.E));
            super.put(Direction.S, new DirectionMovement(Direction.W));
            super.put(Direction.E, new DirectionMovement(Direction.S));
            super.put(Direction.W, new DirectionMovement(Direction.N));
        }
    });

    public final static Command L = new Command(new HashMap<Direction, Movement>() {
        {
            super.put(Direction.N, new DirectionMovement(Direction.W));
            super.put(Direction.S, new DirectionMovement(Direction.E));
            super.put(Direction.E, new DirectionMovement(Direction.N));
            super.put(Direction.W, new DirectionMovement(Direction.S));
        }
    });

}


