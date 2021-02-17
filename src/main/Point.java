package main;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point applyVector (Vector vector){
        return new Point(this.getX()+ vector.getX(), this.getY()+vector.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
