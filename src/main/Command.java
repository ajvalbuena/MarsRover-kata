package main;

import java.util.HashMap;

public  class Command {
    private HashMap<Direction, Vector> vectorByDirection;

    public Command(HashMap<Direction, Vector> vectorByDirection) {
        this.vectorByDirection = vectorByDirection;
    }

    MarsRover move(MarsRover rover) {
        Vector vector = vectorByDirection.get(rover.getDirection());
        return vector.applyVector(rover);
    }


    public final static Command F = new Command(new HashMap<Direction, Vector>() {
        {
            super.put(Direction.N, new VectorPosicion(0, 1));
            super.put(Direction.S, new VectorPosicion(0, -1));
            super.put(Direction.E, new VectorPosicion(1, 0));
            super.put(Direction.W, new VectorPosicion(-1, 0));
        }
    });

    public final static Command B = new Command(new HashMap<Direction, Vector>() {
        {
            super.put(Direction.N, new VectorPosicion(0, -1));
            super.put(Direction.S, new VectorPosicion(0, 1));
            super.put(Direction.E, new VectorPosicion(-1, 0));
            super.put(Direction.W, new VectorPosicion(1, 0));
        }
    });

    public final static Command R = new Command(new HashMap<Direction, Vector>() {
        {
            super.put(Direction.N, new VectorDireccion(Direction.E));
            super.put(Direction.S, new VectorDireccion(Direction.W));
            super.put(Direction.E, new VectorDireccion(Direction.S));
            super.put(Direction.W, new VectorDireccion(Direction.N));
        }
    });

    public final static Command L = new Command(new HashMap<Direction, Vector>() {
        {
            super.put(Direction.N, new VectorDireccion(Direction.W));
            super.put(Direction.S, new VectorDireccion(Direction.E));
            super.put(Direction.E, new VectorDireccion(Direction.N));
            super.put(Direction.W, new VectorDireccion(Direction.S));
        }
    });

}


