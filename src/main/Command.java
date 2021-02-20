package main;

public enum Command {
    F(new Forward()),
    B(new Backward()),
    L(new TurnLeft()),
    R(new TurnRight());

    public final Movement movement;

    Command(Movement movement) {
        this.movement = movement;
    }

    public Movement getMovement() {
        return movement;
    }
}



