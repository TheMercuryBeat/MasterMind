package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;

import static usantatecla.mastermind.views.MessageView.UNDO_COMMAND;

public class UndoCommand extends AbstractCommand {

    public UndoCommand(ProposalController proposalController) {
        super(UNDO_COMMAND.getMessage(), proposalController);
    }

    @Override
    public void execute() {
        this.proposalController.undo();
    }

    @Override
    public boolean isActive() {
        return proposalController.isUndoable();
    }
}
