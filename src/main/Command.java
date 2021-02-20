package main;

import java.util.HashMap;
import java.util.Map;

public abstract class Command {
    abstract MarsRover move(MarsRover rover);

    public final static Command F = new Command() {
        Map<Direction, Vector> vectorByDirection = new HashMap<Direction, Vector>() {
            {
                super.put(Direction.N, new Vector(0, 1));
                super.put(Direction.S, new Vector(0, -1));
                super.put(Direction.E, new Vector(1, 0));
                super.put(Direction.W, new Vector(-1, 0));
            }
        };

        @Override
        MarsRover move(MarsRover rover) {
            Vector vector = vectorByDirection.get(rover.getDirection());
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }
    };

    public final static Command B = new Command() {
        Map<Direction, Vector> vectorByDirection = new HashMap<Direction, Vector>() {
            {
                super.put(Direction.N, new Vector(0, -1));
                super.put(Direction.S, new Vector(0, 1));
                super.put(Direction.E, new Vector(-1, 0));
                super.put(Direction.W, new Vector(1, 0));
            }
        };

        @Override
        MarsRover move(MarsRover rover) {
            Vector vector = vectorByDirection.get(rover.getDirection());
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }
    };

    public final static Command R = new Command() {
        Map<Direction, Direction> newDirectionByDirection = new HashMap<Direction, Direction>() {
            {
                super.put(Direction.N, Direction.E);
                super.put(Direction.S, Direction.W);
                super.put(Direction.E, Direction.S);
                super.put(Direction.W, Direction.N);
            }
        };

        @Override
        MarsRover move(MarsRover rover) {
            return new MarsRover(rover.getPoint(), newDirectionByDirection.get(rover.getDirection()));
        }
    };

    public final static Command L = new Command() {
        Map<Direction, Direction> newDirectionByDirection = new HashMap<Direction, Direction>() {
            {
                super.put(Direction.N, Direction.W);
                super.put(Direction.S, Direction.E);
                super.put(Direction.E, Direction.N);
                super.put(Direction.W, Direction.S);
            }
        };

        @Override
        MarsRover move(MarsRover rover) {
            return new MarsRover(rover.getPoint(), newDirectionByDirection.get(rover.getDirection()));
        }
    };
}


