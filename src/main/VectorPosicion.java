package main;

public class VectorPosicion implements Vector {
    private int x;
    private int y;

    public VectorPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public MarsRover applyVector(MarsRover rover){
        Point newPoint = new Point(this.x+ rover.getPoint().getX(), this.y+ rover.getPoint().getY());
        return new MarsRover(newPoint, rover.getDirection());
    }


}
