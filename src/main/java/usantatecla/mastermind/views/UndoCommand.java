package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.InGameController;

import static usantatecla.mastermind.views.MessageView.UNDO_COMMAND;

public class UndoCommand extends AbstractCommand {

    private final InGameController inGameController;

    public UndoCommand(InGameController inGameController) {
        super(UNDO_COMMAND.getMessage());
        this.inGameController = inGameController;
    }

    @Override
    public void execute() {
        this.inGameController.control();
    }

    @Override
    public boolean isActive() {
        return this.inGameController.isActive();
    }


}
