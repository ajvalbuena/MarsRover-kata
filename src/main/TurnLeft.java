package main;

import java.util.HashMap;
import java.util.Map;

public class TurnLeft extends Movement {

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

}
