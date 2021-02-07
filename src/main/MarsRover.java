package main;

import java.util.ArrayList;

public class MarsRover {
    public int x;
    public int y;
    public DirectionsEnum direction;

    public MarsRover(int x, int y, DirectionsEnum direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(ArrayList<String> commands) {
        for (int i = 0; i < commands.size(); i++) {
            switch (this.getDirection()) {
                case N:
                    this.northStrategy(commands.get(i));
                    break;
                case E:
                    this.eastStrategy(commands.get(i));
                    break;
                default:
                    break;
            }
        }
    }


    private void northStrategy(String command) {
        if (command.equals("F")) {
            this.setY(this.y + 1);
        } else if (command.equals("B")) {
            this.setY(this.y - 1);
        } else if (command.equals("R")) {
            this.setDirection(DirectionsEnum.E);
        } else {
            this.setDirection(DirectionsEnum.W);
        }
    }

    private void eastStrategy(String command) {
        if (command.equals("F")) {
            this.setX(this.x + 1);
        } else if (command.equals("B")) {
            this.setX(this.x - 1);
        } else if (command.equals("R")) {
            this.setDirection(DirectionsEnum.S);
        } else {
            this.setDirection(DirectionsEnum.N);
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

    public DirectionsEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionsEnum direction) {
        this.direction = direction;
    }

}

