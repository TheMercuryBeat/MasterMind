package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.AbstractView;

public class View extends AbstractView {

    private final StartView startView;
    private final ProposalView proposalView;
    private final ResumeView resumeView;

    public View(ProposalController proposalController, ResumeController resumeController) {
        super(proposalController, resumeController);
        this.startView = new StartView();
        this.proposalView = new ProposalView(this.proposalController);
        this.resumeView = new ResumeView(this.resumeController);
    }

    @Override
    protected void start() {
        this.startView.interact();
    }

    @Override
    protected boolean propose() {
        return this.proposalView.interact();
    }

    @Override
    protected boolean isNewGame() {
        return this.resumeView.interact();
    }

}
