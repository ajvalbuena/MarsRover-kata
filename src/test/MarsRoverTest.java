package test;

import main.DirectionsEnum;
import main.MarsRover;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void oneStepForwardForNorth() {
        MarsRover initRover = new MarsRover(0, 0, DirectionsEnum.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        MarsRover expectedRover = new MarsRover(0, 1, DirectionsEnum.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndBackwardForNorth() {
        MarsRover initRover = new MarsRover(0, 0, DirectionsEnum.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("B");
        MarsRover expectedRover = new MarsRover(0, 0, DirectionsEnum.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndRightForNorth() {
        MarsRover initRover = new MarsRover(0, 0, DirectionsEnum.N);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("R");
        MarsRover expectedRover = new MarsRover(0, 1, DirectionsEnum.E);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void ForwardAndLeftForEast() {
        MarsRover initRover = new MarsRover(0, 0, DirectionsEnum.E);
        ArrayList commands = new ArrayList<String>();
        commands.add("F");
        commands.add("L");
        MarsRover expectedRover = new MarsRover(1, 0, DirectionsEnum.N);
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }

    @Test
    public void movements() {
        MarsRover initRover = new MarsRover(0, 0, DirectionsEnum.N);
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
        MarsRover finalRover = initRover.move(commands, initRover);
        assertEquals(finalRover.getY(), expectedRover.getY());
        assertEquals(finalRover.getX(), expectedRover.getX());
        assertEquals(finalRover.getDirection(), expectedRover.getDirection());
    }
}
