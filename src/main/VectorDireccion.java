package main;

public class VectorDireccion implements Vector {
    private Direction direction;

    public VectorDireccion(Direction direction) {
        this.direction = direction;
    }

    @Override
    public MarsRover applyVector(MarsRover rover){
        return new MarsRover(rover.getPoint(), this.direction);
    }


}
