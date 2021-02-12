package main;

public class MoveBackward implements Command {

    @Override
    public boolean appliesThisCommand(String command) {
        return command.equals("B");
    }

    @Override
    public MarsRover applyCommand(MarsRover rover) {
        Direction direction = rover.getDirection().getDirection();
        return direction.moveBackWard(rover);
    }
}
