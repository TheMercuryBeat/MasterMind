package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.InGameController;

import static usantatecla.mastermind.views.MessageView.REDO_COMMAND;

public class RedoCommand extends AbstractCommand {

    private final InGameController inGameController;

    public RedoCommand(InGameController inGameController) {
        super(REDO_COMMAND.getMessage());
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
