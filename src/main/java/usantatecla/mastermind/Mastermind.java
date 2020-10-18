package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.AbstractView;

public abstract class Mastermind {

    private final Game game;
    private final AbstractView abstractView;

    protected Mastermind() {
        this.game = new Game();
        this.abstractView = this.createView(this.game);
    }

    protected void play() {
        this.abstractView.interact();
    }

    protected abstract AbstractView createView(Game game);


}
