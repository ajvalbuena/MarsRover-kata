package main;

import java.util.HashMap;
import java.util.Map;

public class TurnRight extends Movement {

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

}
