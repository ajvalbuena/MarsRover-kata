package main;

public interface Direction {

    MarsRover moveForward (MarsRover rover);
    MarsRover moveBackWard (MarsRover rover);
    MarsRover turnRight (MarsRover rover);
    MarsRover turnLeft (MarsRover rover);

}
