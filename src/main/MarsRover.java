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
           MarsRover newRover = this.moveRover(commands.get(i), this);
           this.setX(newRover.getX());
           this.setY(newRover.getY());
           this.setDirection(newRover.getDirection());
        }
    }

    private MarsRover moveRover(String command, MarsRover rover) {
        DirectionStrategy directionStrategy = new DirectionStrategy();
        Direction direction = directionStrategy.getDirectionStrategy(this.getDirection());
        if (command.equals("F")) {
            return direction.moveForward(rover);
        } else if (command.equals("B")) {
            return direction.moveBackWard(rover);
        } else if (command.equals("R")) {
            return direction.turnRight(rover);
        } else {
            return direction.turnLeft(rover);
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

    private void southStrategy(String command) {
        if (command.equals("F")) {
            this.setY(this.y - 1);
        } else if (command.equals("B")) {
            this.setY(this.y + 1);
        } else if (command.equals("R")) {
            this.setDirection(DirectionsEnum.W);
        } else {
            this.setDirection(DirectionsEnum.E);
        }
    }

    private void westStrategy(String command) {
        if (command.equals("F")) {
            this.setX(this.x - 1);
        } else if (command.equals("B")) {
            this.setX(this.x + 1);
        } else if (command.equals("R")) {
            this.setDirection(DirectionsEnum.N);
        } else {
            this.setDirection(DirectionsEnum.S);
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

