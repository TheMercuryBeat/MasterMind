package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.AbstractView;

public class View extends AbstractView {

    private final StartView startView;
    private final ProposalView proposalView;
    private final ResumeView resumeView;

    public View(Logic logic) {
        super(logic);
        this.startView = new StartView();
        this.proposalView = new ProposalView(this.logic);
        this.resumeView = new ResumeView(this.logic);
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
