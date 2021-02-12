package main;

public interface Direction {


    boolean appliesThisDirection (DirectionsEnum direction);
    MarsRover moveForward (MarsRover rover);
    MarsRover moveBackWard (MarsRover rover);
    MarsRover turnRight (MarsRover rover);
    MarsRover turnLeft (MarsRover rover);

}
