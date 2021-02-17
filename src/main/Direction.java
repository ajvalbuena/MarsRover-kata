package main;

import java.util.HashMap;
import java.util.Map;

public abstract class Direction {
    abstract MarsRover turnRight(MarsRover rover);

    abstract MarsRover turnLeft(MarsRover rover);

    abstract MarsRover move(MarsRover rover, Command command);

   public final static Direction N = new Direction() {
       Map<Command, Vector> vectorByCommand = new HashMap<Command, Vector>(){
           {
               super.put(Command.F, new Vector(0,1));
               super.put(Command.B, new Vector(0,-1));
           }
       };


        @Override
        public MarsRover turnLeft(MarsRover rover) {
            return new MarsRover(rover.getPoint(), Direction.W);
        }

        @Override
        public MarsRover turnRight(MarsRover rover) {
            return new MarsRover(rover.getPoint(), Direction.E);
        }

        @Override
        MarsRover move(MarsRover rover, Command command){
            Vector vector = vectorByCommand.get(command);
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }
    };

    public final static Direction S = new Direction() {
        Map<Command, Vector> vectorByCommand = new HashMap<Command, Vector>(){
            {
                super.put(Command.F, new Vector(0,-1));
                super.put(Command.B, new Vector(0,1));
            }
        };
        @Override
        public MarsRover turnRight(MarsRover rover) {
            return new MarsRover(rover.getPoint(), Direction.W);
        }

        @Override
        public MarsRover turnLeft(MarsRover rover) {
            return new MarsRover(rover.getPoint(), Direction.E);
        }

        @Override
        MarsRover move(MarsRover rover, Command command){
            Vector vector = vectorByCommand.get(command);
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }
    };

    public final static Direction E = new Direction() {
        Map<Command, Vector> vectorByCommand = new HashMap<Command, Vector>(){
            {
                super.put(Command.F, new Vector(1,0));
                super.put(Command.B, new Vector(-1,0));
            }
        };
        @Override
        public MarsRover turnRight(MarsRover rover) {
            return new MarsRover(rover.getPoint(), Direction.S);
        }

        @Override
        public MarsRover turnLeft(MarsRover rover) {
            return new MarsRover(rover.getPoint(), Direction.N);
        }

        @Override
        MarsRover move(MarsRover rover, Command command){
            Vector vector = vectorByCommand.get(command);
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }
    };

    public final static Direction W = new Direction() {
        Map<Command, Vector> vectorByCommand = new HashMap<Command, Vector>(){
            {
                super.put(Command.F, new Vector(-1,0));
                super.put(Command.B, new Vector(1,0));
            }
        };
        @Override
        public MarsRover turnRight(MarsRover rover) {
            return new MarsRover(rover.getPoint(), Direction.N);
        }

        @Override
        public MarsRover turnLeft(MarsRover rover) {
            return new MarsRover(rover.getPoint(), Direction.S);
        }

        @Override
        MarsRover move(MarsRover rover, Command command){
            Vector vector = vectorByCommand.get(command);
            return new MarsRover(vector.applyVector(rover), rover.getDirection());
        }
    };



}



