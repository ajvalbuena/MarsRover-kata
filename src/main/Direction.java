package main;

public interface Direction {

    boolean appliesThisDirection (DirectionsEnum direction);
    void moveForward (MarsRover rover);
    void moveBackWard (MarsRover rover);
    void turnRight (MarsRover rover);
    void turnLeft (MarsRover rover);

}
