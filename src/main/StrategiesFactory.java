package main;

public class StrategiesFactory {
    Command[] commandOptions = {new MoveForward(), new MoveBackward(), new TurnLeft(), new TurnRight()};

    public Command getCommandStrategy(String command) {
        for (Command c : commandOptions) {
            if (c.appliesThisCommand(command)) {
                return c;
            }
        }
        return new MoveForward();
    }
}
