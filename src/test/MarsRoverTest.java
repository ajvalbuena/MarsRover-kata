package test;

import main.Directions;
import main.MarsRover;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void oneStepForward(){
        MarsRover rover = new MarsRover(0,0, Directions.N);
        MarsRover expectedRover = new MarsRover(0,1,Directions.N);
        List<String> commands = new ArrayList<String>();
        commands.add("F");
        rover.move(commands);
        assertEquals(rover.getY(), expectedRover.getY());
    }
}
