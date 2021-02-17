package main;

public enum DirectionEnum {
    N(DirectionEnum.E, DirectionEnum.W, new Vector(0,1), new Vector(0,-1)),
    S(DirectionEnum.W, DirectionEnum.E, new Vector(0,-1), new Vector(0,1)),
    E(DirectionEnum.S, DirectionEnum.N, new Vector(1,0), new Vector(-1,0)),
    W(DirectionEnum.N, DirectionEnum.S, new Vector(-1,0), new Vector(1,0));

    private DirectionEnum right;
    private DirectionEnum left;
    private Vector forward;
    private Vector backward;

    DirectionEnum(DirectionEnum right, DirectionEnum left, Vector forward, Vector backward) {
        this.right = right;
        this.left = left;
        this.forward = forward;
        this.backward = backward;
    }

    public Vector getBackward() {
        return backward;
    }

    public Vector getForward() {
        return forward;
    }

    public DirectionEnum getRight() {
        return right;
    }

    public DirectionEnum getLeft() {
        return left;
    }
}
