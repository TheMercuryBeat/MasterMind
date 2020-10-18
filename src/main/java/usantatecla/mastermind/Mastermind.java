package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.AbstractView;

public abstract class Mastermind {

    private final Logic logic;
    private final AbstractView abstractView;

    protected Mastermind() {
        this.logic = new Logic();
        this.abstractView = this.createView(this.logic);
    }

    protected void play() {
        this.abstractView.interact();
    }

    protected abstract AbstractView createView(Logic logic);


}
