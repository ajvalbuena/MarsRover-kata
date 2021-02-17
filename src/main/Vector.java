package main;

public class Vector {
    private int x;
    private int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point applyVector (MarsRover rover){
        return new Point(this.getX()+ rover.getPoint().getX(), this.getY()+ rover.getPoint().getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
