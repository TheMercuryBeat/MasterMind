package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;
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

    @Override
    public void interact(Controller controller) {
        if (controller instanceof StartController) {
            this.startView.interact((StartController) controller);
        } else if (controller instanceof ProposalController) {
            this.proposalView.interact((ProposalController) controller);
        } else {
            this.resumeView.interact((ResumeController) controller);
        }
    }
}
