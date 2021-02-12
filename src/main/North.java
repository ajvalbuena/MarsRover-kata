package main;

public class North implements Direction {
    @Override
    public boolean appliesThisDirection(DirectionsEnum direction) {
        return (DirectionsEnum.N.equals(direction));
    }

    @Override
    public MarsRover moveForward(MarsRover rover) {
        return new MarsRover(rover.getX(), rover.getY() + 1, rover.getDirection());
    }

    @Override
    public MarsRover moveBackWard(MarsRover rover) {
        return new MarsRover(rover.getX(), rover.getY() - 1, rover.getDirection());
    }

    @Override
    public MarsRover turnRight(MarsRover rover) {
        return new MarsRover(rover.getX(), rover.getY(), DirectionsEnum.E);
    }

    @Override
    public MarsRover turnLeft(MarsRover rover) {
        return new MarsRover(rover.getX(), rover.getY(), DirectionsEnum.W);
    }
}
