package usantatecla.mastermind;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.AbstractView;

public abstract class Mastermind {

    private final Game game;
    private final ProposalController proposalController;
    private final ResumeController resumeController;
    private final AbstractView abstractView;

    protected Mastermind() {
        this.game = new Game();
        this.proposalController = new ProposalController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.abstractView = this.createView(this.proposalController, this.resumeController);
    }

    protected void play() {
        this.abstractView.interact();
    }

    protected abstract AbstractView createView(ProposalController proposalController, ResumeController resumeController);


}
