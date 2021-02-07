package main;

public class North implements Direction {
    @Override
    public boolean appliesThisDirection(DirectionsEnum direction) {
        return (DirectionsEnum.N.equals(direction));
    }

    @Override
    public void moveForward(MarsRover rover) {
        rover.setY(rover.getY() + 1);
    }

    @Override
    public void moveBackWard(MarsRover rover) {
        rover.setY(rover.getY() - 1);
    }

    @Override
    public void turnRight(MarsRover rover) {
        rover.setDirection(DirectionsEnum.E);
    }

    @Override
    public void turnLeft(MarsRover rover) {
        rover.setDirection(DirectionsEnum.W);
    }
}
