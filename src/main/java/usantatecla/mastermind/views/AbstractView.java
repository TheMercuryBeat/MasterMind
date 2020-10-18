package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.Logic;

public abstract class AbstractView {

    protected Logic logic;

    public AbstractView(Logic logic) {
        this.logic = logic;
    }

    public void interact() {
        do {
            this.start();
            boolean finished;
            do {
                finished = this.propose();
            } while (!finished);
        } while (this.isNewGame());
    }

    protected abstract void start();

    protected abstract boolean propose();

    protected abstract boolean isNewGame();

}
