package main;

import java.util.HashMap;
import java.util.Map;

public class Forward extends Movement {

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

}
