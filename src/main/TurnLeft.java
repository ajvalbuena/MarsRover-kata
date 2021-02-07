package main;

public class TurnLeft implements Command {

    @Override
    public boolean appliesThisCommand(String command) {
        return command.equals("L");
    }

    @Override
    public void applyCommand(MarsRover rover) {
        Direction direction = directionStrategy.getDirectionStrategy(rover.getDirection());
        direction.turnLeft(rover);
    }
}
