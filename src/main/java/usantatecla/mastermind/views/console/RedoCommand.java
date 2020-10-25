package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;

import static usantatecla.mastermind.views.MessageView.REDO_COMMAND;

public class RedoCommand extends AbstractCommand {

    public RedoCommand(ProposalController proposalController) {
        super(REDO_COMMAND.getMessage(), proposalController);
    }

    @Override
    public void execute() {
        this.proposalController.redo();
    }

    @Override
    public boolean isActive() {
        return proposalController.isRedoable();
    }
}
