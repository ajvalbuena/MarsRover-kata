package main;

public abstract class Direction {
    abstract MarsRover turnRight(MarsRover rover);

    abstract MarsRover turnLeft(MarsRover rover);

    abstract MarsRover moveForward(MarsRover rover);

    abstract MarsRover moveBackward(MarsRover rover);

   public final static Direction N = new Direction() {
        @Override
        public MarsRover turnLeft(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY(), Direction.W);
        }

        @Override
        public MarsRover turnRight(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY(), Direction.E);
        }

        @Override
        MarsRover moveForward(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY() + 1, rover.getDirection());
        }

        @Override
        MarsRover moveBackward(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY() - 1, rover.getDirection());
        }
    };

    public final static Direction S = new Direction() {
        @Override
        public MarsRover turnRight(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY(), Direction.W);
        }

        @Override
        public MarsRover turnLeft(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY(), Direction.E);
        }

        @Override
        public MarsRover moveForward(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY() - 1, rover.getDirection());
        }

        @Override
        public MarsRover moveBackward(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY() + 1, rover.getDirection());
        }
    };

    public final static Direction E = new Direction() {
        @Override
        public MarsRover turnRight(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY(), Direction.S);
        }

        @Override
        public MarsRover turnLeft(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY(), Direction.N);
        }

        @Override
        public MarsRover moveForward(MarsRover rover) {
            return new MarsRover(rover.getX() + 1, rover.getY(), rover.getDirection());
        }

        @Override
        public MarsRover moveBackward(MarsRover rover) {
            return new MarsRover(rover.getX() - 1, rover.getY(), rover.getDirection());
        }
    };

    public final static Direction W = new Direction() {
        @Override
        public MarsRover turnRight(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY(), Direction.N);
        }

        @Override
        public MarsRover turnLeft(MarsRover rover) {
            return new MarsRover(rover.getX(), rover.getY(), Direction.S);
        }

        @Override
        public MarsRover moveForward(MarsRover rover) {
            return new MarsRover(rover.getX() - 1, rover.getY(), rover.getDirection());
        }

        @Override
        public MarsRover moveBackward(MarsRover rover) {
            return new MarsRover(rover.getX() + 1, rover.getY(), rover.getDirection());
        }
    };



}



