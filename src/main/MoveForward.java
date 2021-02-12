package main;

public class MoveForward implements Command {

    @Override
    public boolean appliesThisCommand(String command) {
        return command.equals("F");
    }

    @Override
    public MarsRover applyCommand(MarsRover rover) {
        Direction direction = rover.getDirection().getDirection();
        return direction.moveForward(rover);
    }
}
