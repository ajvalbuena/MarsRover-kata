package main;

import java.util.HashMap;
import java.util.Map;

public abstract class Direction {

    abstract MarsRover move(MarsRover rover, Command command);
    abstract MarsRover turn(MarsRover rover, Command command);

    public final static Direction N = new Direction() {
        Map<Command, Vector> vectorByCommand = new HashMap<Command, Vector>() {
            {
                super.put(Command.F, new Vector(0, 1));
                super.put(Command.B, new Vector(0, -1));
            }
        };

        @Override
        MarsRover move(MarsRover rover, Command command) {
            Vector vector = vectorByCommand.get(command);
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }

        @Override
        MarsRover turn(MarsRover rover, Command command) {
            Direction newDirection = command == Command.L ? Direction.W : Direction.E;
            return new MarsRover(rover.getPoint(), newDirection);
        }
    };

    public final static Direction S = new Direction() {
        Map<Command, Vector> vectorByCommand = new HashMap<Command, Vector>() {
            {
                super.put(Command.F, new Vector(0, -1));
                super.put(Command.B, new Vector(0, 1));
            }
        };

        @Override
        MarsRover move(MarsRover rover, Command command) {
            Vector vector = vectorByCommand.get(command);
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }

        @Override
        MarsRover turn(MarsRover rover, Command command) {
            Direction newDirection = command == Command.L ? Direction.E : Direction.W;
            return new MarsRover(rover.getPoint(), newDirection);
        }
    };

    public final static Direction E = new Direction() {
        Map<Command, Vector> vectorByCommand = new HashMap<Command, Vector>() {
            {
                super.put(Command.F, new Vector(1, 0));
                super.put(Command.B, new Vector(-1, 0));
            }
        };

        @Override
        MarsRover move(MarsRover rover, Command command) {
            Vector vector = vectorByCommand.get(command);
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }

        @Override
        MarsRover turn(MarsRover rover, Command command) {
            Direction newDirection = command == Command.L ? Direction.N : Direction.S;
            return new MarsRover(rover.getPoint(), newDirection);
        }
    };

    public final static Direction W = new Direction() {
        Map<Command, Vector> vectorByCommand = new HashMap<Command, Vector>() {
            {
                super.put(Command.F, new Vector(-1, 0));
                super.put(Command.B, new Vector(1, 0));
            }
        };

        @Override
        MarsRover move(MarsRover rover, Command command) {
            Vector vector = vectorByCommand.get(command);
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }

        @Override
        MarsRover turn(MarsRover rover, Command command) {
            Direction newDirection = command == Command.L ? Direction.S : Direction.N;
            return new MarsRover(rover.getPoint(), newDirection);
        }
    };


}



