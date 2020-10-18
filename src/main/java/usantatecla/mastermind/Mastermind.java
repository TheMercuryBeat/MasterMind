package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.AbstractView;

public abstract class Mastermind {

    private final Logic logic;
    private final AbstractView abstractView;

    protected Mastermind() {
        this.logic = new Logic();
        this.abstractView = this.createView();
    }

    protected void play() {
        Controller controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.abstractView.interact(controller);
            }
        } while (controller != null);
    }

    protected abstract AbstractView createView();


}