package main;

public class TurnRight implements Command {

    @Override
    public boolean appliesThisCommand(String command) {
        return command.equals("R");
    }

    @Override
    public void applyCommand(MarsRover rover) {
        Direction direction = directionStrategy.getDirectionStrategy(rover.getDirection());
        direction.turnRight(rover);
    }
}
