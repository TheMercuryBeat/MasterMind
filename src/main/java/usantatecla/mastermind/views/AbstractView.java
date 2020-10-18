package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;

public abstract class AbstractView {

    protected ProposalController proposalController;
    protected ResumeController resumeController;

    public AbstractView(ProposalController proposalController, ResumeController resumeController) {
        this.proposalController = proposalController;
        this.resumeController = resumeController;
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
