package main;

import java.util.HashMap;

public abstract class Command {
    abstract HashMap<Direction, Vector> getVectorByDirection();

    MarsRover move(MarsRover rover) {
        Vector vector = this.getVectorByDirection().get(rover.getDirection());
        return vector.applyVector(rover);
    }

    ;

    public final static Command F = new Command() {

        @Override
        HashMap<Direction, Vector> getVectorByDirection() {
            return new HashMap<Direction, Vector>() {
                {
                    super.put(Direction.N, new Vector(0, 1, null));
                    super.put(Direction.S, new Vector(0, -1, null));
                    super.put(Direction.E, new Vector(1, 0, null));
                    super.put(Direction.W, new Vector(-1, 0, null));
                }
            };
        }
    };

    public final static Command B = new Command() {
        @Override
        HashMap<Direction, Vector> getVectorByDirection() {
            return new HashMap<Direction, Vector>() {
                {
                    super.put(Direction.N, new Vector(0, -1, null));
                    super.put(Direction.S, new Vector(0, 1, null));
                    super.put(Direction.E, new Vector(-1, 0, null));
                    super.put(Direction.W, new Vector(1, 0, null));
                }
            };
        }
    };

    public final static Command R = new Command() {
        @Override
        HashMap<Direction, Vector> getVectorByDirection() {
            return new HashMap<Direction, Vector>() {
                {
                    super.put(Direction.N, new Vector(0, 0, Direction.E));
                    super.put(Direction.S, new Vector(0, 0, Direction.W));
                    super.put(Direction.E, new Vector(0, 0, Direction.S));
                    super.put(Direction.W, new Vector(0, 0, Direction.N));
                }
            };
        }
    };

    public final static Command L = new Command() {
        @Override
        HashMap<Direction, Vector> getVectorByDirection() {
            return new HashMap<Direction, Vector>() {
                {
                    super.put(Direction.N, new Vector(0, 0, Direction.W));
                    super.put(Direction.S, new Vector(0, 0, Direction.E));
                    super.put(Direction.E, new Vector(0, 0, Direction.N));
                    super.put(Direction.W, new Vector(0, 0, Direction.S));
                }
            };
        }
    };

}


