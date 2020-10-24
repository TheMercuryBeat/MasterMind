package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.*;
import usantatecla.mastermind.views.AbstractView;

public class View extends AbstractView implements ControllerVisitor {

    private final StartView startView;
    private final ProposalView proposalView;
    private final ResumeView resumeView;

    public View() {
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(AcceptorController acceptorController) {
        acceptorController.accept(this);
    }

    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    public void visit(ProposalController proposalController) {
        this.proposalView.interact(proposalController);
    }

    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }
}
