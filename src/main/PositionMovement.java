package main;

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

        if (newY == 181) {
            newY = -179;
        }
        if (newY == -180) {
            newY = 180;
        }
        if (newX == 181) {
            newX = -179;
        }
        if (newX == -180) {
            newX = 180;
        }



        Point newPoint = new Point(newX, newY);

        return new MarsRover(newPoint, rover.getDirection());
    }


}
