package test;

import main.Command;
import main.Direction;
import main.MarsRover;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void oneStepForwardForNorth() {
        MarsRover initRover = new MarsRover(0, 0, Direction.N);
        List<Command> commands = Arrays.asList(Command.F);
        MarsRover expectedRover = new MarsRover(0, 1, Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndBackwardForNorth()  {
        MarsRover initRover = new MarsRover(0, 0, Direction.N);
        List<Command> commands = Arrays.asList(Command.F, Command.B);
        MarsRover expectedRover = new MarsRover(0, 0, Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndRightForNorth()  {
        MarsRover initRover = new MarsRover(0, 0, Direction.N);
        List<Command> commands = Arrays.asList(Command.F, Command.R);

        MarsRover expectedRover = new MarsRover(0, 1, Direction.E);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndLeftForEast()  {
        MarsRover initRover = new MarsRover(0, 0, Direction.E);
        List<Command> commands = Arrays.asList(Command.F, Command.L);
        MarsRover expectedRover = new MarsRover(1, 0, Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void movements()  {
        MarsRover initRover = new MarsRover(0, 0, Direction.N);
        List<Command> commands = Arrays.asList(Command.F, Command.R, Command.F, Command.L, Command.B, Command.F, Command.F, Command.F, Command.L, Command.B, Command.B, Command.L, Command.F, Command.B, Command.R);
        MarsRover expectedRover = new MarsRover(3, 3, Direction.W);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }
}
