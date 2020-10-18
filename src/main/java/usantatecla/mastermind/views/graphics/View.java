package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.views.AbstractView;

public class View extends AbstractView {

    private final StartView startView;
    private final ProposalView proposalView;
    private final ResumeView resumeView;

    public View() {
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }

    public void interact(Controller controller) {

    }
}
