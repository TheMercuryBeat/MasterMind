package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.AbstractView;

public class View extends AbstractView {

    private final StartView startView;
    private final ProposalView proposalView;
    private final ResumeView resumeView;

    public View(Game game) {
        super(game);
        this.startView = new StartView();
        this.proposalView = new ProposalView(this.game);
        this.resumeView = new ResumeView(this.game);
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
