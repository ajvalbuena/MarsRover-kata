package main;

import java.util.HashMap;
import java.util.Map;

public class PositionMovement implements Movement {
    private int x;
    private int y;

    public PositionMovement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public MarsRover applyVector(MarsRover rover) {
        int newX = this.x + rover.getPoint().getX();
        int newY = this.y + rover.getPoint().getY();

        Point newPoint = new Point(applyLimitsInMars(newX), applyLimitsInMars(newY));

        return new MarsRover(newPoint, rover.getDirection());
    }

    private int applyLimitsInMars(int coordinate) {
        if (coordinate == 181) {
            return -179;
        } else if (coordinate == -180) {
            return 180;
        } else {
            return coordinate;
        }


    }


}
