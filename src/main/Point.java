package main;

import java.util.List;
import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean thereIsAnObstacle(List<Point> obstacles) {
        for (Point p : obstacles) {
            if (Objects.equals(this.x, p.getX())
                    && Objects.equals(this.y, p.getY())) {
                return true;
            }
        }
        return false;
    }

}
