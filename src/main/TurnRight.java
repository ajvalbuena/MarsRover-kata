package main;

public class TurnRight implements Command {

    @Override
    public boolean appliesThisCommand(String command) {
        return command.equals("R");
    }

    @Override
    public MarsRover applyCommand(MarsRover rover) {
        Direction direction = rover.getDirection().getDirection();
        return direction.turnRight(rover);
    }
}
