package main;
import java.util.List;

public class MarsRover {
    public int x;
    public int y;
    public Directions direction;

    public MarsRover(int x, int y, Directions direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move (List<String> commands){
        this.setY(1);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Directions getDirection() {
        return direction;
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }

}

