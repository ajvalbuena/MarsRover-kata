package main;

public class TurnRight implements Command {

    @Override
    public boolean appliesThisCommand(String command) {
        return command.equals("R");
    }

    @Override
    public MarsRover applyCommand(MarsRover rover) {
        Direction direction = directionStrategy.getDirectionStrategy(rover.getDirection());
        return direction.turnRight(rover);
    }
}
