package main;

public enum Direction {
    N {
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
    },

    S {
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
    },

    E {
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
    },

    W {
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


    abstract MarsRover turnRight(MarsRover rover);

    abstract MarsRover turnLeft(MarsRover rover);

    abstract MarsRover moveForward(MarsRover rover);

    abstract MarsRover moveBackward(MarsRover rover);
}



