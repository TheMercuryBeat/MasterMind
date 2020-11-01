package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.InGameController;

import static usantatecla.mastermind.views.MessageView.PROPOSAL_COMMAND;

public class ProposalCommand extends AbstractCommand {

    private final InGameController inGameController;

    public ProposalCommand(InGameController inGameController) {
        super(PROPOSAL_COMMAND.getMessage());
        this.inGameController = inGameController;
    }

    @Override
    public void execute() {
        inGameController.control();
    }

    @Override
    public boolean isActive() {
        return inGameController.isActive();
    }
}
