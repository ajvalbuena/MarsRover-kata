package main;

public class SystemConsole implements Console {
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
