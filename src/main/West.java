package main;

public class West implements Direction {
    @Override
    public boolean appliesThisDirection(DirectionsEnum direction) {
        return (DirectionsEnum.W.equals(direction));
    }

    @Override
    public void moveForward(MarsRover rover) {
        rover.setX(rover.getX() - 1);
    }

    @Override
    public void moveBackWard(MarsRover rover) {
        rover.setX(rover.getX() + 1);
    }

    @Override
    public void turnRight(MarsRover rover) {
        rover.setDirection(DirectionsEnum.N);
    }

    @Override
    public void turnLeft(MarsRover rover) {
        rover.setDirection(DirectionsEnum.S);
    }
}
