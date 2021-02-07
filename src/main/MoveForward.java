package main;

public class MoveForward implements Command {

    @Override
    public boolean appliesThisCommand(String command) {
        return command.equals("F");
    }

    @Override
    public void applyCommand(MarsRover rover) {
        Direction direction = directionStrategy.getDirectionStrategy(rover.getDirection());
        direction.moveForward(rover);
    }
}
