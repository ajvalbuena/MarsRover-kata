package main;

import java.util.ArrayList;
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

    public void move(ArrayList<String> commands) {
        for (int i = 0; i < commands.size(); i++) {
            if (commands.get(i).equals("F")) {
                this.setY(this.y + 1);
            } else {
                this.setY(this.y - 1);
            }
        }
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

