package main;

public enum DirectionsEnum {
    N(new North()),
    S(new South()),
    E(new East()),
    W(new West());


    private Direction direction;

    DirectionsEnum(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
    }

