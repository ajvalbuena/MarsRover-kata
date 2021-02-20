package main;

public class Vector {
    private int x;
    private int y;
    private Direction direction;

    public Vector(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public MarsRover applyVector (MarsRover rover){
        Direction newDirection = this.direction !=null ? this.direction : rover.getDirection();
        Point newPoint = new Point(this.x+ rover.getPoint().getX(), this.y+ rover.getPoint().getY());
        return new MarsRover(newPoint, newDirection);
    }


}
