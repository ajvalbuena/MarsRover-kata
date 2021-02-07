package main;

public class South implements Direction {
    @Override
    public boolean appliesThisDirection(DirectionsEnum direction) {
        return (DirectionsEnum.S.equals(direction));
    }

    @Override
    public void moveForward(MarsRover rover) {
        rover.setY(rover.getY() - 1);
    }

    @Override
    public void moveBackWard(MarsRover rover) {
        rover.setY(rover.getY() + 1);
    }

    @Override
    public void turnRight(MarsRover rover) {
        rover.setDirection(DirectionsEnum.W);}

    @Override
    public void turnLeft(MarsRover rover) {
        rover.setDirection(DirectionsEnum.E);
    }
}
