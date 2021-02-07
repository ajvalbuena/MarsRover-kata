package test;

import main.DirectionsEnum;
import main.MarsRover;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void oneStepForwardForNorth() {
        MarsRover rover = new MarsRover(0, 0, DirectionsEnum.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        MarsRover expectedRover = new MarsRover(0, 1, DirectionsEnum.N);
        rover.move(commands);
        assertEquals(rover.getY(), expectedRover.getY());
        assertEquals(rover.getX(), expectedRover.getX());
        assertEquals(rover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndBackwardForNorth() {
        MarsRover rover = new MarsRover(0, 0, DirectionsEnum.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("B");
        MarsRover expectedRover = new MarsRover(0, 0, DirectionsEnum.N);
        rover.move(commands);
        assertEquals(rover.getY(), expectedRover.getY());
        assertEquals(rover.getX(), expectedRover.getX());
        assertEquals(rover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndRightForNorth() {
        MarsRover rover = new MarsRover(0, 0, DirectionsEnum.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("R");
        MarsRover expectedRover = new MarsRover(0, 1, DirectionsEnum.E);
        rover.move(commands);
        assertEquals(rover.getY(), expectedRover.getY());
        assertEquals(rover.getX(), expectedRover.getX());
        assertEquals(rover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndLeftForEast() {
        MarsRover rover = new MarsRover(0, 0, DirectionsEnum.E);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("L");
        MarsRover expectedRover = new MarsRover(1, 0, DirectionsEnum.N);
        rover.move(commands);
        assertEquals(rover.getY(), expectedRover.getY());
        assertEquals(rover.getX(), expectedRover.getX());
        assertEquals(rover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void movements() {
        MarsRover rover = new MarsRover(0, 0, DirectionsEnum.N);
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
        MarsRover expectedRover = new MarsRover(3, 3, DirectionsEnum.W);
        rover.move(commands);
        assertEquals(rover.getY(), expectedRover.getY());
        assertEquals(rover.getX(), expectedRover.getX());
        assertEquals(rover.getDirection(), expectedRover.getDirection());
    }
}
