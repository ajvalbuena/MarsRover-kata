package main;

public class Vector {
    private int x;
    private int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point applyVector (MarsRover rover){
        return new Point(this.x+ rover.getPoint().getX(), this.y+ rover.getPoint().getY());
    }


}
