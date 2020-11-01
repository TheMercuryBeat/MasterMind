package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImplementation;

public class RedoController extends Controller {

    private final SessionImplementation sessionImplementation;

    public RedoController(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
    }

    public void redo() {
        this.sessionImplementation.redo();
    }

    public boolean isRedoable() {
        return this.sessionImplementation.isRedoable();
    }
}
