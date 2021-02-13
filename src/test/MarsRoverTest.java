package test;

import main.Direction;
import main.MarsRover;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void oneStepForwardForNorth() throws Exception {
        MarsRover initRover = new MarsRover(0, 0, Direction.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        MarsRover expectedRover = new MarsRover(0, 1, Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndBackwardForNorth() throws Exception {
        MarsRover initRover = new MarsRover(0, 0, Direction.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("B");
        MarsRover expectedRover = new MarsRover(0, 0, Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndRightForNorth() throws Exception {
        MarsRover initRover = new MarsRover(0, 0, Direction.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("R");
        MarsRover expectedRover = new MarsRover(0, 1, Direction.E);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndLeftForEast() throws Exception {
        MarsRover initRover = new MarsRover(0, 0, Direction.E);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("L");
        MarsRover expectedRover = new MarsRover(1, 0, Direction.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void movements() throws Exception {
        MarsRover initRover = new MarsRover(0, 0, Direction.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("R");
        commands.add("F");
        commands.add("L");
        commands.add("B");
        commands.add("F");
        commands.add("F");
        commands.add("F");
        commands.add("L");
        commands.add("B");
        commands.add("B");
        commands.add("L");
        commands.add("F");
        commands.add("B");
        commands.add("R");
        MarsRover expectedRover = new MarsRover(3, 3, Direction.W);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }
}
