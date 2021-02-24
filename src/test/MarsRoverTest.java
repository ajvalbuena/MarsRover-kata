package test;

import main.Command;
import main.Direction;
import main.MarsRover;
import main.Point;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void oneStepForwardForNorth() {
        MarsRover initRover = new MarsRover(new Point(0,0), Direction.N);
        List<Command> commands = Arrays.asList(Command.F);
        MarsRover expectedRover = new MarsRover(new Point(0,1), Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndBackwardForNorth()  {
        MarsRover initRover = new MarsRover(new Point(0,0), Direction.N);
        List<Command> commands = Arrays.asList(Command.F, Command.B);
        MarsRover expectedRover = new MarsRover(new Point(0,0), Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndRightForNorth()  {
        MarsRover initRover = new MarsRover(new Point(0,0), Direction.N);
        List<Command> commands = Arrays.asList(Command.F, Command.R);

        MarsRover expectedRover = new MarsRover(new Point(0,1), Direction.E);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndLeftForEast()  {
        MarsRover initRover = new MarsRover(new Point(0,0), Direction.E);
        List<Command> commands = Arrays.asList(Command.F, Command.L);
        MarsRover expectedRover = new MarsRover(new Point(1,0), Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void movements()  {
        MarsRover initRover = new MarsRover(new Point(0,0), Direction.N);
        List<Command> commands = Arrays.asList(Command.F, Command.R, Command.F, Command.L, Command.B, Command.F, Command.F, Command.F, Command.L, Command.B, Command.B, Command.L, Command.F, Command.B, Command.R);
        MarsRover expectedRover = new MarsRover(new Point(3,3), Direction.W);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void northernmostPointInEarth()  {
        MarsRover initRover = new MarsRover(new Point(0,179), Direction.N);
        List<Command> commands = Arrays.asList(Command.F, Command.F);
        MarsRover expectedRover = new MarsRover(new Point(0,-179), Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void southernmostPointInEarth()  {
        MarsRover initRover = new MarsRover(new Point(0,-179), Direction.S);
        List<Command> commands = Arrays.asList(Command.F);
        MarsRover expectedRover = new MarsRover(new Point(0,180), Direction.S);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void easternmostPointInEarth()  {
        MarsRover initRover = new MarsRover(new Point(180,0), Direction.E);
        List<Command> commands = Arrays.asList(Command.F);
        MarsRover expectedRover = new MarsRover(new Point(-179,0), Direction.E);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }
    @Test
    public void westernmostPointInEarth()  {
        MarsRover initRover = new MarsRover(new Point(-179,0), Direction.W);
        List<Command> commands = Arrays.asList(Command.F);
        MarsRover expectedRover = new MarsRover(new Point(180,0), Direction.W);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void negativeLimitsInEarth()  {
        MarsRover initRover = new MarsRover(new Point(-179,-179), Direction.N);
        List<Command> commands = Arrays.asList(Command.B, Command.R, Command.B);
        MarsRover expectedRover = new MarsRover(new Point(180,180), Direction.E);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void positiveLimitsInEarth()  {
        MarsRover initRover = new MarsRover(new Point(180,180), Direction.W);
        List<Command> commands = Arrays.asList(Command.B, Command.L, Command.B);
        MarsRover expectedRover = new MarsRover(new Point(-179,-179), Direction.S);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getPoint().getY(), expectedRover.getPoint().getY());
        assertEquals(finalRover.getPoint().getX(), expectedRover.getPoint().getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }
}
