package usantatecla.utils;

public interface Command {

    void execute();

    boolean isActive();

    String getName();

}
