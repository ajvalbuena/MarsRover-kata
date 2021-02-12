package main;

public class StrategiesFactory {

    Direction[] directionOptions = {new North(), new South(), new East(), new West()};
    Command[] commandOptions = {new MoveForward(), new MoveBackward(), new TurnLeft(), new TurnRight()};

    public Direction getDirectionStrategy(DirectionsEnum direction) {
        for (Direction d : directionOptions) {
            if (d.appliesThisDirection(direction)) {
                return d;
            }
        }
        return new North();
    }

    public Command getCommandStrategy(String command) {
        for (Command c : commandOptions) {
            if (c.appliesThisCommand(command)) {
                return c;
            }
        }
        return new MoveForward();
    }
}
