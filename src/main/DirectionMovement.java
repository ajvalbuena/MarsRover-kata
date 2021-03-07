package main;

public class DirectionMovement implements Movement {
    private Direction direction;

    public DirectionMovement(Direction direction) {
        this.direction = direction;
    }

    @Override
    public MarsRover applyVector(MarsRover rover){
        return new MarsRover(rover.getPoint(), this.direction, rover.getConsole());
    }


}
