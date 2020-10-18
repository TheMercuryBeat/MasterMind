package usantatecla.mastermind.views.graphics;

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
    public void interact(Controller controller) {
    }

    public void visit(StartController startController) {
    }

    public void visit(ProposalController proposalController) {
    }

    public void visit(ResumeController resumeController) {
    }
}
