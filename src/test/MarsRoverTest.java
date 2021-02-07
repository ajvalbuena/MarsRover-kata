package test;

import main.Directions;
import main.MarsRover;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void oneStepForwardForNorth() {
        MarsRover rover = new MarsRover(0, 0, Directions.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        MarsRover expectedRover = new MarsRover(0, 1, Directions.N);
        rover.move(commands);
        assertEquals(rover.getY(), expectedRover.getY());
        assertEquals(rover.getX(), expectedRover.getX());
        assertEquals(rover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndBackwardForNorth() {
        MarsRover rover = new MarsRover(0, 0, Directions.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("B");
        MarsRover expectedRover = new MarsRover(0, 0, Directions.N);
        rover.move(commands);
        assertEquals(rover.getY(), expectedRover.getY());
        assertEquals(rover.getX(), expectedRover.getX());
        assertEquals(rover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void RightAndForwardForNorth() {
        MarsRover rover = new MarsRover(0, 0, Directions.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("R");
        MarsRover expectedRover = new MarsRover(0, 1, Directions.E);
        rover.move(commands);
        assertEquals(rover.getY(), expectedRover.getY());
        assertEquals(rover.getX(), expectedRover.getX());
        assertEquals(rover.getDirection(), expectedRover.getDirection());
    }
}
