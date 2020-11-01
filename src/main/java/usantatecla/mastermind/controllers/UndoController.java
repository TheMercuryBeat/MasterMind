package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImplementation;

public class UndoController extends Controller {

    private final SessionImplementation sessionImplementation;

    public UndoController(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
    }

    public void undo() {
        this.sessionImplementation.undo();
    }

    public boolean isUndoable() {
        return this.sessionImplementation.isUndoable();
    }
}
