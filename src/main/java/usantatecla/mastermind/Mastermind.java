package usantatecla.mastermind;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.AbstractView;

public abstract class Mastermind {

    private final Logic logic;
    private final AbstractView abstractView;

    protected Mastermind() {
        this.logic = this.createLogic();
        this.abstractView = this.createView();
    }

    protected void play() {
        AcceptorController controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.abstractView.interact(controller);
            }
        } while (controller != null);
    }

    protected abstract Logic createLogic();

    protected abstract AbstractView createView();

}
