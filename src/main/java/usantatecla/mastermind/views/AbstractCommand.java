package usantatecla.mastermind.views;

import usantatecla.utils.Command;

public abstract class AbstractCommand implements Command {

    protected String name;

    public AbstractCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
