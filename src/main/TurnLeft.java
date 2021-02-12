package main;

public class TurnLeft implements Command {

    @Override
    public boolean appliesThisCommand(String command) {
        return command.equals("L");
    }

    @Override
    public MarsRover applyCommand(MarsRover rover) {
        Direction direction = directionStrategy.getDirectionStrategy(rover.getDirection());
        return direction.turnLeft(rover);
    }
}
