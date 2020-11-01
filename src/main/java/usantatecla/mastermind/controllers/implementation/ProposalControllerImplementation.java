package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.ActionController;
import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.RedoController;
import usantatecla.mastermind.controllers.UndoController;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.models.Session;

public class ProposalControllerImplementation extends ProposalController {

    private final ActionController actionController;
    private final UndoController undoController;
    private final RedoController redoController;

    ProposalControllerImplementation(Session session) {
        super(session);
        this.actionController = new ActionController(this.session);
        this.undoController = new UndoController(this.session);
        this.redoController = new RedoController(this.session);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.actionController.addProposedCombination(proposedCombination);
    }

    public boolean isLooser() {
        return this.actionController.isLooser();
    }

    public boolean isWinner() {
        return this.actionController.isWinner();
    }

    public int getAttempts() {
        return this.actionController.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.actionController.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.actionController.getResult(position);
    }

    public void undo() {
        this.undoController.undo();
    }

    public boolean isUndoable() {
        return this.undoController.isUndoable();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean isRedoable() {
        return this.redoController.isRedoable();
    }

    public void next() {
        this.actionController.next();
    }

}